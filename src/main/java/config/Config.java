package config;

import components.Singer;
import components.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"components"})
public class Config {

    @Bean
    public Singer singer() {
        return new Singer();
    }

    @Bean
    public Song song() {
        Song song = new Song();
        song.setSinger(singer());
        return song;
    }
}
