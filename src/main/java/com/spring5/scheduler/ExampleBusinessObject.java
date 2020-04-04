package com.spring5.scheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleBusinessObject {

    // properties and collaborators

    public void doIt() {
        // do the actual work
        System.out.println("ExampleBusinessObject:do the actual work");
    }


    public static void main(String[] args) {
        System.out.println("ExampleBusinessObject:start");
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});

        ((ClassPathXmlApplicationContext) context).start();
    }

}
