package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // determine range of primitive type, wrapperClass.constant
        // 32 bits 2s complement
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("int min: " + myMinIntValue + " int max: " + myMaxIntValue );

        // test int overflow
        int overflowMaxValue = myMaxIntValue + 1; // overflows with no error or warning, underflow works the same
        System.out.println(overflowMaxValue);

        // int test = 2147483648; will throw error

        // 8 bits
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;

        System.out.println("byte min: " + myMinByte + " byte max: " + myMaxByte );

        // 16 bits
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        System.out.println("short min: " + myMinShort + " short max: " + myMaxShort);

        // 64 bits
        long myLongValue = 100L; // use L when assigning long. Default numeric literal is treated by int in java

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("long min: " + myMinLongValue + " long max: " + myMaxLongValue);

        byte byteValue = 100;
        short shortValue = 130;
        int intValue = 32768;

        long myLong = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(myLong);

    }
}
