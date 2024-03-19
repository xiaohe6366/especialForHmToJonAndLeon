package com.example.demo.innerClass.anonymousClass;

public class Student implements Person {
    @Override
    public void eat() {
        System.out.println("eat at dining hall");
    }

    @Override
    public void sleep() {
        System.out.println("sleep at dormitory");
    }
}
