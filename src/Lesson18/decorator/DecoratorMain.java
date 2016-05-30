package Lesson18.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverage arabic = new Arabica();
        Beverage robusta = new Robusta();
        printBeverage(arabic);
      //  robusta.setCream(true);
       // robusta.setMilk(true);
        printBeverage(robusta);

        arabic =new Milk(arabic);
        arabic =new Milk(arabic);

        robusta=new Milk(new Cream(robusta));

    }


    public static void printBeverage(Beverage beverage) {
        System.out.println("price is: " + beverage.cost() + ", " + beverage.description());
    }
}
