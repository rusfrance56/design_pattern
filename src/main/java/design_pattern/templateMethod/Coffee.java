package design_pattern.templateMethod;

public class Coffee extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Add milk and sugar");
    }

    @Override
    public void brew() {
        System.out.println("Brew coffe grinds");
    }
}
