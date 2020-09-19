package ru.demedyuk.education.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("pop")
public class PopMusicList implements Music {
private List<String> playlist = new ArrayList<String>();

    @Override
    public List<String> getSongs() {
        playlist.add("Billie Jean");
        playlist.add("Despasito");
        playlist.add("My way");
        return playlist;
    }
}
