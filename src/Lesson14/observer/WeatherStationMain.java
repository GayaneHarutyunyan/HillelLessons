package Lesson14.observer;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.setTemperature(20);
        station.setHumidity(50);
        station.setPressure(180);
        station.stateChanged();

        station.setTemperature(30);
        station.setHumidity(550);
        station.setPressure(1880);
        station.stateChanged();
    }
}
