package Lesson28.factory.patterns;

import Lesson28.factory.patterns.enums.PizzaType;
import Lesson28.factory.patterns.factory.ChPizzaFactory;
import Lesson28.factory.patterns.factory.NyPizzaFactory;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory());
        nyPizzaStore.order(PizzaType.CHEESE);
        PizzaStore chPizzaStore = new PizzaStore(new ChPizzaFactory());
        chPizzaStore.order(PizzaType.MEAT);
    }
}
