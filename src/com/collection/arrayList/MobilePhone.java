package com.collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static ArrayList<Contacts> contact = new ArrayList<Contacts>();
    private static Scanner scanner = new Scanner(System.in);

    public void newContact(){
        System.out.print("Enter Name : ");
        String name = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter No : ");
        String phoneNo = scanner.nextLine();

        if(storeNewContact(name, phoneNo) == 0){
            System.out.println("Contact Added Successfully");
        }else{
            System.out.println("Contact Already Exist");
        }
    }

    public void modifyContact(String existingName){
        modifyExistingContact(existingName);
    }

    public void removeContact(String existingName){
        removeExistingContact(existingName);
    }

    public Contacts queryContact(String existingContact){
        return queryPhoneBook(existingContact);
    }

    private int storeNewContact(String name, String phoneNo){
        if(queryContact(name) != null){
            return 1;
        }else{
            contact.add(new Contacts(name, phoneNo));
            return 0;
        }
    }

    private void modifyExistingContact(String existingName){

        if(contact.size() > 0) {
            Contacts existingContact;

            System.out.println("Choose Option : ");
            chooseEditOption();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    existingContact = queryContact(existingName);
                    if (existingContact != null) {
                        System.out.print("Enter New Name : ");
                        String newName = scanner.nextLine();
                        Contacts checkContact = queryContact(newName);
                        if(checkContact == null) {
                            existingContact.setContactName(newName);
                        }else{
                            System.out.println("Contact with the same name already exist");
                        }
                    }
                    break;
                case 2:
                    existingContact = queryContact(existingName);
                    if (existingContact != null) {
                        System.out.print("Enter New No : ");
                        String newNo = scanner.nextLine();
                        existingContact.setContactNo(newNo);
                    }
                    break;
                case 3:
                    existingContact = queryContact(existingName);
                    if (existingContact != null) {
                        System.out.print("Enter New Name : ");
                        String newName = scanner.nextLine();
                        System.out.println("");
                        System.out.print("Enter New No : ");
                        String newNo = scanner.nextLine();
                        System.out.println("");
                        Contacts checkContact = queryContact(newName);
                        if(checkContact == null) {
                            existingContact.setContactName(newName);
                            existingContact.setContactNo(newNo);
                        }else{
                            System.out.println("Contact with the same name already exist");
                        }
                    }
                    break;
                case 4:
                    break;
            }
        }else{
            System.out.println("Contact List is Empty");
        }
    }

    private void removeExistingContact(String existingName){
        System.out.println(contact.size() + " Contacts Available");
        for(int i = 0; i < contact.size(); i++){
            if(contact.get(i).getContactName().compareTo(existingName) == 0){
                contact.remove(i);
            }
        }
    }

    private Contacts queryPhoneBook(String existingName){
        for(int i = 0; i < contact.size(); i++){
            if(contact.get(i).getContactName().compareTo(existingName) == 0 ){
                return contact.get(i);
            }
        }
        return null;
    }


    private void chooseEditOption(){
        System.out.println("\t 1 - Modify Name");
        System.out.println("\t 2 - Modify Phone No");
        System.out.println("\t 3 - Modify Name and Phone No");
        System.out.println("\t 4 - Exit");
    }


}
