package ces.augusto108.musicplayer.bootstrap;

import ces.augusto108.musicplayer.model.*;

import java.util.HashMap;
import java.util.Map;

public class PlayerBootstrap {
    public Playlist getPlaylist() {
        Artist a1 = new Artist("Lighthouse Family");
        Song s1 = new Song("Lifted", a1, MusicGenre.EASY_LISTENING);

        Artist a2 = new Artist("Dido");
        Song s2 = new Song("White flag", a2, MusicGenre.BRIT_POP);

        Artist a3 = new Artist("Take that");
        Song s3 = new Song("Back for good", a3, MusicGenre.BRIT_POP);

        Artist a4 = new Artist("Hoobastank");
        Song s4 = new Song("The reason", a4, MusicGenre.ALTERNATIVE_ROCK);

        Artist a5 = new Artist("Scorpions");
        Song s5 = new Song("Rock you like a hurricane", a5, MusicGenre.HARD_ROCK);

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
