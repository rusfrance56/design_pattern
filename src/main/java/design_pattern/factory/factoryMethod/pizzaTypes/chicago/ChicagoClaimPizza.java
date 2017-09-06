package design_pattern.factory.factoryMethod.pizzaTypes.chicago;

import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;

public class ChicagoClaimPizza extends Pizza {

    public ChicagoClaimPizza() {
        this.name = "Chicago style claim pizza";
        this.dough = "Extra thick";
        this.sauce = "Plum tomato";
        this.toppings.add("Shredder Mozzarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
