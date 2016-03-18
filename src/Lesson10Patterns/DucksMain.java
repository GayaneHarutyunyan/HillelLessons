package Lesson10Patterns;

import Lesson10Patterns.fly.Rocket;

/**
 * Created by User on 18.03.2016.
 */
public class DucksMain {
    public static void main(String[] args) {
        Duck justDuck = new RubberDuck();

        justDuck.display();
        justDuck.quack();
        justDuck.fly();

        justDuck.setFlyBehaviour(new Rocket());

        justDuck.fly();

    }

    public static void duckWork(Duck[] ducks){

    }

}