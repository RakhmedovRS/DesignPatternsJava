package sbt.jrakhm.observer.weather.subject;

import java.util.Observable;

/**
 * @author rassoll
 * @ created 25.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class WeatherData extends Observable
{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
    }

     public void measureChanged()
     {
         setChanged();
         notifyObservers();
     }

     public void setMeasurements(float temperature, float humidity, float pressure)
     {
         this.temperature = temperature;
         this.humidity = humidity;
         this.pressure = pressure;
         measureChanged();
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
