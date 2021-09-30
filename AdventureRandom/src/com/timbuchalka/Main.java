package com.timbuchalka;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
/*
        // creating new locations for map
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of the road before a small bridge"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        // adding exits for location 1
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        // adding exits for location 2
        locations.get(2).addExit("N", 5);

        // adding exits for location 3
        locations.get(3).addExit("W", 1);

        // adding exits for location 4
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        // adding exits for location 5
        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
*/



        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
        for (String i : road) {
            System.out.println(i);
        }

        System.out.println("==========================================");

        String[] building = "You are inside a building, a well house for a small spring".split(", ");
        for (String i : building) {
            System.out.println(i);
        }


        // create words in to find in phrases for when taking direction
        Map<String, String> vocab = new HashMap<String, String>();
        vocab.put("QUIT", "Q");
        vocab.put("NORTH", "N");
        vocab.put("SOUTH", "S");
        vocab.put("EAST", "E");
        vocab.put("WEST", "W");

        //creating first location
        Location currentLocation = locations.getLocation(1);
        while(true){

            System.out.println(currentLocation.getDescription());
            if(currentLocation.getLocationID() == 0){
                break;
            }

            Map<String, Integer> exits = currentLocation.getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();


            String direction = scanner.nextLine().toUpperCase();
            // checks through each word of a phrase to know which direction to go
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String phrase : words){
                    if(vocab.containsKey(phrase)){
                        direction = vocab.get(phrase);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)){
                currentLocation = locations.getLocation(currentLocation.getExits().get(direction));
            }else {
                System.out.println("You cannot go in that direction");
            }
        }
        locations.close();
    }

/*
    public static void command() {
        Scanner scanner = new Scanner(System.in);
        int loc = 1;

        // create words in to find in phrases for when taking direction
        Map<String, String> vocab = new HashMap<String, String>();
        vocab.put("QUIT", "Q");
        vocab.put("NORTH", "N");
        vocab.put("SOUTH", "S");
        vocab.put("EAST", "E");
        vocab.put("WEST", "W");


        while(true){

            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();


            String direction = scanner.nextLine().toUpperCase();
            // checks through each word of a phrase to know which direction to go
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String phrase : words){
                    if(vocab.containsKey(phrase)){
                        direction = vocab.get(phrase);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("You cannot go in that direction");
            }

            if (!locations.containsKey(loc)){
                System.out.println("You cannot go that direction");
            }

        }
    }
*/
}

