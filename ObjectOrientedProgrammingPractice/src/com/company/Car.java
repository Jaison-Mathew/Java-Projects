package com.company;

public class Car {

    //private variables won't be available to use outside of this class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){

        //this represents the class Car.
        //model variable from Car will equal model variable from setModel parameter.
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}
