package design_pattern.strategy.entity;

import junit.framework.TestCase;

public class RedDuckTest extends TestCase {

    private Duck duck;

    public void setUp() throws Exception {
        super.setUp();
        duck = new RedDuck();
    }

    public void testShow() throws Exception {
        assertEquals("This is red duck!", duck.show());
    }

    public void testSayQuack() throws Exception {
        assertEquals("quack quack!", duck.sayQuack());
    }

    public void testFly() throws Exception {
        assertEquals("This is simple fly", duck.fly());
    }
    //TODO сделать класс приманка и тесты для нее
}