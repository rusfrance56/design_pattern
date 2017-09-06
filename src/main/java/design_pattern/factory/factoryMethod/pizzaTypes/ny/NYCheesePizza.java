package design_pattern.factory.factoryMethod.pizzaTypes.ny;

import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        this.name = "NY cheese pizza";
        this.dough = "Thin dough";
        this.sauce = "Marinara";
        this.toppings.add("Grated Reggiano cheese");
    }
}
