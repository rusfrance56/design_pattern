package design_pattern.factory.factoryMethod.pizzaTypes.ny;

import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;

public class NYVeggiePizza extends Pizza {

    public NYVeggiePizza() {
        this.name = "NY veggie pizza";
        this.dough = "Thin dough";
        this.sauce = "Marinara";
        this.toppings.add("Grated Reggiano cheese");
    }
}
