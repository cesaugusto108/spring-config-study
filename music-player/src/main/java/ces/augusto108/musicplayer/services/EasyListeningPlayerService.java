package ces.augusto108.musicplayer.services;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.model.MusicGenre;

public class EasyListeningPlayerService extends GenrePlayerService {
    public EasyListeningPlayerService(PlayerBootstrap playerBootstrap) {
        super(playerBootstrap);
    }

    @Override
    MusicGenre getGenre() {
        return MusicGenre.EASY_LISTENING;
    }
}
