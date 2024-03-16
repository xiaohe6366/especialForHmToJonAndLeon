package com.example.demo.abstractClassAndInterface;

public class Literature implements Course {
    @Override
    public void start() {
        System.out.println("start Literature");
    }

    @Override
    public void end() {
        System.out.println("end Literature");
    }
}
