package nz.co.deltics.udemy.javamasterclass.section8.ex46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }


    public boolean addSong(String title, double duration) {

        Song song = findSong(title);
        if (song != null)
            return false;

        song = new Song(title, duration);
        this.songs.add(song);

        return true;
    }


    private Song findSong(String title) {

        for (Song song : this.songs) {
            if (song.getTitle().equals(title))
                return song;
        }

        return null;
    }


    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist) {

        if ((trackNo < 1) || (trackNo > this.songs.size()))
            return false;

        Song song = this.songs.get(trackNo - 1);
        playlist.add(song);

        return true;
    }


    public boolean addToPlayList(String trackTitle, LinkedList<Song> playlist) {

        Song song = findSong(trackTitle);
        if (song == null)
            return false;

        int trackNo = this.songs.indexOf(song);
        return addToPlayList(trackNo, playlist);
    }
}
