package com.example.demo.abstractClassAndInterface;

public class Math implements Course {
    @Override
    public void start() {
        System.out.println("start math");
    }

    @Override
    public void end() {
        System.out.println("end math");
    }

    public void calculate() {
        System.out.println("let's calculate");
    }
}
