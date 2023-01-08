package ces.augusto108.musicplayer.model;

import java.io.Serializable;

public class Artist implements Serializable {
    private static final long serialVersionUID = 8638929205662413534L;

    private String name;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
