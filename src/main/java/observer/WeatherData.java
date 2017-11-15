package observer;

import java.util.Observable;

/**
 * Created by chenh on 2017/11/15.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    //得到更新值 并通知观测者
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
