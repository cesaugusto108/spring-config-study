package ces.augusto108.musicplayer;

import ces.augusto108.musicplayer.config.AppProfile;
import ces.augusto108.musicplayer.controllers.PlayerController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ces.augusto108.musicplayer.config", "ces.augusto108.musicplayer.controllers"})
public class MusicPlayerApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MusicPlayerApplication.class, args);

        PlayerController playerController = (PlayerController) applicationContext.getBean("playerController");

        playerController.getPlaylist();

        //

        AppProfile appProfile = (AppProfile) applicationContext.getBean("appProfile");

        final Logger logger = LoggerFactory.getLogger("MusicPlayerApplication");

        logger.info(
                "Application info: Name: " + appProfile.getAppName() + " / Profile: " + appProfile.getProfile()
        );
    }
}
