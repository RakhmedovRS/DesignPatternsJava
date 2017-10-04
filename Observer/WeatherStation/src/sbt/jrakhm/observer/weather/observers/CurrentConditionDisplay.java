package sbt.jrakhm.observer.weather.observers;

import sbt.jrakhm.observer.weather.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author rassoll
 * @ created 25.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class CurrentConditionDisplay implements Observer, DisplayElement
{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg)
    {
        if (obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}
