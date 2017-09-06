package design_pattern.factory.abstractFactory.pizzaStores;

import design_pattern.factory.abstractFactory.NYPizzaIngredientFactory;
import design_pattern.factory.abstractFactory.pizzaTypes.CheesePizza;
import design_pattern.factory.abstractFactory.pizzaTypes.ClamPizza;
import design_pattern.factory.abstractFactory.pizzaTypes.Pizza;
import design_pattern.factory.abstractFactory.pizzaTypes.VeggiePizza;
import junit.framework.TestCase;

public class NYStylePizzaStoreTest extends TestCase {

    private PizzaStore pizzaStore;

    public void setUp() throws Exception {
        pizzaStore = new NYStylePizzaStore();
    }

    public void testOrderPizza() throws Exception {
        Pizza veggie = pizzaStore.orderPizza("veggie");
        assertEquals(new VeggiePizza(new NYPizzaIngredientFactory()).prepare(), veggie);
        Pizza clam = pizzaStore.orderPizza("clam");
        assertEquals(new ClamPizza(new NYPizzaIngredientFactory()).prepare(), clam);
        Pizza cheese = pizzaStore.orderPizza("cheese");
        assertEquals(new CheesePizza(new NYPizzaIngredientFactory()).prepare(), cheese);
    }

}