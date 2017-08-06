package design_pattern.observer.custom;

public interface Observer {
    void update(int temperature, int humidity);

    void update(Subject subject);
}
