package org.adapater;

public class Mduck implements Duck{

    @Override
    public void quack() {
        System.out.println("M..Quack");
    }

    @Override
    public void fly() {
        System.out.println("M..Fly");
    }
}
