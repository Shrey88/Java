package com.oops.encapsulation;

/*
 *  Encapsulation:
 *      encapsulation is the mechanism that allows you to restrict
 *      access to certain components in the objects that you are creating
 *
 *      so you are able to protect the members of a class from the external access
 *      in order to really guard against unauthorized access.
 *
 *      we are stopping the outsiders, in other words classes or code outside of the class
 *      that you're working on, from accessing the inner working of a class
 */
public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        /*
         *  we are able to access this outside the class because we have set
         *  the access modifier to public
         */
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.health = 100;    // field being public can be changed outside the class which is wrong
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());


        /*
         *  Class created by implementing encapsulation
         *
         *  you will not be able to access the class fields as they are private to class
         */
        EnhancedPlayer player1 = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player1.getHealth());


    }
}
