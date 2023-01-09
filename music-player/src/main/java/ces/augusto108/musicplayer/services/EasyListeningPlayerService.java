package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.Artist;
import ces.augusto108.musicplayer.model.MusicGenre;
import ces.augusto108.musicplayer.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EasyListeningPlayerService implements PlayerService {
    private final PlayerBootstrap playerBootstrap;

    public EasyListeningPlayerService(PlayerBootstrap playerBootstrap) {
        this.playerBootstrap = playerBootstrap;
    }

    @Override
    public void play() {
        Map<Artist, Song> playlist = playerBootstrap.getPlaylist().getPlaylistMap();

        List<Song> songs = new ArrayList<>();

        for (Map.Entry<Artist, Song> artistSongEntry : playlist.entrySet()) {
            songs.add(artistSongEntry.getValue());
        }

        List<Song> easyListeningSongs = new ArrayList<>();

        for (Song song : songs) {
            if (song.getGenre().equals(MusicGenre.EASY_LISTENING)) easyListeningSongs.add(song);
        }

        System.out.println("\n" + playerBootstrap.getPlaylist() + ":");

        System.out.println("\nNow playing: ");

        System.out.println(easyListeningSongs.get(0));

        System.out.println("\nUp next:");

        for (int i = 1; i < easyListeningSongs.size(); i++) {
            System.out.println(easyListeningSongs.get(i));
        }
    }
}
