package pattern.strategy.duck;

import pattern.strategy.fly.FlyWithWings;
import pattern.strategy.quack.NormalQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new NormalQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我天生一副野鸭子样子");

    }

}
