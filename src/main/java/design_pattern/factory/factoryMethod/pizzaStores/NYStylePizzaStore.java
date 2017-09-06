package design_pattern.factory.factoryMethod.pizzaStores;

import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;
import design_pattern.factory.factoryMethod.pizzaTypes.ny.NYCheesePizza;
import design_pattern.factory.factoryMethod.pizzaTypes.ny.NYVeggiePizza;
import design_pattern.factory.factoryMethod.pizzaTypes.ny.NYClaimPizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYVeggiePizza();
        } else if ("claim".equals(type)) {
            pizza = new NYClaimPizza();
        }
        return pizza;
    }
}
