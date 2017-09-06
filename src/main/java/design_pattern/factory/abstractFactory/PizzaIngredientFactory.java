package design_pattern.factory.abstractFactory;

import design_pattern.factory.abstractFactory.ingredients.*;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSause();
    Cheese createCheese();
    List<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
