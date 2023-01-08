package ces.augusto108.musicplayer.bootstrap;

import ces.augusto108.musicplayer.model.Artist;
import ces.augusto108.musicplayer.model.Playlist;
import ces.augusto108.musicplayer.model.Song;

import java.util.HashMap;
import java.util.Map;

public class PlayerBootstrap {
    public Playlist getPlaylist() {
        Artist a1 = new Artist("Lighthouse Family");
        Song s1 = new Song("Lifted", a1);

        Artist a2 = new Artist("Dido");
        Song s2 = new Song("White flag", a2);

        Artist a3 = new Artist("Take that");
        Song s3 = new Song("Back for good", a3);

        Artist a4 = new Artist("Hoobastank");
        Song s4 = new Song("The reason", a4);

        Playlist p = new Playlist(1);

        Map<Artist, Song> playlist = new HashMap<>();
        playlist.put(a1, s1);
        playlist.put(a2, s2);
        playlist.put(a3, s3);
        playlist.put(a4, s4);

        p.setPlaylistMap(playlist);

        return p;
    }
}
