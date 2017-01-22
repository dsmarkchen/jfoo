package main.java;

public class FooRunner {

    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println( ((Integer)foo.foo()).toString());
    }
}
