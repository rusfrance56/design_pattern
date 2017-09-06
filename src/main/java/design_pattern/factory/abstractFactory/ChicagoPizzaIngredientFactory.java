package design_pattern.factory.abstractFactory;

import design_pattern.factory.abstractFactory.ingredients.*;
import design_pattern.factory.abstractFactory.ingredients.ChicagoIngredients.ExtraThickDough;
import design_pattern.factory.abstractFactory.ingredients.ChicagoIngredients.FrozenClams;
import design_pattern.factory.abstractFactory.ingredients.ChicagoIngredients.MozzarellaCheese;
import design_pattern.factory.abstractFactory.ingredients.ChicagoIngredients.PlumTomatoSauce;
import design_pattern.factory.abstractFactory.ingredients.NYIngredients.SlicedPepperoni;
import design_pattern.factory.abstractFactory.ingredients.veggies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ExtraThickDough();
    }

    @Override
    public Sauce createSause() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return new ArrayList<>(Arrays.asList(new BlackOlives(), new Spinach(), new EggPlant()));
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
