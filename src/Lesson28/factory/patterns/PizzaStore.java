package Lesson28.factory.patterns;

import Lesson28.factory.patterns.factory.PizzaFactory;
import Lesson28.factory.patterns.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaStore {

    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza order(String type) {
        Pizza pizza;

        pizza = pizzaFactory.createPizza(type);


        //   pizza = createPizza(region, type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    /*
    private Pizza createPizza(String region, String type) {
        Pizza pizza;

        if (region.equals("CH")) {


            switch (type) {
                case "Cheese":
                    return new ChicagoCheesPizza();

                case "Meat":
                    return new ChicagoMeetPizza();

                default:
                    throw new RuntimeException("Unexpected pizza type."
                            + "Expected 'meat','Cheese', but fount" + type);
            }
        } else if (region.equals("NY")) {
            switch (type) {
                case "Cheese":
                    return new NewYorkCheesPizza();

                case "Meat":
                    return new NewYorkMeetPizza();

                default:
                    throw new RuntimeException("Unexpected pizza type."
                            + "Expected 'meat','Cheese', but fount" + type);
            }
        } else {
            throw new RuntimeException("  ... ");
        }
        // return pizza;
    }
    */
}
