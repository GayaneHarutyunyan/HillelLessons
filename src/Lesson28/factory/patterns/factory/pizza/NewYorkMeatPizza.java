package Lesson28.factory.patterns.factory.pizza;

import Lesson28.factory.patterns.factory.factory.PizzaComponentsFactory;

/**
 * Created by User on 03.06.2016.
 */
public class NewYorkMeatPizza extends Pizza
{
    public NewYorkMeatPizza(PizzaComponentsFactory pizzaComponentsFactory) {
        dough = pizzaComponentsFactory.createDough();
        cheese = pizzaComponentsFactory.createCheese();
        proteins = pizzaComponentsFactory.createProteins();
    }

    @Override
    public void box(){
        System.out.println("Boxing in New York box");
    }
}
