package com.springbook.config;

import com.springbook.models.Parrot;
import com.springbook.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springbook")
public class ProjectConfig {

//    @Bean
//    Person person(Parrot parrot) {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setPetParrot(parrot);
//        return p;
//    }
//
//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Coco");
//        return p;
//    }

//    @Bean (value = "testBean")
//    @Primary
//    Parrot parrot1() {
//        var p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean ("haha")
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("Riki");
//        return p;
//    }
//
}
