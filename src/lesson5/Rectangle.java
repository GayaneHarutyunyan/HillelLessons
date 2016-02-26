package lesson5;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    //статистически эллемент принадлежит всем классам и будет менятся
    static int sides=4;
    int with;
    int height;
    int area;
    String color;

    public int calculateArea() {
        return with * height;
    }
    public void changesidesconunt(){
        sides=sides+1;
    }


}
