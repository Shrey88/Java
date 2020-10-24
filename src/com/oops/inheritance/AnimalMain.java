package com.oops.inheritance;

public class AnimalMain {
    public static void main(String[] args) {
        /*
         *  Parameterized Animal constructor will be called
         */
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        System.out.println("");


        /*
         *  Parameterized Animal constructor will be called
         *  Parameterized Dog constructor will be called
         */
        Dog dog = new Dog("YorkiE", 8, 20, 2, 4, 1, 20, "long silky");
        System.out.println("");


        /*
         *  dog.eat method will be called
         *  dog.chew method will be called
         *  animal.eat method will be called
         */
        dog.eat();
        System.out.println("");

        /*
         *
         *  default constructor of Animal will be called which will internally call its parameterized constructor
         *  so that is why it is printing
         *      first - Parameterized constructor of Animal
         *      second - then it prints the message of the default constructor
         *  default constructor of Dog is called
         *
         *   animal object referencing the address of Dog
         *      since the method is overridden in the derived class it will call the method from the Dog class
         *      it will call dog.chew method
         *      then at last it will call the base class eat method.
         */
        Animal animal1 = new Dog();
        animal1.eat();
    }
}
