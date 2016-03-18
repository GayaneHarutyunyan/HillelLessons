package Lesson10Patterns;

import Lesson10Patterns.fly.FlyNoWay;
import Lesson10Patterns.quack.Squick;

/**
 * Created by User on 15.03.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehaviour = new Squick();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }
}