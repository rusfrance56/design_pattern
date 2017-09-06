package design_pattern.factory.factoryMethod.pizzaStores;

import design_pattern.factory.factoryMethod.pizzaTypes.chicago.ChicagoCheesePizza;
import design_pattern.factory.factoryMethod.pizzaTypes.chicago.ChicagoClaimPizza;
import design_pattern.factory.factoryMethod.pizzaTypes.chicago.ChicagoVeggiePizza;
import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new ChicagoCheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoVeggiePizza();
        } else if ("claim".equals(type)) {
            pizza = new ChicagoClaimPizza();
        }
        return pizza;
    }
}
