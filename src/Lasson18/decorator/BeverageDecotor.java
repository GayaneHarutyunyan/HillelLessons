package Lasson18.decorator;

/**
 * Created by User on 12.04.2016.
 */
public abstract class BeverageDecotor implements Beverage {
    private Beverage beverage;

    public BeverageDecotor(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return beverage.cost();
    }

    public String description() {
        return beverage.description();
    }
}
