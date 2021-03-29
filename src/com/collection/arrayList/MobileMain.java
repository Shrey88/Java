package com.collection.arrayList;

import com.oops.polymorphism.Movie;

import java.util.Scanner;

public class MobileMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        String existingName;

        while(!quit){
            chooseOption();
            System.out.print("Choose Option : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    mobile.newContact();
                    break;
                case 2:
                    System.out.print("Enter existing name : ");
                    existingName = scanner.nextLine();
                    mobile.modifyContact(existingName);
                    break;
                case 3:
                    System.out.print("Enter existing name : ");
                    existingName = scanner.nextLine();
                    mobile.removeContact(existingName);
                    break;
                case 4:
                    System.out.print("Enter existing name : ");
                    existingName = scanner.nextLine();
                    Contacts existingContact = mobile.queryContact(existingName);
                    if(existingContact != null) {
                        System.out.println("Contact Found");
                        System.out.println("Name : " + existingContact.getContactName());
                        System.out.println("No : " + existingContact.getContactNo());
                    }else{
                        System.out.println("Not Available in Contacts");
                    }
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void chooseOption(){
        System.out.println("\t 1 - Add Contact");
        System.out.println("\t 2 - Modify Contact");
        System.out.println("\t 3 - Remove Contact");
        System.out.println("\t 4 - Query Contact");
        System.out.println("\t 5 - Exit");
    }
}
