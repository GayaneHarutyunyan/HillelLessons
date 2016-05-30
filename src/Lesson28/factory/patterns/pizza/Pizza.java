package Lesson28.factory.patterns.pizza;

import Lesson28.factory.patterns.pizza.ingedients.Cheese;
import Lesson28.factory.patterns.pizza.ingedients.Dough;
import Lesson28.factory.patterns.pizza.ingedients.Proteins;

/**
 * Created by User on 30.05.2016.
 */
public class Pizza {

    public Cheese cheese;
    public Dough dough;
    public Proteins proteins;

    public void bake() {
        System.out.println("Baking");
    }

    public void cut() {
        System.out.println("Cutting");
    }

    public void box() {
        System.out.println("Boxing");
    }
}
