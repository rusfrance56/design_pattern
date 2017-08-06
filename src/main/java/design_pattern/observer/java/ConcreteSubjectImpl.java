package design_pattern.observer.java;

import java.util.Observable;

public class ConcreteSubjectImpl extends Observable {
    private int temperature;
    private int humidity;

    public void subjectChanged(int newTemperature, int newHumidity) {
        this.temperature = newTemperature;
        this.humidity = newHumidity;
        setChanged();
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
}
