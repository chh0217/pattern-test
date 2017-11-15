package strategy.behavior.quack;

/**
 * 吱吱叫
 * Created by chenh on 2017/11/15.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
