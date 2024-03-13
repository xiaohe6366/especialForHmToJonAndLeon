package com.example.demo.inheritance;

public class Student extends Person {

//    private String name;
//
//    private int age;

    // 子类的实例, 可以指向自身, 自身就是this
    // 子类的实例, 隐秘的持有一个父类的实例, 在代码中这个父类的实例就是super

    private int grade;

    public Student(String name, int age) {
        super(name, age);
    }



//    private String name;

//    public Student(String name, int age, int grade){
//        super(name, age);
//        this.grade = grade;
////        super.name = name;
////        super.setAge(age);
////        this.grade = grade;
//    }

    // Getter Setter
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//

    // student.setAge(age)
    // setAge(student, age)
//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

//    public void setStudentName(String name) {
//        this.name = name;
//    }

//    public String getStudentName() {
//        return this.name;
//    }

//    public void hello() {
//        System.out.println("Hello I'm " + name);
//        System.out.println("Hello I'm " + super.getAge());
//    }

}
