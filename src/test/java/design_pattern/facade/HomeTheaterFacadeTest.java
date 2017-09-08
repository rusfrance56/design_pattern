package design_pattern.facade;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HomeTheaterFacadeTest extends TestCase {

    private HomeTheaterFacade facade;
    private final PrintStream sysout = System.out;
    private final ByteArrayOutputStream newOut = new ByteArrayOutputStream();
    private TV tv;
    private PopcornMachine popcornMachine;

    public void setUp() throws Exception {
        System.setOut(new PrintStream(newOut, true, "UTF-8"));
        tv = new TV();
        popcornMachine = new PopcornMachine();
        facade = new HomeTheaterFacade(tv, popcornMachine);
    }

    public void testWatchMovie() throws Exception {
        facade.watchMovie();
        String trueVal = "put corn into machine\nturn ON corn machine!\nturn on TV!\nVolume up\n";
        assertEquals(trueVal, newOut.toString());
    }

    public void testCreatePopcorn() throws Exception {
        facade.createPopcorn();
        String trueVal = "put corn into machine\nturn ON corn machine!\n";
        assertEquals(trueVal, newOut.toString());
    }

    public void tearDown() throws Exception {
        System.setOut(sysout);
    }

}