package Lasson18.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Houseblend implements Beverage {

    @Override
    public int cost() {
       // int dopingCost = super.cost();
        return 10;
    }

    @Override
    public String description() {
        return "HouseBlend coffee ";
    }
}
