package design_pattern.factory.factoryMethod.pizzaTypes;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();


    public void prepare(){
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing " + this.dough + " dough");
        System.out.println("Adding sauce " + this.sauce);
        System.out.println("Adding toppings: ");
        toppings.stream().forEach(topping -> System.out.println("\t"+topping));
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting a pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (name != null ? !name.equals(pizza.name) : pizza.name != null) return false;
        if (dough != null ? !dough.equals(pizza.dough) : pizza.dough != null) return false;
        if (sauce != null ? !sauce.equals(pizza.sauce) : pizza.sauce != null) return false;
        return toppings != null ? toppings.equals(pizza.toppings) : pizza.toppings == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (dough != null ? dough.hashCode() : 0);
        result = 31 * result + (sauce != null ? sauce.hashCode() : 0);
        result = 31 * result + (toppings != null ? toppings.hashCode() : 0);
        return result;
    }
}
