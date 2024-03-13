package com.example.demo.inheritance;

public class Person  {
    protected String name;

    private int age;

//    public Person() {
//
//    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter Setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
