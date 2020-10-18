package com.company;

public class Cuboid extends Rectangle{

    private double height;

    //Constructor calls parent constructor Rectangle to initialize fields
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    //Getter created to return value of height field
    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return (this.height * getArea());
    }
}
