package design_pattern.templateMethod;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CaffeineBeverageTest extends TestCase {

    private CaffeineBeverage drink;
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    public void setUp() throws Exception {
        System.setOut(new PrintStream(output, true, "UTF-8"));
    }

    public void testTea() {
        drink = new Tea();
        drink.prepareRecipe();
        assertEquals("Boil water\n" +
                "Steep tea bug\n" +
                "Pour in cup\n", output.toString());
    }
    public void testCoffee() {
        drink = new Coffee();
        drink.prepareRecipe();
        assertEquals("Boil water\n" +
                "Brew coffe grinds\n" +
                "Pour in cup\n" +
                "Add milk and sugar\n", output.toString());
    }

    public void tearDown() throws Exception {
        System.setOut(stdout);
    }
}