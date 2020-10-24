package com.oops.abstract_class;

public class Parrot extends Bird{

    Parrot(String name){
        super(name);
    }

    /*
     *  This is not required if you are implementing the CanFly interface.
     */
//    @Override
//    public void fly() {
//        System.out.println("Flitting from branch to branch");
//    }
}
