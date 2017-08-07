package design_pattern.decorator;

import design_pattern.decorator.added_content.Mocha;
import design_pattern.decorator.added_content.Soy;
import design_pattern.decorator.added_content.Sugar;
import design_pattern.decorator.added_content.Whip;
import design_pattern.decorator.drink.Espresso;
import junit.framework.TestCase;

public class BeverageTest extends TestCase {

    private Beverage beverage;

    @Override
    public void setUp() {
        this.beverage = new Espresso();
        this.beverage = new Mocha(this.beverage);
        this.beverage = new Sugar(this.beverage);
        this.beverage = new Soy(this.beverage);
        this.beverage = new Whip(this.beverage);
    }
    
    public void testCostEspressoMochaSugarSoyWhip() throws Exception{
        assertEquals(2.44, this.beverage.cost());
    }

    public void testDescriptionEspressoMochaSugarSoyWhip() throws Exception{
        assertEquals("Espresso, Mocha, sugar, soy, whip", this.beverage.getDescription());
    }
}
