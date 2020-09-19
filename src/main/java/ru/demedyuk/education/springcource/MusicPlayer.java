package ru.demedyuk.education.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayerBean")
public class MusicPlayer {

    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
//        System.out.println();
//        System.out.println("Playing: " + rockMusic.getSong());
    }
}
