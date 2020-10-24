package com.packages.challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum : ");
        for(int i = 0; i <= 10; i++ ){
            System.out.println(Series.nSum(i));
        }

        System.out.println("\n\nFactorial : ");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.factorial(i));
        }

        System.out.println("\n\nFibonacci Series :");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
