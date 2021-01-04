package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // determine range of primitive type, wrapperClass.constant
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("int min: " + myMinIntValue + " int max: " + myMaxIntValue );

        // test int overflow
        int overflowMaxValue = myMaxIntValue + 1; // overflows with no error or warning, underflow works the same
        System.out.println(overflowMaxValue);

        // int test = 2147483648; will throw error

    }
}
