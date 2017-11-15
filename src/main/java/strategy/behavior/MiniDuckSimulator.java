package strategy.behavior;

import strategy.behavior.duck.Duck;
import strategy.behavior.duck.MallardDuck;
import strategy.behavior.duck.ModelDuck;
import strategy.behavior.fly.FlyRocketPowered;

/**
 * Created by chenh on 2017/11/15.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
