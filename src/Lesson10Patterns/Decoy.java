package Lesson10Patterns;

/**
 * Created by User on 15.03.2016.
 */
public class Decoy extends Duck{

    @Override
    public void quack() {
            System.out.println("i can't quack");
    }

    @Override
    public void display() {
        System.out.println("decoy");
    }

    @Override
    public void swim() {
        System.out.println("I can't swiming");
    }

    @Override
    public void fly() {
        System.out.println("I can't flaying");
    }
}
