package ces.augusto108.musicplayer.model;

import java.io.Serializable;
import java.util.Objects;

public class Genre implements Serializable {
    private static final long serialVersionUID = -8601302156316527331L;

    private Integer id;

    private String definition;

    public Genre() {
    }

    public Genre(Integer id, String definition) {
        this.id = id;
        this.definition = definition;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return definition.equals(genre.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(definition);
    }

    @Override
    public String toString() {
        return definition;
    }
}
