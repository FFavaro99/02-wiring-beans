package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Song {
    private String title;

    // Field injection, not recommended
//    @Autowired
    private Singer singer;

    // Constructor injection -- BEST PRACTICE
//    @Autowired
//    public Song (Singer singer) {
//        this.singer = singer;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Singer getSinger() {
        return singer;
    }

    //Setter injection
//    @Autowired
    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", singer=" + singer +
                '}';
    }
}
