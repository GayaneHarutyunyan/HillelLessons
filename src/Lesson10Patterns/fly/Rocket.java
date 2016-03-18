package Lesson10Patterns.fly;

/**
 * Created by User on 18.03.2016.
 */

    public class Rocket implements FlyBehaviour {
        @Override
        public void fly() {
            System.out.println("YAHOOOO! I'm flying on the rocket!!!");
        }
    }