package design_pattern.command;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SimpleRemoteControlTest extends TestCase {

    private SimpleRemoteControl remoteControl;
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    public void setUp() throws Exception {
        System.setOut(new PrintStream(output, true, "UTF-8"));

        remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        remoteControl.setCommand(new LightOFFCommand(light));
    }

    public void testButtonPress() {
        remoteControl.buttonWasPressed();
        assertEquals("Light off!\n", output.toString());
    }

    public void testButtonUndo() {
        remoteControl.buttonWasPressed();
        remoteControl.buttonUndoWasPressed();
        assertEquals("Light off!\nLight on!\n", output.toString());
    }

    public void tearDown() throws Exception {
        System.setOut(stdout);
    }
}