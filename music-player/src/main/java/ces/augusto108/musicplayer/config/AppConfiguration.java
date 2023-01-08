package ces.augusto108.musicplayer.config;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfiguration {
    @Bean
    @Profile("default")
    public PlayerServiceImpl playerServiceImpl() {
        return new PlayerServiceImpl(new PlayerBootstrap());
    }

    @Bean
    @Profile("easy")
    public EasyListeningPlayerService easyListeningPlayerService() {
        return new EasyListeningPlayerService(new PlayerBootstrap());
    }

    @Bean
    @Profile("brit")
    public BritPopPlayerService britPopPlayerService() {
        return new BritPopPlayerService(new PlayerBootstrap());
    }

    @Bean
    @Profile("alternative")
    public AlternativeRockPlayerService alternativeRockPlayerService() {
        return new AlternativeRockPlayerService(new PlayerBootstrap());
    }

    @Bean
    @Profile("hard")
    public HardRockPlayerService hardRockPlayerService() {
        return new HardRockPlayerService(new PlayerBootstrap());
    }
}
