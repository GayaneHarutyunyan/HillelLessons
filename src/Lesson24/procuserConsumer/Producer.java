package Lesson24.procuserConsumer;

/**
 * Created by User on 06.05.2016.
 */
public class Producer implements Runnable{
    private Bucket bucket;

    public Producer(Bucket bucket) {
        this.bucket = bucket;
    }

    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            bucket.put();
        }
    }
}