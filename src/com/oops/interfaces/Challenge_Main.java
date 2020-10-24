package com.oops.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge_Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Player shrey = new Player("Tim", 10, 15);
        System.out.println(shrey.toString());

        saveObject(shrey);
        shrey.setHitPoints(0);
        System.out.println(shrey);
        shrey.setWeapon("Stormbringer");
        saveObject(shrey);
        //loadObject(shrey);
        //System.out.println(shrey);

        ISaveable shruti = new Player("Shruti", 10, 15);
        System.out.println(shruti.toString());

        // we created a object of class Player
        // but it got type casted to ISaveable as the object
        // so to call the methods of the class Player you need to do type cast
        System.out.println( "Strength = " + ((Player)shruti).getStrength() );

        /*
         *  Note :
         *      if you want to declare a variable that can hold objects of different types
         *  then it would have to be of type of common interface (like how we declare shruti object)
         *
         *      but if you want to access methods that exist in the class
         *  like we wanted to access the getStrength method that are not part of the interface, then
         *  object will have to be declared as the class type itself.
         *
         */
    }

    public static List<String> readValues(){
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        Boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");

        while(!quit){
            System.out.println("Choose an option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1 :
                    System.out.print("Enter a string : ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    /*
     *  here we are passing the parameter as ISaveable interface
     *  and by doing that we can actually use any object that is using
     *  this interface, that has implemented this interface class.
     *
     *  so we can be quite generic.
     *
     *  parameters to methods that have been declared as the interface type are automatically cast
     *  from the class type for us.
     */
    public static void saveObject(ISaveable objectToSave){

        /*
         *  here by calling write the no of size we just want to print on the screen
         *  what values are saved on the list.
         *
         *  we could have printed the same message from the write method when we are adding
         *  the values to the List.
         */
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        /*
         *  here we are trying to take input the values from the command line
         *  and inserting it to the list and returning the same list.
         *
         *  the returned list is used to update the same class object with the latest values
         *  which we got from the user.
         */
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
