package Lesson28.factory.patterns.factory.pizza;

import Lesson28.factory.patterns.factory.pizza.ingedients.cheese.Cheese;
import Lesson28.factory.patterns.factory.pizza.ingedients.dough.Dough;
import Lesson28.factory.patterns.factory.pizza.ingedients.proteins.Proteins;

/**
 * Created by User on 03.06.2016.
 */
public class Pizza {

    public Cheese cheese;
    public Dough dough;
    public Proteins proteins;

    public void bake(){
        System.out.println("Baking...");
    }
    public void cut(){
        System.out.println("Cutting");
    }
    public void box(){
        System.out.println("Boxing");
    }

}
