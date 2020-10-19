package com.company;

public class Furniture {

    private String name;
    private Room furnitureRoom;

    public Furniture(String name, Room furnitureRoom) {
        this.name = name;
        this.furnitureRoom = furnitureRoom;
    }

    private void display(){
        System.out.println("The length and width of " + name + " are " + furnitureRoom.getLength() + " and " + furnitureRoom.getWidth());
        furnitureRoom.getArea();
    }

    public void displayHeight(){
        display();
        furnitureRoom.height(5);
    }
}
