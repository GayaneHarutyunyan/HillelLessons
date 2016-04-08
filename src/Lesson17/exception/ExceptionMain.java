package Lesson17.exception;

import java.util.Random;

/**
 * Created by User on 08.04.2016.
 */
public class ExceptionMain {

    public static void main(String[] args) throws InterruptedException {
        //unchecedExample();
        try {
            checkedExample();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            dangerStaff();
        } catch (RuntimeException e) {
            if (e instanceof ArithmeticException) {
                System.out.println(e);
            }
            if (e instanceof MyOwnOutOfIndexException) {
                System.out.println(e);
            }
        }
        System.out.println("end of program ");

    }

    public static void dangerStaff() {
        if (new Random().nextDouble() > 0.5) {
            doWorkWithList();
        } else {
            divide(1, 0);
        }
    }

    private static void doWorkWithList() {
        throw new MyOwnOutOfIndexException("bbllaa ");
    }


    private static void unchecedExample() {
        divide(1, 2);
        divide(5, 10);
        System.out.println("before try");
        try {

            System.out.println("before divide");
            divide(1, 0);
            System.out.println("after divide");

        }//не объязательный код catch
        catch (ArithmeticException e) {
            System.out.println("in catch block");
            System.out.println(e);
        }//гарантия что этот кусок кода в нем выпонится
        finally {
            System.out.println("Hello from finally block! ");
        }

        System.out.println("after try");

        divide(8, 7);
    }

    //Сонн джаваа завршения
    private static void checkedExample() throws InterruptedException {
        /*
        try {
            Thread.sleep(1333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        Thread.sleep(1333);

    }

    private static void divide(int a, int b) {
        int i = a / b;

    }
}
