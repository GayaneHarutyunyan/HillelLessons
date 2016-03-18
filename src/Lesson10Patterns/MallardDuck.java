package Lesson10Patterns;

import Lesson10Patterns.fly.Fly;
import Lesson10Patterns.quack.Quack;
import Lesson10Patterns.quack.QuackBehaviour;

/**
 * Created by User on 15.03.2016.
 */

    public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("mallard duck");
    }

    }
