package com.company;

public class Main {

    public static void main(String[] args) {
	    Room myRoom = new Room(4, 5);

        Furniture myFurniture = new Furniture("couch", myRoom);
        myFurniture.displayHeight();
        //myRoom.getArea();

    }
}
