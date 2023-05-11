package com.transportation;

class Boat extends Vehicle {

    @Override
    public void moveTo(String location) {
        System.out.println("boat moving to " + location);
    }

    public Boat(String vin) {
        super(vin);
    }
}