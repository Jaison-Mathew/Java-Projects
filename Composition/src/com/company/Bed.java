package com.company;

public class Bed {
    //private fields
    private String style;
    private int pillows, height, sheets, quilt;

    //constructor initializes fields
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    //returns value of style
    public String getStyle() {
        return style;
    }

    //returns number of pillows
    public int getPillows() {
        return pillows;
    }

    //returns height of the bed
    public int getHeight() {
        return height;
    }

    //returns number of sheets
    public int getSheets() {
        return sheets;
    }

    //returns the value of quilt
    public int getQuilt() {
        return quilt;
    }

    //Displays message that the bed is being made.
    public void make(){
        System.out.println("Bed -> Making | ");
    }
}
