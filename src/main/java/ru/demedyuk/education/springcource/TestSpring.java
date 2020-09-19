package ru.demedyuk.education.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicClassicalBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        firstMusicPlayer.setVolume(10);
//
//        boolean comparsion = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparsion);
//
//        System.out.println("vol1: " + firstMusicPlayer.getVolume());
//        System.out.println("vol2: " + secondMusicPlayer.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
