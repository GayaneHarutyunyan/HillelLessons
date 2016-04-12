package Lasson18.decorator;

/**
 * Created by User on 12.04.2016.
 */
public interface Beverage {


    int cost() ;
    String description() ;




  /*
    private boolean hasCream;
    private boolean hasMilk;


    int cost() {
        int cost = 0;
        if (hasCream) {
            cost += 5;
        }
        if (hasMilk) {
            cost += 3;
        }
        return cost;
    }

    String description() {

        if (hasCream && hasMilk) {
            return "with cream and mlk";
        }
        if (hasCream) {
            return "with mlk";
        }
        if (hasMilk) {
            return "with mlk";
        }
        return "";
    }

    public void setMilk(boolean milk) {
        hasMilk = milk;
    }

    public void setCream(boolean cream) {
        hasCream = cream;
    }
    */
}
