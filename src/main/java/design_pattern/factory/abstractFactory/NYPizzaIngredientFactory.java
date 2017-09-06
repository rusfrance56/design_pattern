package design_pattern.factory.abstractFactory;

import design_pattern.factory.abstractFactory.ingredients.*;
import design_pattern.factory.abstractFactory.ingredients.NYIngredients.*;
import design_pattern.factory.abstractFactory.ingredients.veggies.Garlic;
import design_pattern.factory.abstractFactory.ingredients.veggies.Mushroom;
import design_pattern.factory.abstractFactory.ingredients.veggies.Onion;
import design_pattern.factory.abstractFactory.ingredients.veggies.RedPapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSause() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return new ArrayList<>(Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPapper()));
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
