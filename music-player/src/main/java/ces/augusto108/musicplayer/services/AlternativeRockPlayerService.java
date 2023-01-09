package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.Artist;
import ces.augusto108.musicplayer.model.MusicGenre;
import ces.augusto108.musicplayer.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AlternativeRockPlayerService implements PlayerService {
    private final PlayerBootstrap playerBootstrap;

    public AlternativeRockPlayerService(PlayerBootstrap playerBootstrap) {
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
            if (song.getGenre().equals(MusicGenre.ALTERNATIVE_ROCK)) alternativeRockSongs.add(song);
        }

        System.out.println("\n" + playerBootstrap.getPlaylist() + ":");

        System.out.println("\nNow playing: ");

        System.out.println(alternativeRockSongs.get(0));

        System.out.println("\nUp next:");

        for (int i = 1; i < alternativeRockSongs.size(); i++) {
            System.out.println(alternativeRockSongs.get(i));
        }
    }
}
