package Lesson29.patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class TheGod implements God {

    private static TheGod instance = new TheGod();

    public static TheGod getInstance() {
        if (instance == null) {
            synchronized (TheGod.class) {
                if (instance == null) {
                    instance = new TheGod();
                }
            }
        }
        return instance;
    }

    private TheGod() {
        System.out.println("God always been here here! ");

    }

    @Override
    public void crete() {
        System.out.println("All the world in 7 days");
    }

    @Override
    public void heal() {
        System.out.println("Stand up and go!");
    }

    @Override
    public String getName() {
        return "God";
    }

    public static void prophet() {
        System.out.println("Jesus ");
    }

    public static void clear() {
        instance = null;
    }
}
