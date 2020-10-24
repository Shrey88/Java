package com.oops.challenge;

import java.util.logging.Handler;

public class Main {

    public static void main(String[] args) {

        HamBurger hamBurger = new HamBurger("White", "Sausage");
        hamBurger.addLettuce();
        hamBurger.addOnion();
        hamBurger.addTomato();
        hamBurger.finalOrder();

        System.out.println("");

        Deluxe deluxe = new Deluxe("Parmesan", "Kebab");
        deluxe.add_chips();
        deluxe.add_coke();
        deluxe.addLettuce();
        deluxe.finalOrder();

        System.out.println("");

        Healthy healthy = new Healthy("Wheat", "Tandoori Chicken");
        healthy.add_jalpenos();
        healthy.add_olives();
        healthy.addCarrot();
        healthy.addLettuce();
        healthy.addOnion();
        healthy.addTomato();
        healthy.finalOrder();



    }
}
