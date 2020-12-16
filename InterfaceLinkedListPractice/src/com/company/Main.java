package com.company;


import java.util.*;

//Same as Linked list song playlist exercise, but replaced Linked Lists variables with List interface
public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        //Album myAlbum = new Album();

        while (!quit){
            int action = scanner.nextInt();
            switch (action){

            }
        }*/

        Album album = new Album("Meteora", "linkin Park");
        album.addSong("Heavy", 4);
        album.addSong("Bleeding out", 2);
        album.addSong("In the end", 3);
        album.addSong("Numb", 4);
        albums.add(album);

        album = new Album("Astro Lounge", "Smash Mouth");
        album.addSong("Come on, Come on", 4);
        album.addSong("All Star", 2);
        album.addSong("I'm a believer", 3);
        albums.add(album);

        List<Song> playList = new Vector<>();
        albums.get(0).addToPlaylist("Numb", playList);
        albums.get(0).addToPlaylist("All Star", playList);
        albums.get(0).addToPlaylist("Heavy", playList);
        albums.get(0).addToPlaylist("Chasing down the sun", playList);      //Does not exist
        albums.get(0).addToPlaylist(4, playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(6, playList);       //There is no track 6

        play(playList);


    }

    //Plays songs in playlist
    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in playlist.");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:     //Moves to next song in the playlist
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                    }
                    break;
                case 2:     //Moves to previous song in playlist
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        //if there is a previous song in the list, it will replay current song
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the list.");
                        }
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("We have reached end of the list.");
                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        //if there is a song after the current song, list iterator moves to next song after current song is removed from playlist
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if (listIterator.hasPrevious()){
                            //if there is a song before the current song, list iterator moves to previous song after current song is removed from playlist
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    //prints menu of options
    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - replay current song\n" +
                "4 - print list of songs\n" +
                "5 - print menu options\n" +
                "6 - Remove current song from playlist");
    }

    //prints list of songs in playlist
    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=====================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=====================");
    }
}
