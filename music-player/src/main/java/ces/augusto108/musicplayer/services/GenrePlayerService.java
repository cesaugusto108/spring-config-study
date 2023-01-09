package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.Artist;
import ces.augusto108.musicplayer.model.MusicGenre;
import ces.augusto108.musicplayer.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class GenrePlayerService implements PlayerService {
    private final PlayerBootstrap playerBootstrap;

    public GenrePlayerService(PlayerBootstrap playerBootstrap) {
        this.playerBootstrap = playerBootstrap;
    }

    @Override
    public void play() {
        Map<Artist, Song> playlist = playerBootstrap.getPlaylist().getPlaylistMap();

        List<Song> songs = new ArrayList<>();

        for (Map.Entry<Artist, Song> artistSongEntry : playlist.entrySet()) {
            songs.add(artistSongEntry.getValue());
        }

        List<Song> alternativeRockSongs = new ArrayList<>();

        for (Song song : songs) {
            if (song.getGenre().equals(getGenre())) alternativeRockSongs.add(song);
        }

        System.out.println("\n" + playerBootstrap.getPlaylist() + ":");

        System.out.println("\nNow playing: ");

        System.out.println(alternativeRockSongs.get(0));

        System.out.println("\nUp next:");

        for (int i = 1; i < alternativeRockSongs.size(); i++) {
            System.out.println(alternativeRockSongs.get(i));
        }
    }

    abstract MusicGenre getGenre();
}
