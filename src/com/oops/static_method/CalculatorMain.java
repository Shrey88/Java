package com.oops.static_method;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator.printSum(5, 10);
        printHello();   // since the printHello is in the same class no need of class name
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}

