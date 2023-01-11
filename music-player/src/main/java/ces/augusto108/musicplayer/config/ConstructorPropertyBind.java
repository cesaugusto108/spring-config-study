package ces.augusto108.musicplayer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("spring.application")
public class ConstructorPropertyBind {
    private final String name;

    public ConstructorPropertyBind(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
