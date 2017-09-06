package design_pattern.factory.factoryMethod.pizzaStores;

import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;
import design_pattern.factory.factoryMethod.pizzaTypes.chicago.ChicagoVeggiePizza;
import junit.framework.TestCase;

public class ChicagoPizzaStoreTest extends TestCase {
    private PizzaStore pizzaStore;

    public void setUp() throws Exception {
        this.pizzaStore = new ChicagoStylePizzaStore();
    }

    public void testOrderPizza() throws Exception {
        Pizza veggie = pizzaStore.orderPizza("veggie");
        assertEquals(new ChicagoVeggiePizza(), veggie);
    }

}