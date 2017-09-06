package design_pattern.factory.abstractFactory.pizzaStores;

import design_pattern.factory.abstractFactory.NYPizzaIngredientFactory;
import design_pattern.factory.abstractFactory.PizzaIngredientFactory;
import design_pattern.factory.abstractFactory.pizzaTypes.CheesePizza;
import design_pattern.factory.abstractFactory.pizzaTypes.Pizza;
import design_pattern.factory.abstractFactory.pizzaTypes.ClamPizza;
import design_pattern.factory.abstractFactory.pizzaTypes.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY cheese pizza!");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY veggie pizza!");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY clam pizza!");
        }
        return pizza;
    }
}
