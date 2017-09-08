package design_pattern.adapter;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TurkeyAdapterTest extends TestCase {

    private Duck adapter;
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    public void setUp() throws Exception {
        System.setOut(new PrintStream(output, true, "UTF-8"));

        Turkey turkey = new WildTurkey();
        adapter = new TurkeyAdapter(turkey);
    }

    public void testAdapter() throws Exception {
        adapter.quack();
        assertEquals("Gobble gobble!\n", output.toString());
    }

    public void tearDown() throws Exception {
        System.setOut(stdout);
    }

}