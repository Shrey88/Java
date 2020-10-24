package com.oops.inner_classes;

import java.util.Scanner;

public class Local_Inner_Class_Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        // at this point we will create a local class that
        // implements the interface and assign instance of it to
        // our button
        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
