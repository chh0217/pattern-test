package strategy.duck;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quack.Quack;

/**
 * Created by chenh on 2017/11/15.
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
