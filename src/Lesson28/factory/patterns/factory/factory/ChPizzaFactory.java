package Lesson28.factory.patterns.factory.factory;



import Lesson28.factory.patterns.enums.PizzaType;
import Lesson28.factory.patterns.factory.pizza.ChicagoCheesePizza;
import Lesson28.factory.patterns.factory.pizza.ChicagoMeatPizza;
import Lesson28.factory.patterns.factory.pizza.Pizza;

public class ChPizzaFactory implements PizzaFactory {
    PizzaComponentsFactory pizzaComponentsFactory;

    public ChPizzaFactory(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new ChicagoCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new ChicagoMeatPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("Unexpexted pizza type. " +
                        "Expected 'Meat', 'Cheese', but found:" + type);
        }
    }
}




