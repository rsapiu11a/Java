package com.company;

public abstract class Logistics implements Transport {

    public void planDelivery(){
        Transport t = createTransport();
        t.deliver();

    }
    public abstract Logistics createTransport();

    @Override
    public void deliver() {

    }
}
