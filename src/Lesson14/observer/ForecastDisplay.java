package Lesson14.observer;

import java.util.Random;

/**
 * Created by User on 29.03.2016.
 */

public class ForecastDisplay implements Observer{
    private int temperature;
    private int humidity;
    private int pressure;
    private Random random = new Random();

    public void update(int temperature, int humidity, int pressure) {
        this.temperature = randomize(temperature);
        this.humidity = randomize(humidity);
        this.pressure = randomize(pressure);
    }
    //Метод который аспечатоет

    public void display() {
        System.out.println("Forecast: temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }

    private int randomize(int value) {
        //nextDouble- в интервале от 0-1    а нам нужно от 0 до 0,2   по этому елим на 5

        double seed = random.nextDouble() / 5 + 0.9;
        return (int) (value * seed);
    }


}