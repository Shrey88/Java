package com.generics;

import javax.sql.rowset.BaseRowSet;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Bekham");

        //  earlier we didn't make the Team class as generic and it was accepting
        //  any type of object.
        //  after making the class of type T it will only allow the objects of that
        //  particular type to be inserted into the Team object.
        Team<FootballPlayer> adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(adelaideCrows.numPlayers());

        // as we have set Player to be the upper bound of T
        // so it won't allow any other object which is not derived from Player class.
        //Team<String> brokenTeam = new Team<>("this won't work");

        Team<SoccerPlayer> brokenTeam = new Team<>(" this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");


        System.out.println("\nMatch Results : ");
        hawthorn.matchResults(fremantle, 1, 0);

        // since we made the generic type that extends player class it will not allow you
        // to pass object of another class that extends player class.
        //hawthorn.matchResults(brokenTeam, 1, 0);

        hawthorn.matchResults(adelaideCrows, 3, 8);

        adelaideCrows.matchResults(fremantle, 2,1);

        /*
         *  as we made the parameter to the method matchResults of type T
         *  it will only accept the objects of that class.
         */
        //adelaideCrows.matchResults(baseballTeam,1,1);

        System.out.println("\nRankings : ");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());


        System.out.println("\nCompareTo : ");
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo((hawthorn)));
        System.out.println(melbourne.compareTo(fremantle));
    }
}
