package com.example.demo.inheritance;

public class Main {

    public static void main(String[] args) {

//        Person p0 = new Person();
//        Person p1 = new Person("person", 20);


        Student student = new Student("person", 20);

        student.setName("Peter");
//        student.setStudentName("pete");
        student.setAge(18);

        System.out.println(student.getName());
//        System.out.println(student.getStudentName());

//        student.hello();

//        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
    }

}
