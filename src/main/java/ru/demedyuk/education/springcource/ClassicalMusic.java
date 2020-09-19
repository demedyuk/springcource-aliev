package ru.demedyuk.education.springcource;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "HungarianRhapsody";
    }

    public void doMyInit() {
        System.out.println("Do my initiatization");
    }
    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }
}
