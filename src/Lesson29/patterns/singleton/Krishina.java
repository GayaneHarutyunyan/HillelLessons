package Lesson29.patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class Krishina implements God {
        @Override
        public void create() {
            System.out.println("Created universe instantly");
        }

        @Override
        public void heal() {
            System.out.println("Think you are healthy");
        }

        @Override
        public String getName() {
            return "Krishna";
        }
    }