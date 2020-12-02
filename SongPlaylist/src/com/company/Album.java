package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    private LinkedList<String> playlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public LinkedList<String> getPlaylist() {
        return playlist;
    }

    //add new song to playlist
    public boolean addSong(String newName, int newDuration){
        //adds new song if the song does not exist in the array list
        if (findSong(newName) == null){
            this.songs.add(new Song(newName, newDuration));
            return true;
        }
        return false;
    }

    //checks if the song exists in the array list album
    private Song findSong(String title){
        //alternative way of checking through array list
        for (Song checkedSong: this.songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    //adds song to linked list playlist based on track number
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        //if the trackNumber is within the size of the the playlist, its added
        if ((index >= 0) && index <= this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //adds song to playlist based on song title
    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println(title + " is not in the playlist.");
        return false;
    }
}
