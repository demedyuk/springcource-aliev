package ru.demedyuk.education.springcource;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(){}

    public void setMusic(List<Music> musicList) {
        if (musicList != null)
        for (Music music : musicList) {
            this.musicList.add(music);
        }
    }

    public void playMusic() {
        System.out.println("Music list:");
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }

    }
}
