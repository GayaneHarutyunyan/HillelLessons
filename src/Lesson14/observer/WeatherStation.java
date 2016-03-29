package Lesson14.observer;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;
    private CurrentDisplay currentDisplay = new CurrentDisplay();

    public void stateChanged() {
//Оповищать что погодные условия измнились


        currentDisplay.update(temperature, humidity, pressure);
        currentDisplay.display();
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

    public int getPressute() {
        return pressure;
    }

    public void setPressure(int pressute) {
        this.pressure = pressute;
    }


}
