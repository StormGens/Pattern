package pattern;

import pattern.observer.CurrentConditionsDisplay;
import pattern.observer.subject.WeatherData;
import pattern.strategy.duck.MallardDuck;
import pattern.strategy.duck.ModelDuck;
import pattern.strategy.fly.FlyRocketPowered;

public class MainClass {

    public static void main(String[] args) {
        // 测试策略模式
        // testStrategy();
        // 测试监听者模式
        testObserver();

    }

    private static void testObserver() {
        WeatherData mData = new WeatherData();
        CurrentConditionsDisplay mConditionsDisplay = new CurrentConditionsDisplay();
        mData.registerObserver(mConditionsDisplay);
        System.out.println("注册观察者mConditionsDisplay");
        mData.setMeasurements(20, 30, 40);

    }

    private void testStrategy() {
        MallardDuck mallardDuck = new MallardDuck();
        ModelDuck mModelDuck = new ModelDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mModelDuck.performFly();
        mModelDuck.performQuack();

        mModelDuck.setFlyBehavior(new FlyRocketPowered());
        mModelDuck.performFly();

    }

}
