package ces.augusto108.musicplayer.model;

import java.io.Serializable;

public class Song implements Serializable {
    private static final long serialVersionUID = -4093835259827562419L;

    private String title;
    private Artist artist;

    private Genre genre;

    public Song() {
    }

    public Song(String title, Artist artist, Genre genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Artist: " + artist + " / Song: " + title + " / Genre: " + genre;
    }
}
