package Lesson21.sockets;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by User on 22.04.2016.
 */
public class Server {
    public static void main(String[] a) {
        Server server = new Server();
        server.start();

    }


    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(3502)) {
            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                try {
                    String message = reader.readLine();
                    System.out.println(message);
                } catch (IOException ignore) {
                    reader.close();
                    socket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
