package com.oops.creation_init_of_class;

public class CarMain {
    public static void main(String[] args) {

        // initializing the class by creating the object of Car
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
