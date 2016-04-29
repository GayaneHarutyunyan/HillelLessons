package lesson22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class MessageHandler implements Runnable {
    private Socket socket;

    public MessageHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Socket socket1 = this.socket;
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket1.getInputStream()))) {
            //Вечный цыкол пока не придет нулл
            while (true) {
                String message = reader.readLine();
                if (message != null) {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + ": " + message);
                }
            }
        } catch (IOException ignored) {
            System.out.println(ignored.getMessage());
        }
    }
}
