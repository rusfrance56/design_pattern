package design_pattern.observer.java;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserverImpl implements Observer {

    private Observable subject;
    private int temperature;
    private int humidity;

    public ConcreteObserverImpl(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public String display() {
        return "HELLO! " + this.temperature + " " + this.humidity;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ConcreteSubjectImpl) {
            ConcreteSubjectImpl object = (ConcreteSubjectImpl) o;
            this.temperature = object.getTemperature();
            this.humidity = object.getHumidity();
            display();
        }
    }
}
