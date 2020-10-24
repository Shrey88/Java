package com.oops.static_method;

/*
 *  static methods are declared using a static modifier.
 *
 *  static methods can't access instance methods and instance
 *  variables directly.
 *
 *  they are usually used for operations that don't require
 *  any data from an instance of the class(from 'this')
 *
 *  in static methods we can't use this keyword
 *
 *  whenever you see a method that does not use instance
 *  variables, then that method should be declared as static method.
 *
 *  for e.g. main is static method and it is called by the JVM when
 *  it starts an application.
 */
public class Calculator {

    private int a;
    private int b;

    public static void printSum(int a, int b){
        System.out.println("Sum = " + (a+b));
    }

    public int sub(int a, int b){
        return (Math.abs(a-b));
    }


    // static methods can't access instance methods
//    public static void printSub(int a, int b){
//        System.out.println("Substraction = " + sub(a, b));
//    }


    // static methods can't access instance variables directly
//    public static void printValue(){
//        System.out.println("Value of a = " + a );
//        System.out.println("Value of b = " + b );
//    }

}

