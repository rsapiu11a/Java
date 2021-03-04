package com.company;

public class Truck extends RoadLogistics implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box.");
    }
}
