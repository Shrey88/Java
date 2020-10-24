package com.java_basics;

import java.util.Scanner;

/*
 *  read 10 numbers from the user and do the type check if the entered
 *  number is int, if not then continue the loop till you get 10 numbers
 */
public class reading_user_input_1 {

    public static void main(String[] args) {
        int iNo = 1;

        while (iNo < 10){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number #" + iNo + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                ++iNo;
            }
        }
    }
}
