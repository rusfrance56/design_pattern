package design_pattern.templateMethod;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boil water");
    }

    public void pourInCup() {
        System.out.println("Pour in cup");
    }

    public abstract void addCondiments();

    public abstract void brew();

    public Boolean customerWantCondiments() {
        return true;
    }
}
