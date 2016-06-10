package Lesson29.patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public interface God {
    void create();

    void heal();

    String getName();

    default void resurect() {
        System.out.println("Resurected");
    }


}