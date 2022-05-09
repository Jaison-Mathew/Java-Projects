package com.timbuchalka;

import com.timbuchalka.model.Artist;
import com.timbuchalka.model.Datasource;
import com.timbuchalka.model.SongArtist;

import java.io.DataInputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()){
            System.out.println("Can't open datasource.");
            return;
        }

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if (artists == null){
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists){
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_ASC);

        for(String album : albumsForArtist){
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Heartless", Datasource.ORDER_BY_ASC);
        if (songArtists != null){
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist artist : songArtists){
            System.out.println("Artist name = " + artist.getArtistName() + " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        datasource.createViewForSongArtists();

        songArtists = datasource.querySongInfoView("Heartless");
        if (songArtists.isEmpty()){
            System.out.println("Couldn't find the artist for the song.");
            return;
        }

        for (SongArtist artist : songArtists){
            System.out.println(" FROM VIEW - Artist name = " + artist.getArtistName() + " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }

        datasource.close();
    }
}
