package nz.co.deltics.udemy.javamasterclass.section9.ex48;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }


        private boolean add(Song song) {

            if (this.songs.contains(song))
                return false;

            return this.songs.add(song);
        }


        private Song findSong(String title) {

            for (Song song : this.songs) {
                if (song.getTitle().equals(title))
                    return song;
            }

            return null;
        }


        private Song findSong(int track) {
            if ((track < 1) || (track > this.songs.size()))
                return null;

            return songs.get(track - 1);
        }
    }

    private String name;
    private String artist;
    private SongList songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }


    public boolean addSong(String title, double duration) {

        Song song = songs.findSong(title);
        if (song != null)
            return false;

        song = new Song(title, duration);

        return songs.add(song);
    }


    public boolean addToPlayList(int track, LinkedList<Song> playlist) {

        Song song = songs.findSong(track);
        if (song == null)
            return false;

        return playlist.add(song);
    }


    public boolean addToPlayList(String title, LinkedList<Song> playlist) {

        Song song = songs.findSong(title);
        if (song == null)
            return false;

        return playlist.add(song);
    }
}
