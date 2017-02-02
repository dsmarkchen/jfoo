package main.java;

public class Item51 {

    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        b.append(userStringBuild());
        b.append("Item 50: Use StringBuilder");
        return b.toString();
    }
    public String userStringBuild()
    {
        final int LINE_WIDTH = 80;
        StringBuilder b = new StringBuilder(numItems()*LINE_WIDTH);
        for (int i=0; i<numItems(); i++) {
            b.append(lineForItems(i));

        }
        return b.toString();
    }

    private int numItems() {
        return 10;
    }
    private String lineForItems(int i)
    {
        return ((Integer) (i+100) ).toString();
    }

}
