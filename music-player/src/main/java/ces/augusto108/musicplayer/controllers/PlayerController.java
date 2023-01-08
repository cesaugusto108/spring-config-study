package ces.augusto108.musicplayer.controllers;

import ces.augusto108.musicplayer.services.PlayerService;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    public void getPlaylist() {
        playerService.play();
    }
}
