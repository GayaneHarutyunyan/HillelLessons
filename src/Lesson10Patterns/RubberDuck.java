package Lesson10Patterns;

import Lesson10Patterns.quack.QuackBehaviour;
import Lesson10Patterns.quack.Squack;

/**
 * Created by User on 15.03.2016.
 */
public class RubberDuck extends Duck {


    public RubberDuck(){
   quackBehaviour= (QuackBehaviour) new Squack();
    }
    @Override
    public void display() {
        System.out.println(" Rubber duck");
    }

    @Override
    public void fly() {
        System.out.println("I can't flaying");
    }
}
