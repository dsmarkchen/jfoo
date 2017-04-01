package main.java;

import org.junit.Test;

import static org.junit.Assert.*;


public class Item28Test {
    @Test
    public void testStackEmpty() {
        Item28 item = new Item28();
        Item28.Stack<String> stack = new Item28.Stack<String>();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testStockPushPop() {
        Item28 item = new Item28();
        Item28.Stack<String> stack = new Item28.Stack<String>();
        stack.push("abc");
        String res = stack.pop();
        assertEquals("abc", res);
    }
}