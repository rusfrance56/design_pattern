package design_pattern.observer.custom;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}
