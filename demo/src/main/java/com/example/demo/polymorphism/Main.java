package com.example.demo.polymorphism;

// 多态: 一件事可以通过很多种方法来完成
public class Main {

    private static String delimiter = "------------------------------------";

    public static void main(String[] args) {
        Student student = new Student();
        student.hello();
        student.helloToClassMate();

        System.out.println(delimiter);

        Person person = new Person();
        person.setName("someone");
        person.setAge(20);
        person.hello();
//        person.helloToClassMate();

        System.out.println(delimiter);

        // 1. 声明变量为父类, 可以给它赋值子类的实例.
        // 2. 对于这样的变量, 它能够调用的方法, 只局限于在父类中定义的方法
        // 3. 对于这样的变量, 其调用方法时, 方法的执行逻辑由实例的类型决定.
        Person someStudent = new Student();
        someStudent.hello();
//        someStudent.helloToClassMate();

        System.out.println(delimiter);

        greeting(new Teacher(), new Teacher());

        System.out.println(delimiter);


        // variable_name     stack
        // s1                0001
        // s2                0002


        // heap_address      data
        // 0001              123
        // 0002              123

        String s1 = new String("123");
        String s2 = new String("123");

        System.out.println(s1.equals(s2));

        System.out.println(delimiter);

        System.out.println(person);
    }

    public static void greeting(Person p1, Person p2) {
        p1.hello();
        p2.hello();
    }
}
