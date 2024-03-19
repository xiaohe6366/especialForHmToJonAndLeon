package com.example.demo.innerClass.anonymousClass;

public class Main {

    public static void main(String[] args) {
        Person student = new Student();

        student.eat();
        student.sleep();

        System.out.println(student);

        Person teacher = new Person() {
            @Override
            public void eat() {
                System.out.println("eat at teacher's dining hall");
            }

            @Override
            public void sleep() {
                System.out.println("sleep at home");
            }
        };

        teacher.eat();
        teacher.sleep();

        System.out.println(teacher);
    }
}
