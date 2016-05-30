package Lesson28.factory.patterns.factory;

import Lesson28.factory.patterns.pizza.ChicagoCheesPizza;
import Lesson28.factory.patterns.pizza.ChicagoMeetPizza;
import Lesson28.factory.patterns.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public class ChPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new ChicagoCheesPizza();

            case "Meat":
                return new ChicagoMeetPizza();

            default:
                throw new RuntimeException("Unexpected pizza type."
                        + "Expected 'meat','Cheese', but fount" + type);
        }
    }

}
