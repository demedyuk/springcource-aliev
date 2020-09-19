package ru.demedyuk.education.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rock")
public class RockMusicList implements Music {
private List<String> playlist = new ArrayList<String>();

    @Override
    public List<String> getSongs() {
        playlist.add("Thnks fr th Mmrs");
        playlist.add("Uma Thurman");
        playlist.add("Centuries");
        return playlist;
    }
}
