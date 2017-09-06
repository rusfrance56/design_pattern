package design_pattern.factory.factoryMethod.pizzaTypes.ny;

import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;

public class NYClaimPizza extends Pizza {

    public NYClaimPizza() {
        this.name = "NY claim pizza";
        this.dough = "Thin dough";
        this.sauce = "Marinara";
        this.toppings.add("Grated Reggiano cheese");
    }
}
