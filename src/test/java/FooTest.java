package test.java;
import main.java.Foo;
import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test public void foo()
    {
        Foo foo = new Foo();
        assertEquals(2, foo.foo());
    }

}