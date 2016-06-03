package Lesson29.patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //commonReligiousQuestion();
        //lazyExample();

        TheGod god1;
        TheGod god2;
        int i = 0;
        do {
            GodExtracter extracter1 = new GodExtracter();
            GodExtracter extracter2 = new GodExtracter();

            Thread thread1 = new Thread(extracter1);
            Thread thread2 = new Thread(extracter2);

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            god1 = extracter1.god;
            god2 = extracter2.god;
            i++;
            TheGod.clear();
        }

        while (god1 == god2);

        System.out.println("Heretic! attempts: " + i);


    }

    private static void lazyExample() throws InterruptedException {
        //Сингнатон Ленивая реализация
        System.out.println("many time ...");
        TheGod.prophet();
        Thread.sleep(3000);

        if (Math.random() < 0.5) {
            return;
        }

        System.out.println("users instances ");
        God theGod1 = TheGod.getInstance();
        God theGod2 = TheGod.getInstance();
        God theGod3 = TheGod.getInstance();
    }

    private static void commonReligiousQuestion() {
        God theGod = TheGod.getInstance();
        God krishna = new Krishina();

        Beliver.god = theGod;
        Beliver ivan = new Beliver();
        ivan.name = "Ivan";

        Beliver petro = new Beliver();
        petro.name = "Petro";

        System.out.println(ivan);
        System.out.println(petro);

        Beliver.god = krishna;

        System.out.println(ivan);
        System.out.println(petro);
    }


}
