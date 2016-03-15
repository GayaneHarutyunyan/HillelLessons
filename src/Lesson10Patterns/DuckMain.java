package Lesson10Patterns;

/**
 * Created by User on 15.03.2016.
 */
public class DuckMain
{
    public static void main(String[] args) {
        Duck duck =new RubberDuck();
        duck.display();
        duck.quack();
        duck.fly();

        RubberDuck rubberDuck=(RubberDuck) duck;
        rubberDuck.display();
    }
}
