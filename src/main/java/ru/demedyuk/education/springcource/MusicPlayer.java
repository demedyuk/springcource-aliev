package ru.demedyuk.education.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicPlayerBean")
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<Music>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> musicList) {
       this.musicList = musicList;
    }

    public String playMusic() {
        return "Playing: " + musicList.get(new Random().nextInt(3)).getSong();
    }
}
