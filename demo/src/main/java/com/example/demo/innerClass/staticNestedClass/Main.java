package com.example.demo.innerClass.staticNestedClass;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(0, "peter", 90, 90, 90, 20);

        Student student1 = Student.builder()
                .id(1)
                .age(25)
                .name("Mary")
                .literatureGrade(85)
                .mathGrade(82)
                .englishGrade(85)
                .build();

        System.out.println(student);

        System.out.println(student1);
    }

}
