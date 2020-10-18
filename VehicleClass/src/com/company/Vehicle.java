package com.company;

public class Vehicle {

    private String name;
    private String size;
    private int velocity;
    private int direction;

    //create constructor to initialize fields
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.velocity = 0;
        this.direction = 0;
    }

    //Create function for hand steering
    public void steer(int direction){
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.direction + " degrees");
    }

    public  void move(int direction, int velocity){
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at " + this.velocity + " in direction " + this.direction);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }

    public void stop(){
        this.velocity = 0;
    }
}
