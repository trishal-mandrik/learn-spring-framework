package com.in28minutes.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}

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
        return new Person("John Doe", 20, new Address("Kasaridih", "Durg"));
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Baker street", "London");
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("Baker street", "London");
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }
}
