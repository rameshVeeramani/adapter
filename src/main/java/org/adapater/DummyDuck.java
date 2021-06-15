package org.adapater;

public class DummyDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("D..Quack");
    }

    @Override
    public void fly() {
        System.out.println("D..Fly");
    }
}
