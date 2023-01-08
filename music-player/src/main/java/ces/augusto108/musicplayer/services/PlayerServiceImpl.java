package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.Artist;
import ces.augusto108.musicplayer.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlayerServiceImpl implements PlayerService {
    private final PlayerBootstrap playerBootstrap;

    public PlayerServiceImpl(PlayerBootstrap playerBootstrap) {
        this.playerBootstrap = playerBootstrap;
    }

    @Override
    public void play() {
        Map<Artist, Song> playlist = playerBootstrap.getPlaylist().getPlaylist();

        List<Song> songs = new ArrayList<>();

        for (Map.Entry<Artist, Song> artistSongEntry : playlist.entrySet()) {
            songs.add(artistSongEntry.getValue());
        }

        System.out.println("Now playing: ");

        System.out.println(songs.get(0) + " /" + songs.get(0).getArtist());

        System.out.println("Up next:");

        for (Song song : songs) {
            System.out.println(song + " / " + song.getArtist());
        }
    }
}
