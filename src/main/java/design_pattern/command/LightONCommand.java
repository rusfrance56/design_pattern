package design_pattern.command;

public class LightONCommand implements Command {

    private Light light;

    public LightONCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightON();
    }

    @Override
    public void undo() {
        this.light.lightOFF();
    }
}
