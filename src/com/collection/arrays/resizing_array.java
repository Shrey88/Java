package com.collection.arrays;

import java.util.Scanner;

public class resizing_array {
    private static Scanner scanner = new Scanner(System.in);

    private static int[] baseData = new int[10];
    private static int i = 0;

    public static void main(String[] args){

        System.out.println("Enter 10 integers : ");
        getInput();
        printArray();
        resize_Array();
        getInput();
        printArray();
    }

    private static void getInput(){
        for(; i < baseData.length; i++){
            System.out.print("#" + i + " : " );
            baseData[i] = scanner.nextInt();
            scanner.nextLine(); // to handle the return character.
        }
        // resetting the value of i
        i = 0;
    }

    private static void printArray(){
        for(int i = 0; i < baseData.length; i++){
            System.out.println("#"+i+" : " + baseData[i]);
        }
    }

    private static void resize_Array(){
        System.out.print("Enter the new size of the array : ");
        int resize = scanner.nextInt();
        scanner.nextLine();

        int[] origData = baseData;

        baseData = new int[resize];
        for(; i < origData.length; i++){
            baseData[i] = origData[i];
        }
    }

}
