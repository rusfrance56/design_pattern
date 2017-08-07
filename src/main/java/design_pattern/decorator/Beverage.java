package design_pattern.decorator;

public abstract class Beverage {

    private String description;

    public  String getDescription(){
        return description;
    }

    public abstract double cost();
}
