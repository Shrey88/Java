package com.oops.inner_classes;

import java.util.ArrayList;
import java.util.List;

public class GearBox {
    private List<Gear> gears;
    private int maxGears;
    private int gearNumber = 0;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear{
        /*
         *  instances of the gear class have got access to all the methods
         *  of fields of the outer gearbox class, even those mark as private.
         */

        /*
         *  if a word or variable or parameter names is the same one as the one
         *  that's in the outer class.
         *
         *  it's said to shadow the declaration of the outer class or in the outer class
         *  so the gearNumber here is shadowing gearNumber in the gearbox class which is that
         *  one there.
         */
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }
}
