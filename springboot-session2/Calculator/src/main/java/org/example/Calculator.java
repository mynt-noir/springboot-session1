package org.example;

public class Calculator {
    public boolean status = false;

    public boolean isOn() {
        return status;
    }

    public boolean isOff() {
        return !status;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    // ##### SUM #####
    public int sum(int a, int b) {
        return a+b;
    }

    public double sum(double a, double b) {
        return a+b;
    }

    public float sum(float a, float b) {
        return (a+b);
    }

    public long sum(long a, long b) {
        return a+b;
    }

    public short sum(short a, short b) {
        return (short) (a+b);
    }

    // ##### DIFFERENCE #####
    public int subtract(int a, int b) {
        return a-b;
    }

    public double subtract(double a, double b) {
        return a-b;
    }

    public float subtract(float a, float b) {
        return a-b;
    }

    public long subtract(long a, long b) {
        return a-b;
    }

    public short subtract(short a, short b) {
        return (short) (a-b);
    }

    // ##### PRODUCT #####
    public int multiply(int a, int b) {
        return a*b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public float multiply(float a, float b) {
        return a*b;
    }

    public long multiply(long a, long b) {
        return a*b;
    }

    public short multiply(short a, short b) {
        return (short) (a*b);
    }

    // ##### QUOTIENT #####
    public int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a/b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return -1;
        }
        return a/b;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            return -1;
        }
        return (float) (a/b);
    }

    public long divide(long a, long b) {
        if (b == 0) {
            return -1;
        }
        return a/b;
    }


    public short divide(short a, short b) {
        if (b == 0) {
            return -1;
        }
        return (short) (a/b);
    }
//
//    public int modulo(int a, int b) {
//        return a%b;
//    }

}
