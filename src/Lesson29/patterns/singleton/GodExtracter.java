package Lesson29.patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class GodExtracter implements Runnable{
        TheGodSingleton god;
        @Override
        public void run() {
            god = TheGodSingleton.getInstance();
        }
    }