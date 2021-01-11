package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //adds player
    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on this team.");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    //returns number of players
    public int numPlayers(){
        return this.members.size();
    }

    //returns match results
    public void matchResults(Team<T> opponent, int ourScore, int theirScore){

        String message;
        if (ourScore > theirScore){
            won++;
            message = " beat ";
        }else if (ourScore == theirScore){
            tied++;
            message = " drew with ";
        }else {
            lost++;
            message = " lost to ";
        }
        played++;
        //saving results of opponent team
        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResults(null, theirScore, ourScore);
        }
    }

    // returns ranking system
    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        }else if (this.ranking() < team.ranking()){
            return 1;
        }else {
            return 0;
        }
    }
}
