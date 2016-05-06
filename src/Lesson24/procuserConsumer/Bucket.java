package Lesson24.procuserConsumer;

public class Bucket {
    private int counter;
    private long changesCounter;

    public synchronized void get() {
        while (counter <= 0) {
            try {
                wait();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        counter--;
        changesCounter++;
        notifyAll();
        check();
    }

    public synchronized void put() {
        if (counter >= 1000) {
            try {
                wait();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        counter++;
        changesCounter++;
        notifyAll();
        check();
    }


    private void check() {
        if (counter < 0 || counter > 1000) {
            System.out.println("error: counter" + counter);
        }
    }

    @Override
    public String toString() {
        return "Bucket{" +
                " counter " + counter +
                " changesCounter " + changesCounter +
                "}";
    }
}
