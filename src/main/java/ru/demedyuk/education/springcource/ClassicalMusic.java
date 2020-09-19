package ru.demedyuk.education.springcource;

public class ClassicalMusic implements Music {

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
