package design_pattern.factory.abstractFactory.pizzaTypes;

import design_pattern.factory.abstractFactory.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected List<Veggies> toppings = new ArrayList<>();

    public abstract Pizza prepare();
    public void printProcess(){
        System.out.println("Tossing " + this.dough.getName());
        System.out.println("Adding sauce " + this.sauce.getName());
        System.out.print(null != pepperoni ? "Adding pepperoni " + pepperoni.getName() + "\n": "");
        System.out.print(null != clams ? "Adding clams " + clams.getName() + "\n": "");
        System.out.println("Adding toppings: ");
        toppings.stream().forEach(topping -> System.out.println("\t"+topping.getName()));
        System.out.println("Adding cheese " + cheese.getName());
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

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public List<Veggies> getToppings() {
        return toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (dough != null ? !dough.getName().equals(pizza.dough.getName()) : pizza.dough != null) return false;
        if (sauce != null ? !sauce.getName().equals(pizza.sauce.getName()) : pizza.sauce != null) return false;
        if (cheese != null ? !cheese.getName().equals(pizza.cheese.getName()) : pizza.cheese != null) return false;
        if (pepperoni != null ? !pepperoni.getName().equals(pizza.pepperoni.getName()) : pizza.pepperoni != null) return false;
        if (clams != null ? !clams.getName().equals(pizza.clams.getName()) : pizza.clams != null) return false;
        return toppings != null ? toppings.equals(pizza.toppings) : pizza.toppings == null;
    }

    @Override
    public int hashCode() {
        int result = dough != null ? dough.hashCode() : 0;
        result = 31 * result + (sauce != null ? sauce.hashCode() : 0);
        result = 31 * result + (cheese != null ? cheese.hashCode() : 0);
        result = 31 * result + (pepperoni != null ? pepperoni.hashCode() : 0);
        result = 31 * result + (clams != null ? clams.hashCode() : 0);
        result = 31 * result + (toppings != null ? toppings.hashCode() : 0);
        return result;
    }
}
