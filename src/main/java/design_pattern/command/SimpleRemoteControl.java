package design_pattern.command;

public class SimpleRemoteControl {
    private Command slot;
    private Command undo;

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        this.slot.execute();
        this.undo = slot;
    }

    public void buttonUndoWasPressed() {
        this.undo.undo();
    }
}
