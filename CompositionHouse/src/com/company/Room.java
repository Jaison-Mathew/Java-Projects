package com.company;

public class Room {

    private int width;
    private int length;

    public Room(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void getArea(){
        System.out.println("The area of this room is " + width * length);

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void height(int number){
        System.out.println("The height is " + number);
    }
}
