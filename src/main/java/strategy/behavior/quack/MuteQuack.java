package strategy.behavior.quack;

/**
 * 不会叫
 * Created by chenh on 2017/11/15.
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
