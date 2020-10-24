package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<S extends Team> {
    public String name;
    ArrayList<S> league = new ArrayList<S>();

    public LeagueTable(String name){
        this.name = name;
    }


    public boolean addTeam(S team){
        if(league.contains(team)) {
            System.out.println("Team is already in the League Table List");
            return false;
        }else{
            System.out.println("Adding team " + team.getName() + " in the League Table Llist");
            league.add(team);
            return true;
        }
    }

    public void displayTeams(){
        /*
         *  this Collections.sort method make use of the overridden compareTo method
         */
        Collections.sort(league);

        for(S s : league){
            System.out.println(s.getName() + ": " + s.ranking());
        }
    }


}