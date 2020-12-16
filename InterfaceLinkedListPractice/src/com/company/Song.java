package com.company;

//Same as Linked list song playlist exercise, but replaced Linked Lists variables with List interface
public class Song {
    private String title;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration + "min.";
    }
}