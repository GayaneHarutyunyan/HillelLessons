package Lesson10Patterns;

import Lesson10Patterns.quack.QuackBehaviour;

/**
 * Created by User on 15.03.2016.
 */
public abstract class Duck {

    QuackBehaviour quackBehaviour;

    public void fly() {
        System.out.println("I'm flaying");
    }

    public void swim() {
        System.out.println("I'm swiming");
    }

    public void quack() {
        quackBehaviour.quack();
    }
    public abstract void display();
}
