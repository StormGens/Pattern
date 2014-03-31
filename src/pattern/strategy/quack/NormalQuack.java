package pattern.strategy.quack;

public class NormalQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我是呱呱得叫");

    }

}
