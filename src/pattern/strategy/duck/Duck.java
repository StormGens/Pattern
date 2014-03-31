package pattern.strategy.duck;

import pattern.strategy.fly.FlyBehavior;
import pattern.strategy.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 鸭子的外貌
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("所有的鸭子都会切只会默默向上游");

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        System.out.println(this.getClass().getSimpleName() + "鸭子被赋予了" + flyBehavior.getClass().getSimpleName());
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        System.out.println(this.getClass().getSimpleName() + "鸭子被赋予了" + quackBehavior.getClass().getSimpleName());
        this.quackBehavior = quackBehavior;
    }

}
