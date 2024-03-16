package com.example.demo.abstractClassAndInterface;

public class Teacher extends Person {

    @Override
    public void hello() {
        System.out.println("Hello, I'm a teacher.");
    }

    @Override
    public void eat() {
        System.out.println("1kg");
    }

    @Override
    public void sleep() {
        System.out.println("6 hr");
    }
}
