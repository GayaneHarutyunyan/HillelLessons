package Lesson18.decorator;


public class Milk extends BeverageDecorator {


    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 10+super.cost();
    }

    @Override
    public String description() {
        return super.description()+ ", milk";
    }
}
