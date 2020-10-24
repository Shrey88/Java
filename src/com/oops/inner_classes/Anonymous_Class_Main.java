package com.oops.inner_classes;

//  anonymous class is also local class, but it's got no name
//  They have to be declared and instantiated at the same time
//  because they haven't got any name
//  if we have several buttons that each would require a different on-click
//  method.
//  so using a local class might not be the better solution.
//  if you got four or five buttons on the screen, chances are you don't
//  want the exact same functionality to be called each time that button is clicked.
//  for example one button is to quit out of the program, another one might be to print
//  something
//  for the code to actually execute, it might be different depending on the button.
//  this is where an anonymous class can come into use or can become quite handy because
// what we could do in that example is, rather than define a class for each button,
// we could use an anonymous inner class to declare an object and assign it to a button.

import java.util.Scanner;

public class Anonymous_Class_Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked\n");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            System.out.println("1 : Button Click");
            System.out.println("0 : quit");
            System.out.println("Enter your choice : ");
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
