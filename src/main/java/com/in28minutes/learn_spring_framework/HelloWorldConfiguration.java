package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){}

//Address - firstLine & city
record Address(String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Trishal";
    }

    @Bean
    public int age() {
        return 28;
    }

    @Bean
    public Person person() {
        return new Person("John Doe", 20);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Baker street", "London");
    }
}
