package com.example.demo.abstractClassAndInterface;

public class Main {

    public static void main(String[] args) {
//        Person student = new Student();
//        Person teacher = new Teacher();
//        sayHi(student);
//        sayHi(teacher);

        Course math = new Math();
        Course literature = new Literature();

        math.start();
        math.end();

        literature.start();
        literature.end();

        Course[] allCourses = new Course[3];

    }

    public static void sayHi(Person p) {
        p.hello();
    }

}
