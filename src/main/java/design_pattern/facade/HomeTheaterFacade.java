package design_pattern.facade;

public class HomeTheaterFacade {
    private TV tv;
    private PopcornMachine popcornMachine;

    public HomeTheaterFacade(TV tv, PopcornMachine popcornMachine) {
        this.tv = tv;
        this.popcornMachine = popcornMachine;
    }

    public void watchMovie() {
        popcornMachine.putCornIntoMachine();
        popcornMachine.turnOnMachine();
        tv.turnON();
        tv.volumeUp();
    }

    public void createPopcorn() {
        popcornMachine.putCornIntoMachine();
        popcornMachine.turnOnMachine();
    }
}
