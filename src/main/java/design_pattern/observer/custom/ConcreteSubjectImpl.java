package design_pattern.observer.custom;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjectImpl implements Subject {
    private List<Observer> observers;
    private int temperature;
    private int humidity;

    public ConcreteSubjectImpl() {
        super();
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity));
    }
    public void notifyAllObservers(ConcreteSubjectImpl subject) {
        observers.forEach(observer -> observer.update(subject));
    }

    public void subjectChanged(int newTemperature, int newHumidity) {
        this.temperature = newTemperature;
        this.humidity = newHumidity;
        notifyAllObservers(this);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
}
