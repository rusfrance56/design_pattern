package design_pattern.observer.custom;

public class ConcreteObserverImpl implements Observer {

    private int temperature;
    private int humidity;
    private Subject subject;

    public ConcreteObserverImpl(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubjectImpl) {
            ConcreteSubjectImpl subject1 = (ConcreteSubjectImpl) subject;
            this.temperature = subject1.getTemperature();
            this.humidity = subject1.getHumidity();
            display();
        }
    }

    public String display() {
        return "HELLO! " + this.temperature + " " + this.humidity;
    }
}
