package design_pattern.factory.abstractFactory.pizzaStores;

import design_pattern.factory.abstractFactory.ChicagoPizzaIngredientFactory;
import design_pattern.factory.abstractFactory.PizzaIngredientFactory;
import design_pattern.factory.abstractFactory.pizzaTypes.CheesePizza;
import design_pattern.factory.abstractFactory.pizzaTypes.ClamPizza;
import design_pattern.factory.abstractFactory.pizzaTypes.Pizza;
import design_pattern.factory.abstractFactory.pizzaTypes.VeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago cheese pizza!");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago veggie pizza!");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago clam pizza!");
        }
        return pizza;
    }
}
