package pattern.observer.subject;

import pattern.observer.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> mObservers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        mObservers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : mObservers) {
            observer.update(temp, humidity, pressure);
        }

    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

}
