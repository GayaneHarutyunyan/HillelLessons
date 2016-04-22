package Lesson21.sockets;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        new Client().start();


    }

    public void start() {
        //нужно передть айпи адресс и порт
        try {
            Socket socket = new Socket("192.168.1.111", 3502);
            //PrintWriter примет от пользователя обьект socket.getOutputStream() вернет нам байт
            start(socket.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startWriter(OutputStream outputStream) {
        try {
            start(new FileOutputStream("sadf"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void start(OutputStream outputStream) {
        //PrintWriter примет от пользователя обьект socket.getOutputStream() вернет нам байт

        PrintWriter writer = new PrintWriter(outputStream);
        writer.print("hello");

    }

    public void start1() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            scanner.next();
            String message = scanner.next();
            if (message.equals("exit")) {
                break;
            }
            Send(message);
        }
    }

    private void Send(String message) {

        try (Socket socket = new Socket("192.168.1.111", 3502);
             PrintWriter writer = new PrintWriter(socket.getOutputStream())) {

            writer.print(message);
            writer.flush();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}


