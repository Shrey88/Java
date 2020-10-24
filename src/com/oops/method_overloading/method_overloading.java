package com.oops.method_overloading;

/*
 *  Method overloading:
 *
 *  Java developers often refer to overloading as Compile time Polymorphism
 *
 *  we can overload static and instance methods
 *
 *  usually overloading happens inside a single class, but a method can also be treated as overloaded in the subclass
 *  of that class.
 *  This is because subclass inherits one version of the method from the parent class and then the subclass can
 *  have another overloaded version of the method.
 *
 *  Rules:
 *      Methods must have the same method name
 *
 *      Methods must have the different parameters.
 *
 *      if methods follow the above rules then they may or may not
 *          have different return types.
 *
 *          have different access modifiers
 *
 *          throw a different checked or unchecked exceptions
 */
public class method_overloading {
    public static void main(String[] args){
        int newScore = calculateScore("Shreyas", 500);
        System.out.println("New Score is : " + newScore );

        int newScore1 = calculateScore(400);
        System.out.println("New Score is : " + newScore1);

       calculateScore();

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // overloaded method with one argument
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    // overloaded method with no argument
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

}
