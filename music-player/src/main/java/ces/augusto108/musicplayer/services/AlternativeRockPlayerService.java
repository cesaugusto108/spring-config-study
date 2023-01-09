package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.MusicGenre;

public class AlternativeRockPlayerService extends GenrePlayerService {
    public AlternativeRockPlayerService(PlayerBootstrap playerBootstrap) {
        super(playerBootstrap);
    }

    @Override
    MusicGenre getGenre() {
        return MusicGenre.ALTERNATIVE_ROCK;
    }
}
