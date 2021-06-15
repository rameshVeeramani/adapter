package org.example;

public class MDuck extends Duck{

    public MDuck(){
        this.setQuack(new QuackBehavior());
        this.setFly(new FlyNoNehavior());
    }
}
