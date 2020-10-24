package com.oops.encapsulation;

/*
 *  Class implements the encapsulation by declaring the fields
 *  as private which are accessible only in the class and not outside
 *  the class.
 */
public class EnhancedPlayer {

    private String fullName;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;

        if(health > 0 && health <= 100){
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player Knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return health;
    }
}
