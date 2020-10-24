package com.oops.composition;

public class PCMain {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        /*
         *  here we are creating the object on fly
         */
        Monitor monitor = new Monitor("24 inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);

        /*
         *  now to access the method that are in the base classes
         *  so we are accessing them via thePC object.
         *  so this is what composition is, this is the difference
         *  between inheritance and composition
         */
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
        System.out.println("");

        /*
         *  In PC_1 we have hidden the functionality
         */
        PC_1 thePC_1 = new PC_1(theCase, monitor, motherboard);
        thePC_1.powerUp();

    }
}
