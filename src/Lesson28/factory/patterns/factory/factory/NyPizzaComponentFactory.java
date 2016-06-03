package Lesson28.factory.patterns.factory.factory;

import Lesson28.factory.patterns.factory.pizza.ingedients.cheese.Cheese;
import Lesson28.factory.patterns.factory.pizza.ingedients.cheese.Mozarella;
import Lesson28.factory.patterns.factory.pizza.ingedients.dough.Dough;
import Lesson28.factory.patterns.factory.pizza.ingedients.dough.Thin;
import Lesson28.factory.patterns.factory.pizza.ingedients.proteins.Proteins;
import Lesson28.factory.patterns.factory.pizza.ingedients.proteins.Seafood;

/**
 * Created by User on 03.06.2016.
 */
public class NyPizzaComponentFactory implements PizzaComponentsFactory {
    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Dough createDough() {
        return new Thin();
    }

    @Override
    public Proteins createProteins() {
        return new Seafood();
    }
}





