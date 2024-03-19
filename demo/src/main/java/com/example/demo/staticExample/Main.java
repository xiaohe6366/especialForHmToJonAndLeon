package com.example.demo.staticExample;

import java.util.Arrays;

public class Main {

    private static String DELIMITER = "--------------------------------------------";

    public static void main(String[] args) {
        Student peter = new Student();
        Student mary = new Student();

        peter.setName("peter");
        mary.setName("mary");


        System.out.println(peter.getName());
        System.out.println(mary.getName());

        System.out.println(DELIMITER);

        peter.setSchoolName("Medford");
        System.out.println(mary.getSchoolName());

        mary.setSchoolName("University");
        System.out.println(peter.getSchoolName());


        Student.hello();

        System.out.println(DELIMITER);

        System.out.println(Math.random());

        System.out.println(DELIMITER);

        int[] arr = new int[] {5, 1, 2, 8, 3, 4};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
