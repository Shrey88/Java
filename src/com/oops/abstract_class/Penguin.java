package com.oops.abstract_class;

public class Penguin extends Bird{

    public Penguin(String name ){
        super(name);
    }

    /*
     *  interface method that has been implemented in the bird class can be overridded
     *  here as well.
     */
    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not good at this, can i go for swim instead");
    }
}
