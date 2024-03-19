package com.example.demo.innerClass;

public class Outer {

    public static String delim = "------------------------";

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    class Inner {

        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void hello() {
            System.out.println(this.name); // inner instance
            System.out.println(delim);
            System.out.println(Outer.this.name); // outer instance
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.setName("outer");
        Inner inner = outer.new Inner();
        inner.setName("inner");
        inner.hello();
    }

}
