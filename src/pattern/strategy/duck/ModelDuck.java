package pattern.strategy.duck;

import pattern.strategy.fly.FlyNoWay;
import pattern.strategy.quack.NormalQuack;

public class ModelDuck extends Duck {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("我是一个模型鸭，但被赋予神力的时候会变身哦！");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new NormalQuack();
    }

}
