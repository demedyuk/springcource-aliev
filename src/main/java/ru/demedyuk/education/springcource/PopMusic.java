package ru.demedyuk.education.springcource;

import org.springframework.stereotype.Component;

//@Component("popMusic")
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "Billie Jean";
    }
}
