package design_pattern.strategy.entity;

import junit.framework.TestCase;

public class DuckManokTest extends TestCase {

    private Duck duck;

    public void setUp() throws Exception {
        super.setUp();
        duck = new DuckManok();
    }

    public void testShow() throws Exception {
        assertEquals("This is duck Manok!", duck.show());
    }

    public void testSayQuack() throws Exception {
        assertEquals("quack quack, i'm a trap!", duck.sayQuack());
    }

    public void testFly() throws Exception {
        assertEquals("This is no fly", duck.fly());
    }

}