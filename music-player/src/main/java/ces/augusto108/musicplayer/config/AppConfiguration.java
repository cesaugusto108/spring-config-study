package ces.augusto108.musicplayer.config;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.controllers.PlayerController;
import ces.augusto108.musicplayer.services.PlayerService;
import ces.augusto108.musicplayer.services.PlayerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public PlayerBootstrap playerBootstrap() {
        return new PlayerBootstrap();
    }

    @Bean
    public PlayerService playerService() {
        return new PlayerServiceImpl(playerBootstrap());
    }

    @Bean
    public PlayerController playerController() {
        return new PlayerController(playerService());
    }
}