package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.MusicGenre;

public class HardRockPlayerService extends GenrePlayerService {
    public HardRockPlayerService(PlayerBootstrap playerBootstrap) {
        super(playerBootstrap);
    }

    @Override
    MusicGenre getGenre() {
        return MusicGenre.HARD_ROCK;
    }
}
