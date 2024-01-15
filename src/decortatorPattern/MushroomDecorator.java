package decortatorPattern;

public class MushroomDecorator extends ToppingDecorator{

    BasePizza basePizza;

    public MushroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return basePizza.cost() + 30.0;
    }
}
