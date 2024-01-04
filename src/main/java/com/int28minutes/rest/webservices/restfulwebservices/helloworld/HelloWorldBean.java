package com.int28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {

    private String name;

    public HelloWorldBean() {
    }

    public HelloWorldBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
