package Lesson28.factory.patterns.factory.factory;

import Lesson28.factory.patterns.factory.pizza.ingedients.cheese.Cheese;
import Lesson28.factory.patterns.factory.pizza.ingedients.dough.Dough;
import Lesson28.factory.patterns.factory.pizza.ingedients.proteins.Proteins;

public interface PizzaComponentsFactory {

    Cheese createCheese();

    Dough createDough();

    Proteins createProteins();
}