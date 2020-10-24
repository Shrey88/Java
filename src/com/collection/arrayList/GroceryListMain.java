package com.collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit){
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list ");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please add the grocery Item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number : ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item numbers: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem(){
        System.out.println("Enter Item to search for : ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in out grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    /*
     *  if you want to copy one array list to another array list
     */
    public static void processArrayList(){
        // one way of doing it
        ArrayList<String> newArray = new ArrayList<String>(groceryList.getGroceryList());

        //another way of doing it is
        ArrayList<String> newArray1 = new ArrayList<String>();
        newArray1.addAll(groceryList.getGroceryList());

        // third way of doing it is
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
