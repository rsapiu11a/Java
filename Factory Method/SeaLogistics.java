package com.company;

public class SeaLogistics extends Logistics{
    private SeaLogistics seaLogistics = new Ship();
    @Override
    public Logistics createTransport() {
        return this.seaLogistics;
    }
}
