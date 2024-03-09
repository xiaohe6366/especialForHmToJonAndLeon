package com.example.demo;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray1 = new int[5];
        for (int n: intArray1) {
            System.out.println(n);
        }

        int[] intArray2 = new int[]{1, 2, 3};
        for (int n: intArray2) {
            System.out.println(n);
        }
    }
}
