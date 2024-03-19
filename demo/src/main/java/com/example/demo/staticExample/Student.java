package com.example.demo.staticExample;

public class Student {

    public static String schoolName = "school";

    public static void hello() {
        System.out.println("We come from " + schoolName);
    }

    public void setSchoolName(String name) {
        schoolName = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
