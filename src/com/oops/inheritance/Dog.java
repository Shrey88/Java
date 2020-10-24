package com.oops.inheritance;

/*
 *  Inheritance :
 *      Dog extends from Animal meaning Dog is a Animal
 *      So there's Is-A relationship between the two
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(){
        System.out.println("Default Dog Constructor called");
    }
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);    // super calls the Base class constructor matching the parameters
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        System.out.println("Parameterized Dog Constructor called");
    }

    private void chew(){
        System.out.println("Dog.chew() method is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() method is called");
        chew();
        super.eat();
    }
}
