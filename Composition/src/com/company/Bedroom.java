package com.company;

public class Bedroom {
    //private fields
    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    //constructor declares private fields
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    //returns an object of type Lamp
    public Lamp getLamp() {
        return lamp;
    }

    //displays message that the bed is being made
    public void makeBed(){
        System.out.println("Bedroom -> Making bed | ");
        this.bed.make();
    }
}