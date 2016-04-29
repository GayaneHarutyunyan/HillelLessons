package Lesson23.multihreading;

/**
 * Created by User on 29.04.2016.
 */
public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Bankier bankier1 = new Bankier(bank);
        Bankier bankier2 = new Bankier(bank);

        Thread bankier1Thread = new Thread(bankier1);
        Thread bankier2Thread = new Thread(bankier2);

        bankier1Thread.start();
        bankier2Thread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {
        }

        bankier1Thread.isInterrupted();
        bankier2Thread.isInterrupted();

        try {
            bankier1Thread.join();
            bankier2Thread.join();
        } catch (InterruptedException ignored) {
        }
        bank.check();
    }
}
