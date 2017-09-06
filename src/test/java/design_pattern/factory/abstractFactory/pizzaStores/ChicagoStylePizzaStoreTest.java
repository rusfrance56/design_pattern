package design_pattern.factory.abstractFactory.pizzaStores;

import design_pattern.factory.abstractFactory.ChicagoPizzaIngredientFactory;
import design_pattern.factory.abstractFactory.pizzaTypes.CheesePizza;
import design_pattern.factory.abstractFactory.pizzaTypes.ClamPizza;
import design_pattern.factory.abstractFactory.pizzaTypes.Pizza;
import design_pattern.factory.abstractFactory.pizzaTypes.VeggiePizza;
import junit.framework.TestCase;

public class ChicagoStylePizzaStoreTest extends TestCase {

    private PizzaStore pizzaStore;

    public void setUp() throws Exception {
        pizzaStore = new ChicagoStylePizzaStore();
    }

    public void testOrderPizza() throws Exception {
        Pizza veggie = pizzaStore.orderPizza("veggie");
        assertEquals(new VeggiePizza(new ChicagoPizzaIngredientFactory()).prepare(), veggie);
        Pizza clam = pizzaStore.orderPizza("clam");
        assertEquals(new ClamPizza(new ChicagoPizzaIngredientFactory()).prepare(), clam);
        Pizza cheese = pizzaStore.orderPizza("cheese");
        assertEquals(new CheesePizza(new ChicagoPizzaIngredientFactory()).prepare(), cheese);
    }
}