package main.java;

public class Item2 {
    public Item2() {}
    public void test() {
        Pizza pizza = new Pizza.Builder(12)
                .bacon(true)
                .cheese(true)
                .build();
        System.out.println(pizza.toString());
    }
}
