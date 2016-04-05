package Lesson14.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 29.03.2016.
 */

public class WeatherStation {

    private int temperature;
    private int humidity;
    private int pressure;

    private List<Observer> observers = new ArrayList<>();

    //Констроуктор перенеем их реализацию
    public WeatherStation() {
        observers.add(new CurrentDisplay());
        observers.add(new StatisticDisplay());
        observers.add(new ForecastDisplay());
    }

    //одписка
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //подписка
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void stateChanged() {
        //Оповищать что погодные условия измнились
//интерфейс
        for (Observer observer : observers) {
            observer.update(this);
        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}