package com.java_basics;

import java.util.Scanner;

/*
 *  reading the user input
 */
public class reading_user_input {
    public static void main(String[] args) {
        /*
         *  Scanner class is used to read the user input
         */
        Scanner scanner = new Scanner(System.in);   // System.in allows you to type in console

        System.out.println("Enter your year of birth : ");

        /*
         * this method allows to do the type check if the value entered is
         * int or not
         */
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){

            int yearofBirth = scanner.nextInt();

            /*
             *  check if the year of birth is positive integer
             */
            if(yearofBirth >= 0){
                /*
                 *  after inputting the age we press enter and that enter is treated as
                 *  input by the scanner.nextLine() for name and that is why it won't prompt
                 *  you to enter your name and continue with the next statements
                 *  so to avoid that we are adding one more scanner.nextLine() to handle the
                 *  enter key.
                 */
                scanner.nextLine(); // handle next line character (enter key)

                System.out.println("Enter your name : ");
                String name = scanner.nextLine();

                int age = 2020 -yearofBirth;

                System.out.println("Your name is " + name + " and you are " + age + " years old");
            }else {
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Value entered is not of type Int");
        }

        scanner.close();

    }
}
