package Lesson10Patterns;

import Lesson10Patterns.fly.Fly;
import Lesson10Patterns.quack.Quack;

/**
 * Created by User on 15.03.2016.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("redhead duck");
    }


}

