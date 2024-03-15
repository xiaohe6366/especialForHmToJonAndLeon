package com.example.demo.polymorphism;

public class Teacher extends Person {

    @Override
    public void hello() {
        super.hello();
        System.out.println("I'm a teacher");
    }
}
