package main;

import components.Singer;
import components.Song;
import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String... strings) {
        //Instantiating the context
        var context = new AnnotationConfigApplicationContext(Config.class);

        //Getting the beans
        var song = context.getBean(Song.class);
        var singer = context.getBean(Singer.class);

        //Setting some values for the beans
        singer.setName("Ricky Astley");
        song.setTitle("Never gonna give you up");

        //Printing values to screen
        System.out.println(song.getTitle());
        System.out.println(singer.getName());
        System.out.println(song.getSinger());
    }
}
