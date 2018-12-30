package ru.cosmo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IndependedMessageRenderer renderer = context.getBean(IndependedMessageRenderer.class);
        renderer.print();

    }
}
