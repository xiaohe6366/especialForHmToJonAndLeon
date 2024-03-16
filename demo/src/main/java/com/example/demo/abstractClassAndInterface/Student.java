package com.example.demo.abstractClassAndInterface;

public class Student extends Person {

    @Override
    public void hello() {
        System.out.println("Hello, I'm a student");
    }

    @Override
    public void eat() {
        System.out.println("I eat 10kg.");
    }

    @Override
    public void sleep() {
        System.out.println("8 hr");
    }
}
