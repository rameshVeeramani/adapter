package org.example;

public class FlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Up and away Flying");
    }
}

class FlyNoNehavior implements IFlyBehavior  {

    @Override
    public void fly() {
        System.out.println("noo flying");
    }
}
