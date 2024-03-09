package com.example.demo;

public class FunctionCallValuePassingDemo {

    public static void main(String[] args) {
        // basic type: int, short, byte, long, double, float, boolean, char
        // all others are reference type
        int a1 = 1;
        Something something = new Something();
        something.a = 1;

        change(a1, something);

        System.out.println(a1);
        System.out.println(something.a);
    }

    // heap: address, value
    //        0001
    //        0002
    //        0003     {a = 2}


    //  variableName, stack
    //      a1         1
    //   something     0003
    //
    //      a2         2
    //      s          0003

    public static void change(int a2, Something s) {
        a2 += 1;
        s.a += 1;
    }
}

class Something {
    public int a;
}
