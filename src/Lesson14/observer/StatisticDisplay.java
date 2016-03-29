package Lesson14.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 29.03.2016.
 */
public class StatisticDisplay {

    private List<Integer> temperatures = new ArrayList<Integer>();
    private List<Integer> humidities = new ArrayList<Integer>();
    private List<Integer> pressures = new ArrayList<Integer>();
    private StatisticDisplay statisticDisplay = new StatisticDisplay();
    private CurrentDisplay currentDisplay = new CurrentDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();

    public void update(int temperature, int humidity, int pressure) {
        temperatures.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);


        statisticDisplay.display();
        currentDisplay.display();
        forecastDisplay.display();
    }


    //Метод который аспечатоет
    public void display() {
        System.out.println(": " + temperatures +
                ": " + humidities +
                ": " + pressures);
    }
}
