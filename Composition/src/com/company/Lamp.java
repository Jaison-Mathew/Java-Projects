package com.company;

public class Lamp {
    //private fields
    private String style;
    private boolean battery;
    private int globRating;

    //constructor that initializes the private fields
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    //displays message that the lamp is turned on
    public void turnOn(){
        System.out.println("Lamp -> turning on.");
    }

    //returns the lamp style
    public String getStyle() {
        return style;
    }

    //returns value of battery
    public boolean isBattery(){
        if (this.battery == true){
            return true;
        }else {
            return false;
        }
    }

    //returns globRating of the lamp
    public int getGlobRating() {
        return globRating;
    }
}
