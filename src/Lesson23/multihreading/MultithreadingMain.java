package Lesson23.multihreading;


public class MultithreadingMain {

    public static void main(String[] args) {
        Thread anotherThread = new Thread(new NumberPrinter());
        anotherThread.start();
        //new NumberPrinter().run();
        System.out.println("Waiting on second thread");

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //хочу чтобы поралельный поток завершил свою работу.
        anotherThread.interrupt();

        try {
            anotherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finish");
    }
}
