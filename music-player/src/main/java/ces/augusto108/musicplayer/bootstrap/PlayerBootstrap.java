package ces.augusto108.musicplayer.bootstrap;

import ces.augusto108.musicplayer.model.Artist;
import ces.augusto108.musicplayer.model.Genre;
import ces.augusto108.musicplayer.model.Playlist;
import ces.augusto108.musicplayer.model.Song;

import java.util.HashMap;
import java.util.Map;

public class PlayerBootstrap {
    public Playlist getPlaylist() {
        Genre g1 = new Genre(1, "Easy listening");
        Genre g2 = new Genre(2, "Brit Pop");
        Genre g3 = new Genre(3, "Alternative Rock");
        Genre g4 = new Genre(4, "Hard Rock");

        Artist a1 = new Artist("Lighthouse Family");
        Song s1 = new Song("Lifted", a1, g1);

        Artist a2 = new Artist("Dido");
        Song s2 = new Song("White flag", a2, g2);

        Artist a3 = new Artist("Take that");
        Song s3 = new Song("Back for good", a3, g2);

        Artist a4 = new Artist("Hoobastank");
        Song s4 = new Song("The reason", a4, g3);

        Artist a5 = new Artist("Scorpions");
        Song s5 = new Song("Rock you like a hurricane", a5, g4);

        Playlist p = new Playlist(1);

        Map<Artist, Song> playlist = new HashMap<>();
        playlist.put(a1, s1);
        playlist.put(a2, s2);
        playlist.put(a3, s3);
        playlist.put(a4, s4);
        playlist.put(a5, s5);

        p.setPlaylistMap(playlist);

        return p;
    }
}
