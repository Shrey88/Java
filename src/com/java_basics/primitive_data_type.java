package com.java_basics;

import com.sun.jdi.ShortType;

public class primitive_data_type {
    public static void main(String[] args){
        /*
         *  java uses the concept of a wrapper class for all the eight primitive types-
         *  In case of an int we can use Integer, and by doing that it gives us ways to
         *  perform operations on an int
         *
         *  In this case, we are using the MIN_VALUE and MAX_VALUE to get Java to tell us
         *  the minimum and maximum ranges of numbers that can be stored.
         */
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value : " + minValue);
        System.out.println("Integer Maximum Value : " + maxValue);

        /*
         *  if you try to put value larger than the maximum value in java, then you will
         *  get an overflow in this case.
         */
        System.out.println("Overflow Value : " + (maxValue + 1) );

        /*
         *  if you try to put value smaller than the minimum value in java, then you will
         *  get an underflow in this case.
         */
        System.out.println("Underflow Value : " + (minValue - 1) );

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value : " + minByteValue);
        System.out.println("Byte Maximum Value : " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value : " + minShortValue);
        System.out.println("Short Maximum Value : " + maxShortValue);

        /*
         *  when you are declaring the long value you need to append the value with "L"
         *  compiler will interpret it as long
         *  e.g. long test = 100L;
         */
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value : " + minLongValue);
        System.out.println("Long Maximum Value : " + maxLongValue);

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value : " + minFloatValue);
        System.out.println("Float Maximum Value : " + maxFloatValue);
        
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value : " + minDoubleValue);
        System.out.println("Double Maximum Value : " + maxDoubleValue);
    }
}
