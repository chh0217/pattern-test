package strategy.duck;

import strategy.behavior.fly.FlyNoWay;
import strategy.behavior.quack.Quack;

/**
 * Created by chenh on 2017/11/15.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
