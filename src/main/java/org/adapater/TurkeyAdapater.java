package org.adapater;

public class TurkeyAdapater implements Duck{

    Turkey turkey;

    public TurkeyAdapater(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gooble();
    }

    @Override
    public void fly() {
        for(int i =0;i <= 10 ; i++){
            turkey.fly();
        }
    }
}
