package com.oops.inner_classes;

/*
 *  So there are four types of nested classes that you can use.
 *
 *      Static Nested class
 *
 *      Non-Static nested class ( we call it inner class)
 *
 *      we use local class, now that's an inner class that's
 *      defined inside of a scope block which is usually method
 *
 *      anonymous class which is a nested class without a class name
 */
public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);

        // gear is an inner class to gearbox, we need to specify the outer
        // class GearBox
        // without creating the instance of the gearbox you cannot create
        // instance of the Gear class
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);

        // this will give you an error saying that GearBox is not an enclosing
        // class
        // so you basically need to use the .new back referencing the outer class.
        //GearBox.Gear second = new GearBox.Gear(1,1.2);

        System.out.println(first.driveSpeed(1000));
    }
}
