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
@Override
    public void update(WeatherStation station) {
        this.temperature = randomize(station.getTemperature());
        this.humidity = randomize(station.getHumidity());
        this.pressure = randomize(station.getPressure());
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