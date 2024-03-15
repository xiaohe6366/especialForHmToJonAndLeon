package com.example.demo.polymorphism;

public class Student extends Person {
    @Override
    public void hello() {
        super.hello();
        System.out.println("I'm a student");
    }

    public void helloToClassMate() {
        System.out.println("Hi folks");
    }
}
