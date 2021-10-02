package com.nicollefavero.triangle;

import com.nicollefavero.expection.InvalidTriangleSideValueException;

public class TriangleTester {

    public boolean isTriangle(int a, int b, int c) throws InvalidTriangleSideValueException {
        if(a <  1 || b < 1 || c < 1)
            throw new InvalidTriangleSideValueException();
        return a < (b + c) && b < (a + c) && c < (a + b);
    }

    public boolean isIsoscelesTriangle(int a, int b, int c){
        return (a == b && a != c) || (a == c && a != b) || (c == b && c != a);
    }

    public boolean isScaleneTriangle(int a, int b, int c){
        return (a != b && b != c && c != a);
    }

    public boolean isEquilateralTriangle(int a, int b, int c){
        return (a == b && b == c);
    }
}
