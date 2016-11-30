package com.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("spring");
//        helloWorld.hello();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld ocx = (HelloWorld) context.getBean("helloWorld");
        ocx.hello();
    }
}
