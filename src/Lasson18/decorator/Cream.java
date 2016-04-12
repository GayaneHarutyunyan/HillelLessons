package Lasson18.decorator;


import java.util.concurrent.BrokenBarrierException;

/**
 * Created by User on 12.04.2016.
 */
public class Cream extends BrokenBarrierException {
    public Cream(Beverage beverage) {
        super(beverage);
    }


}
