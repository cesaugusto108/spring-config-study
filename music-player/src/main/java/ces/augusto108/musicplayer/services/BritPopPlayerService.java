package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.MusicGenre;

public class BritPopPlayerService extends GenrePlayerService {
    public BritPopPlayerService(PlayerBootstrap playerBootstrap) {
        super(playerBootstrap);
    }

    @Override
    MusicGenre getGenre() {
        return MusicGenre.BRIT_POP;
    }
}
