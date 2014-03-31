package pattern.observer;

import pattern.observer.observer.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("我是CurrentConditionsDisplay，现在的温度是：" + temp + ";现在的湿度是：" + humidity + "；现在的压力是:" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

}
