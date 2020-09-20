package ru.demedyuk.education.springcource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Music classicalMusic = context.getBean("popMusic", Music.class);
//        System.out.println(classicalMusic.getSong());

        Computer computer = annotationConfigApplicationContext.getBean("computer", Computer.class);
        System.out.println(computer);

//        ClassicalMusic classicalMusic1 = annotationConfigApplicationContext.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = annotationConfigApplicationContext.getBean("classicalMusic", ClassicalMusic.class);
//
//        System.out.println(classicalMusic1);
//        System.out.println(classicalMusic2);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        annotationConfigApplicationContext.close();
    }
}
