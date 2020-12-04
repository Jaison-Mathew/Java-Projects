package com.company;

public class Ceiling {
    //private fields
    private int height, paintedColor;

    //constructor that declares private fields
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //returns the height value
    public int getHeight() {
        return height;
    }

    //returns value of paintedColor
    public int getPaintedColor() {
        return paintedColor;
    }
}
