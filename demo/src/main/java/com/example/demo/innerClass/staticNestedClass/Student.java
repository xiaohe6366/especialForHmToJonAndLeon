package com.example.demo.innerClass.staticNestedClass;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class Student {

//    private static String schoolName = "Medford";

    private int id;

    private String name;

    private int literatureGrade;

    private int mathGrade;

    private int englishGrade;

    private int age;

    public Student(int id, String name, int literatureGrade, int mathGrade, int englishGrade, int age) {
        this.id = id;
        this.name = name;
        this.literatureGrade = literatureGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.age = age;
    }

}
