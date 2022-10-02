package com.springbook;

import com.springbook.config.ProjectConfig;
import com.springbook.models.Parrot;
import com.springbook.models.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        for (var bean : context.getBeanDefinitionNames()) {
//            System.out.println(bean);
//        }

        Parrot p = context.getBean(Parrot.class);
        Person pp = context.getBean(Person.class);

        System.out.println(pp);
        System.out.println(p);
    }
}