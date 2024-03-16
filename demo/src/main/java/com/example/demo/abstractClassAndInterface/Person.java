package com.example.demo.abstractClassAndInterface;

// 1. 抽象类不能被实例化; (但是可以有构造器)
// 2. 抽象类可以额外的包含抽象方法 (不是必须要有)
public abstract class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public Person() {

    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void hello() {
//        System.out.println("Hello");
//    }
//
    public abstract void hello();

    public abstract void eat();

    public abstract void sleep();
}
