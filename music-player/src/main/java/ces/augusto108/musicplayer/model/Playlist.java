package ces.augusto108.musicplayer.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Playlist implements Serializable {
    private static final long serialVersionUID = 4749927741458639212L;

    private Integer id;

    private Map<Artist, Song> playlist = new HashMap<>();

    public Playlist() {
    }

    public Playlist(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<Artist, Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Map<Artist, Song> playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return "Playlist #" + id;
    }
}
