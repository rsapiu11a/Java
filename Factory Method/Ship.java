package com.company;

public class Ship extends SeaLogistics implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container.");
    }
}
