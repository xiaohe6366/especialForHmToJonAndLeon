package com.example.demo;

public class ControlFlowDemo {

    public static void main(String[] args) {

        int grade = -1;

        if (grade >= 60) {
            System.out.println("及格了");
        } else if (grade >= 0) {
            System.out.println("没及格");
        } else {
            System.out.println("数据异常");
        }

        int n = 100;
        while (n > 60) {
            n--;
        }

        int[] a = new int[]{1, 2, 3};

        for (int e : a) {
            System.out.println(e);
        }
        //      (1)   ;  (2)        ; (3)
        for (int i = 0; i < a.length; i++) {
            // (4)
            System.out.println(a[i]);
        }

        // (1)
        // (2) (4) (3)
        // (2) (4) (3)

        for (int i = 0; ;i++) {
            System.out.println(i);
            if (i >= 10) break;
        }
    }
}
