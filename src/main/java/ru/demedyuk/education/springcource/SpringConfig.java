package ru.demedyuk.education.springcource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.demedyuk.education.springcource")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
