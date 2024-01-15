package decortatorPattern;

public class PannerDecorator extends ToppingDecorator {

    BasePizza basePizza;

    public PannerDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return basePizza.cost() + 50.0;
    }
}