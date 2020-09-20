package ru.demedyuk.education.springcource;

import org.springframework.stereotype.Component;

//@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Holiday";
    }
}
