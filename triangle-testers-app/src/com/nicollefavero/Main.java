package com.nicollefavero;

import com.nicollefavero.expection.InvalidTriangleSideValueException;
import com.nicollefavero.triangle.TriangleTester;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TriangleTester triangleTester = new TriangleTester();

        System.out.println("\nInsira o valor inteiro para o lado 'a': ");
        int a = scanner.nextInt();

        System.out.println("\nInsira o valor inteiro para o lado 'b': ");
        int b = scanner.nextInt();

        System.out.println("\nInsira o valor inteiro para o lado 'c': ");
        int c = scanner.nextInt();

        boolean isTriangle = false;
        try{
            isTriangle = triangleTester.isTriangle(a, b, c);
        } catch (InvalidTriangleSideValueException e) {
            System.out.println(e.getMessage());
        }

        if (isTriangle){
            System.out.print("\nOs valores inseridos formam um triangulo ");

            if (triangleTester.isIsoscelesTriangle(a, b, c)){
                System.out.print("ISOSCELES");
            } else if (triangleTester.isEquilateralTriangle(a, b, c)){
                System.out.print("EQUILATERO");
            } else if (triangleTester.isScaleneTriangle(a, b, c)){
                System.out.println("ESCALENO");
            }
        } else {
            System.out.println("\nOs valores inseridos NÃO formam um triangulo");
        }
    }
}
