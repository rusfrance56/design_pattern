package design_pattern.command;

public class LightOFFCommand implements Command {

    private Light light;

    public LightOFFCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOFF();
    }

    @Override
    public void undo() {
        this.light.lightON();
    }
}
