package ces.augusto108.musicplayer;

import ces.augusto108.musicplayer.controllers.PlayerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ces.augusto108.musicplayer.config")
public class MusicPlayerApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MusicPlayerApplication.class, args);

        PlayerController playerController = (PlayerController) applicationContext.getBean("playerController");

        playerController.getPlaylist();
    }
}
