package Lesson14.observer;

/**
 * Created by User on 01.04.2016.
 */
public interface Observer {

    //void update(int temperature, int humidity, int pressure);
    void update(WeatherStation station);
}
