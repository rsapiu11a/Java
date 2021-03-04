package com.company;

public class RoadLogistics extends Logistics{
    private RoadLogistics roadLogistics = new Truck();

    @Override
    public Logistics createTransport() {

        return roadLogistics;
    }
}
