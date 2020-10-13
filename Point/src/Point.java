package com.company;

public class Point {

    private int x;
    private int y;

    Point(){
        this(0, 0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //calculate distance from current point and point (0,0)
    public double distance(){
        double dist = (0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y);
        return Math.sqrt(dist);
    }

    //calculate distance from current point to point (x,y)
    public double distance(int x, int y){
        double root = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        return Math.sqrt(root);
    }

    //calculate distance from current point to point another
    public double distance(Point another){
        double root = (another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y);
        return Math.sqrt(root);
    }
}
