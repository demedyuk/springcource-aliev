package ru.demedyuk.education.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicPlayerBean")
public class MusicPlayer {

    private Music music1;
    private Music music2;


    public MusicPlayer(@Qualifier("rock") Music music1,  @Qualifier("pop") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genres genre) {
        if (genre == Genres.POP)
            randomTrack(music2);
        if (genre == Genres.ROCK)
            randomTrack(music1);
    }

    private void randomTrack(Music music) {
        System.out.println("Playing: " + music.getSongs().get(new Random().nextInt(3)));
    }
}
