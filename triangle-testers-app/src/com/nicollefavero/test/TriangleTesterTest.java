package com.nicollefavero.test;

import com.nicollefavero.triangle.TriangleTester;
import com.nicollefavero.expection.InvalidTriangleSideValueException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTesterTest {

    protected TriangleTester triangleTester = new TriangleTester();

    // Testes para triangulo
    @Test
    public void sideValuesFormATriangleTest() throws InvalidTriangleSideValueException {
        int a = 3, b = 7, c = 9;

        assertTrue(triangleTester.isTriangle(a, b, c));
    }

    @Test
    public void sideValuesDoesNotFormATriangleTest() throws InvalidTriangleSideValueException {
        int a = 1, b = 1, c = 1;

        assertTrue(triangleTester.isTriangle(a, b, c));
    }

    // Teste para triangulo escaleno
    @Test
    public void checkAValidScaleneTriangleTest() throws InvalidTriangleSideValueException {
        int a = 3, b = 7, c = 9;

        assertTrue(triangleTester.isTriangle(a, b, c));
        assertTrue(triangleTester.isScaleneTriangle(a, b, c));
    }

    // Testes para triangulo isósceles
    @Test
    public void checkIfTriangleIsAValidIsoscelesFirstTest() throws InvalidTriangleSideValueException {
        int a = 10, b = 10, c = 12;

        assertTrue(triangleTester.isTriangle(a, b, c));
        assertTrue(triangleTester.isIsoscelesTriangle(a, b, c));
    }

    @Test
    public void checkIfTriangleIsAValidIsoscelesSecondTest() throws InvalidTriangleSideValueException {
        int a = 10, b = 12, c = 10;

        assertTrue(triangleTester.isTriangle(a, b, c));
        assertTrue(triangleTester.isIsoscelesTriangle(a, b, c));
    }

    @Test
    public void checkIfTriangleIsAValidIsoscelesThirdTest() throws InvalidTriangleSideValueException {
        int a = 12, b = 10, c = 10;

        assertTrue(triangleTester.isTriangle(a, b, c));
        assertTrue(triangleTester.isIsoscelesTriangle(a, b, c));
    }

    // Teste para triangulo equilátero
    @Test
    public void checkIfTriangleIsAValidEquilateral() throws InvalidTriangleSideValueException {
        int a = 10, b = 10, c = 10;

        assertTrue(triangleTester.isTriangle(a, b, c));
        assertTrue(triangleTester.isEquilateralTriangle(10, 10, 10));
    }


    // Testes com os lado do triangulo valendo zero
    @Test(expected = InvalidTriangleSideValueException.class)
    public void checkIfSideValuesFormATriangleButOneValueIsZeroTest() throws InvalidTriangleSideValueException {
        int a = 0, b = 5, c = 9;

        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test(expected = InvalidTriangleSideValueException.class)
    public void checkIfSideValuesFormATriangleButTwoValuesAreZeroTest() throws InvalidTriangleSideValueException {
        int a = 0, b = 0, c = 9;

        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test(expected = InvalidTriangleSideValueException.class)
    public void checkIfSideValuesFormATriangleButAllValuesAreZeroTest() throws InvalidTriangleSideValueException {
        int a = 0, b = 0, c = 0;

        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    // Testes com os valores do lado do triangulo valendo negativo
    @Test(expected = InvalidTriangleSideValueException.class)
    public void checkIfSideValuesFormATriangleButOneValueIsNegativeTest() throws InvalidTriangleSideValueException {
        int a = -3, b = 7, c = 9;

        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test(expected = InvalidTriangleSideValueException.class)
    public void checkIfSideValuesFormATriangleButTwoValuesAreNegativeTest() throws InvalidTriangleSideValueException {
        int a = -3, b = -7, c = 9;

        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test(expected = InvalidTriangleSideValueException.class)
    public void checkIfSideValuesFormATriangleButAllValuesAreNegativeTest() throws InvalidTriangleSideValueException {
        int a = -3, b = -7, c = -9;

        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    // Testes para casos em que a soma de dois lados é igual ao terceiro lado
    @Test
    public void sumOfTwoSidesIsEqualToTheThirdSideFirstTest() throws InvalidTriangleSideValueException {
        int a = 3, b = 6, c = 9;

        assertEquals(c, (a + b));
        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test
    public void sumOfTwoSidesIsEqualToTheThirdSideSecondTest() throws InvalidTriangleSideValueException {
        int a = 3, b = 9, c = 6;

        assertEquals(b, (a + c));
        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test
    public void sumOfTwoSidesIsEqualToTheThirdSideThirdTest() throws InvalidTriangleSideValueException {
        int a = 6, b = 3, c = 9;

        assertEquals(c, (a + b));
        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test
    public void sumOfTwoSidesIsEqualToTheFourthSideFirstTest() throws InvalidTriangleSideValueException {
        int a = 6, b = 9, c = 3;

        assertEquals(b, (a + c));
        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test
    public void sumOfTwoSidesIsEqualToTheThirdSideFifthTest() throws InvalidTriangleSideValueException {
        int a = 9, b = 3, c = 6;

        assertEquals(a, (b + c));
        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    @Test
    public void sumOfTwoSidesIsEqualToTheThirdSideSixthTest() throws InvalidTriangleSideValueException {
        int a = 9, b = 6, c = 3;

        assertEquals(a, (b + c));
        assertFalse(triangleTester.isTriangle(a, b, c));
    }

    // Teste para o caso em que a soma de dois lados é menor que o terceiro lado
    @Test
    public void sumOfTwoSidesIsLessThanTheThirdTest() throws InvalidTriangleSideValueException {
        int a = 3, b = 5, c = 9;

        assertTrue(c > (a + b));
        assertFalse(triangleTester.isTriangle(a, b, c));
    }
}
