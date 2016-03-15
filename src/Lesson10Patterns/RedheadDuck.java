package Lesson10Patterns;

import Lesson10Patterns.quack.Quack;

/**
 * Created by User on 15.03.2016.
 */
public class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Redhead duck");
    }

    public RedheadDuck() {
        quackBehaviour = new Quack();
    }


}

