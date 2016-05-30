package Lesson28.factory.patterns.factory;

import Lesson28.factory.patterns.enums.PizzaType;
import Lesson28.factory.patterns.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public interface PizzaFactory {

    Pizza createPizza(PizzaType type);
}
