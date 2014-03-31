package pattern.strategy.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我的翅膀能卷起风暴！");

    }

}
