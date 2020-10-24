package com.generics;

public class LeagueTableMain {
    public static void main(String[] args) {

        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorne);
        footballLeague.addTeam(fremantle);

        hawthorne.matchResults(fremantle, 1, 0);
        hawthorne.matchResults(adelaideCrows, 3, 8);
        adelaideCrows.matchResults(fremantle, 2, 1);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cabs");
        /*
         *  this will not allow as the footballLeague has been created from the class Team
         *  which is also generic and it has been created only for football players
         */
        //footballLeague.addTeam(baseballTeam);

        footballLeague.displayTeams();
    }
}
