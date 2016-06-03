package Lesson28.factory.patterns.factory.factory;

import Lesson28.factory.patterns.factory.pizza.ingedients.cheese.Cheese;
import Lesson28.factory.patterns.factory.pizza.ingedients.cheese.Parmejano;
import Lesson28.factory.patterns.factory.pizza.ingedients.dough.Dough;
import Lesson28.factory.patterns.factory.pizza.ingedients.dough.Thick;
import Lesson28.factory.patterns.factory.pizza.ingedients.proteins.Meat;
import Lesson28.factory.patterns.factory.pizza.ingedients.proteins.Proteins;

/**
 * Created by User on 03.06.2016.
 */
public class ChPizzaComponentFactory implements PizzaComponentsFactory {
    @Override
    public Cheese createCheese() {
        return new Parmejano();
    }

    @Override
    public Dough createDough() {
        return new Thick();
    }

    @Override
    public Proteins createProteins() {
        return new Meat();
    }
}

