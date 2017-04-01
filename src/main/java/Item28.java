package main.java;


import java.util.EmptyStackException;

public class Item28 {


    public static class Stack<E> {
        private E[] elements;
        private int size = 0;
        private static final int DEFAULT_INITIAL_CAPACITY = 16;

        public Stack() {
            elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
        }

        public void push(E e) {
            elements[size++] = e;
        }

        public E pop() {
            if(size == 0) {
                throw new EmptyStackException();
            }
            E result = elements[--size];
            elements[size] = null;
            return result;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    @Override
    public String toString() {
        return "Item28{Use bounded wildcards to increase API flexibility}";
    }
}
