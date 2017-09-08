package design_pattern.templateMethod;

public class Tea extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Add lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steep tea bug");
    }

    @Override
    public Boolean customerWantCondiments() {
        return false;
    }
}
