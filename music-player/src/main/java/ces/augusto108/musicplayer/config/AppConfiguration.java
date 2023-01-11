package ces.augusto108.musicplayer.config;

import ces.augusto108.musicplayer.bootstrap.PlayerBootstrap;
import ces.augusto108.musicplayer.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationPropertiesScan
public class AppConfiguration {
    @Bean
    AppProfile appProfile(
            ConstructorPropertyBind constructorPropertyBind,
            @Value("${spring.profiles.active}") String profile
    ) {
        AppProfile appProfile = new AppProfile();

        appProfile.setApplicationName(constructorPropertyBind.getName());
        appProfile.setProfile(profile);

        return appProfile;
    }

    @Bean
    PlayerBootstrap playerBootstrap() {
        return new PlayerBootstrap();
    }

    @Bean
    @Profile("default")
    PlayerServiceImpl playerServiceImpl(PlayerBootstrap playerBootstrap) {
        return new PlayerServiceImpl(playerBootstrap);
    }

    @Bean
    @Profile("easy")
    EasyListeningPlayerService easyListeningPlayerService(PlayerBootstrap playerBootstrap) {
        return new EasyListeningPlayerService(playerBootstrap);
    }

    @Bean
    @Profile("brit")
    BritPopPlayerService britPopPlayerService(PlayerBootstrap playerBootstrap) {
        return new BritPopPlayerService(playerBootstrap);
    }

    @Bean
    @Profile("alternative")
    AlternativeRockPlayerService alternativeRockPlayerService(PlayerBootstrap playerBootstrap) {
        return new AlternativeRockPlayerService(playerBootstrap);
    }

    @Bean
    @Profile("hard")
    HardRockPlayerService hardRockPlayerService(PlayerBootstrap playerBootstrap) {
        return new HardRockPlayerService(playerBootstrap);
    }
}
