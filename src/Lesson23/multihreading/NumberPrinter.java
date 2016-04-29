package Lesson23.multihreading;


public class NumberPrinter  implements Runnable  {

    public void run() {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();

        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ignored) {
               currentThread.interrupt();
            }
            System.out.println(name + " " + i);
            if (currentThread.isInterrupted()) {
                return;
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}