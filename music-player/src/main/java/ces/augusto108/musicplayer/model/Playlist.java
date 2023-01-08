package ces.augusto108.musicplayer.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Playlist implements Serializable {
    private static final long serialVersionUID = 4749927741458639212L;

    private Integer id;

    private Map<Artist, Song> playlistMap = new HashMap<>();

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

    public Map<Artist, Song> getPlaylistMap() {
        return playlistMap;
    }

    public void setPlaylistMap(Map<Artist, Song> playlistMap) {
        this.playlistMap = playlistMap;
    }

    @Override
    public String toString() {
        return "Playlist #" + id;
    }
}
