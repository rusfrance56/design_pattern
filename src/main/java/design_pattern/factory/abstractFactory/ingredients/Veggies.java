package design_pattern.factory.abstractFactory.ingredients;

public abstract class Veggies implements NamedIngredient{

    private String name;

    public Veggies(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !o.getClass().isAssignableFrom(getClass())) return false;
//        if (o == null || !(o instanceof Veggies)) return false;

        Veggies veggies = (Veggies) o;

        return name != null ? name.equals(veggies.name) : veggies.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
