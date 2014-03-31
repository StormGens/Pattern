package pattern.strategy.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我根本不会飞");

    }

}
