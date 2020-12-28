package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    //add new song to playlist
    public boolean addSong(String newName, int newDuration){
        return this.songs.add(new Song(newName, newDuration));
    }

    //adds song to linked list playlist based on track number
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //adds song to playlist based on song title
    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println(title + " is not in the playlist.");
        return false;
    }

    //inner class
    private class SongList{
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<Song>();
        }

        //method used to add song
        public boolean add(Song song){
            if (songList.contains(song)){
                return false;
            }
            this.songList.add(song);
            return true;
        }

        //checks if the song exists in the array list album
        private Song findSong(String title){
            //alternative way of checking through array list
            for (Song checkedSong: this.songList){
                if (checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        //method used to find song in playlist
        public Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if ((index >= 0) && (index < songList.size())){
                return songList.get(index);
            }
            return null;
        }
    }
}
