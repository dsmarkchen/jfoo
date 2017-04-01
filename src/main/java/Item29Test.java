package main.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class Item29Test {

    @Test
    public void testFavorite() {
        Item29.Favorites f = new Item29.Favorites();
        f.putFavorite(String.class, "hahah");
        f.putFavorite(Integer.class, 123);
        f.putFavorite(Class.class, Item29.Favorites.class);

        String string = f.getFavorite(String.class);
        assertEquals("hahah", string);
        int favoriteIntegar = f.getFavorite(Integer.class);
        assertEquals(123, favoriteIntegar);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        assertTrue(favoriteClass.getName().contains("Favorites"));
    }

    @Test
    public void testFavorite2() {
        Item29.Favorites f = new Item29.Favorites();
        f.putFavorite(String.class, "hahah");
        f.putFavorite(String.class, "test");
        String s = f.getFavorite(String.class);
        assertEquals("test", s); // replaced!!!

    }
}