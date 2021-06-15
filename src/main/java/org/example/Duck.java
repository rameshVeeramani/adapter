package org.example;

public abstract class Duck {

    private String name;
    private String breed;

    public IFlyBehavior getFly() {
        return fly;
    }

    public void setFly(IFlyBehavior fly) {
        this.fly = fly;
    }

    private IFlyBehavior fly;
    public IQuackBehavior getQuack() {
        return quack;
    }

    public void setQuack(IQuackBehavior quack) {
        this.quack = quack;
    }

    private IQuackBehavior quack;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
