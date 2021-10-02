package com.nicollefavero.expection;

public class InvalidTriangleSideValueException extends Exception {

    public InvalidTriangleSideValueException() {
        super("Triangle Side Value can not be zero or negative number");
    }
}
