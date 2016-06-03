package Lesson28.factory.patterns.factory.factory;



import Lesson28.factory.patterns.enums.PizzaType;
import Lesson28.factory.patterns.factory.pizza.NewYorkCheesePizza;
import Lesson28.factory.patterns.factory.pizza.NewYorkMeatPizza;
import Lesson28.factory.patterns.factory.pizza.Pizza;

/**
 * Created by User on 03.06.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    PizzaComponentsFactory pizzaComponentsFactory;

    public NyPizzaFactory(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new NewYorkCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new NewYorkMeatPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("Unexpexted pizza type. " +
                        "Expected 'Meat', 'Cheese', but found:" + type);
        }
    }


}