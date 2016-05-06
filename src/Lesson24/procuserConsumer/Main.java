package Lesson24.procuserConsumer;

/**
 * Created by User on 06.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Thread consumerThread = new Thread(new Consumer(bucket));
        Thread producerThread = new Thread(new Producer(bucket));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {

        }
        consumerThread.start();
        producerThread.start();

        consumerThread.interrupt();
        producerThread.interrupt();
        //  System.out.println("all thread are stopped");

        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("all thread are stopped");
        System.out.println(bucket);
    }
}
