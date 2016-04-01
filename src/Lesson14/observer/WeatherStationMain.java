package Lesson14.observer;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentDisplay currentDisplay = new CurrentDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();


        station.addObserver(currentDisplay);
        station.addObserver(statisticDisplay);
        station.addObserver(forecastDisplay);

        station.setTemperature(20);
        station.setHumidity(50);
        station.setPressure(780);
        station.stateChanged();


        currentDisplay.display();
        statisticDisplay.display();
        forecastDisplay.display();

        station.removeObserver(forecastDisplay);

    }
}