package Lesson28.factory.patterns.factory;

import Lesson28.factory.patterns.pizza.NewYorkCheesPizza;
import Lesson28.factory.patterns.pizza.NewYorkMeetPizza;
import Lesson28.factory.patterns.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new NewYorkCheesPizza();

            case "Meat":
                return new NewYorkMeetPizza();

            default:
                throw new RuntimeException("Unexpected pizza type."
                        + "Expected 'meat','Cheese', but fount" + type);
        }
    }
}
