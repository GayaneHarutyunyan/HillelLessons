package Lesson14.observer;

import java.util.Random;

/**
 * Created by User on 29.03.2016.
 */
public class ForecastDisplay {
    private int temperature;
    private int humidity;
    private int pressure;
    private Random random = new Random();

    public void update(int temperature, int humidity, int pressute) {
        this.temperature = random(temperature);
        this.humidity = random(humidity);
        this.pressure = random(pressute);
    }

    private int random(int value) {
        Random random = new Random();


        //nextDouble- в интервале от 0-1    а нам нужно от 0 до 0,2   по этому елим на 5
        double seed = random.nextDouble() / 5 + 0.9;
        return (int) (value * seed);

    }


    //Метод который аспечатоет
    public void display() {
        System.out.println(": " + temperature +
                ": " + humidity +
                ": " + pressure);
    }
}