package design_pattern.factory.factoryMethod.pizzaStores;

import design_pattern.factory.factoryMethod.pizzaTypes.Pizza;
import design_pattern.factory.factoryMethod.pizzaTypes.ny.NYClaimPizza;
import junit.framework.TestCase;

public class NYPizzaStoreTest extends TestCase {

    private PizzaStore pizzaStore;

    public void setUp() throws Exception {
        this.pizzaStore = new NYStylePizzaStore();
    }

    public void testOrderPizza() throws Exception {
        Pizza claim = pizzaStore.orderPizza("claim");
        assertEquals(new NYClaimPizza(), claim);
    }

}