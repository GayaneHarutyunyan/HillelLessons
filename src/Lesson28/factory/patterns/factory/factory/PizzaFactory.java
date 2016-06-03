package Lesson28.factory.patterns.factory.factory;


import Lesson28.factory.patterns.enums.PizzaType;
import Lesson28.factory.patterns.factory.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(PizzaType type);
}