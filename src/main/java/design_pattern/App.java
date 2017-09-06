package design_pattern;

import design_pattern.factory.abstractFactory.pizzaStores.ChicagoStylePizzaStore;
import design_pattern.factory.abstractFactory.pizzaStores.NYStylePizzaStore;
import design_pattern.factory.abstractFactory.pizzaStores.PizzaStore;

public class App {
    public static void main( String[] args ) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("veggie");
        System.out.println("-------------------");
        pizzaStore.orderPizza("clam");
        System.out.println("-------------------");
        PizzaStore pizzaStore2 = new ChicagoStylePizzaStore();
        pizzaStore2.orderPizza("veggie");
        System.out.println("-------------------");
        pizzaStore2.orderPizza("clam");
    }
}
