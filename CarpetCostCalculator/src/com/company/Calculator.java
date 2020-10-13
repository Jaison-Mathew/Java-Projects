package com.company;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    //create constructor to initialize private fields
    Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return this.floor.getArea() * this.carpet.getCost();
    }
}
