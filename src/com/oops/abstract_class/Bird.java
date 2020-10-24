package com.oops.abstract_class;


public class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in , breathe our, repeat");
    }

    /*
     *  we can make the bird class abstract here to include the fly method.
     *
     *  This is only when you don't implement the CanFly methods here.
     */
    //public abstract void fly();


    /*
     *  Implementing the interface CanFly method
     */

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping");
    }
}
