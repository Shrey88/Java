package com.generics;

import java.util.ArrayList;

/*
 *  we are telling java that the type parameter we'll accept for this class when using generics,
 *  is gonna be any type that extends from player or subclass of player.
 *
 *  so typing like this extends Player, Player is set to be the upper bound of T.
 *  so now if we attempt to use any class in other words that is not derived from Player
 *  class, we are gonna get that error.
 *
 *
 *  if you are specifying the multiple bounds, then the class must be listed first because otherwise
 *  Java's gonna raise an error when you are trying to actually compile it.
 *  In other words class first and then interfaces.
 *  for e.g. public class Team<T extends Player & Coach & Manager> {}
 *
 *  so we are going to implement the compareTo method for this class using generic class
 *  and also overrride the the  compareTo method.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    /*
     *  you can now see in this method we are accepting the parameter of type player
     *  which is actually going to enable us with one call, to actually pass a baseball player,
     *  football player, or soccer player.
     *
     *  We are able to do that because we are using an abstract class and we are using a generics here
     *  for the array list definition of type player.
     *
     *  as we have declared the player of type T we need to cast the object first before calling any of
     *  its method.
     *
     *  we need the ability to restrict the type that can be provided for this T argument.
     *  Java provides mechanism for restricting the types that can be used as type arguments.
     *  They  are actually called as bounded type parameters.
     *
     *  by using those you can provide them with an upper bound.
     *
     *  casting of the object(player) to Player class is not required if you have set the upper bound
     */
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println( player.getName() + "is already on this team");
            return false;
        }else {
            members.add(player);
            System.out.println( player.getName() + " picked for team" + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message  = " defeated ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else{
            lost++;
            message = " lost to ";
        }

        played++;

        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResults(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking())
        {
            return 1;
        } else {
            return 0;
        }
    }
}
