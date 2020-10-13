package com.company;

public class Wall {

    private double width;
    private double height;

    Wall(){
        this(1, 1);
    }

    Wall(double width, double height){
        if (width < 0){
            this.width = 0;
        }
        if (height < 0){
            this.height = 0;
        }else {
            this.width = width;
            this.height = height;
        }

    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }

    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }
}
