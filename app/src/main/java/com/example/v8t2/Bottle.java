package com.example.v8t2;

public class Bottle {

    private String name;
    private String manufacturer;
    private double total_energy;
    private float price;
    private float volume;

    public Bottle(String n, float v, float p) {
        name = n;
        volume = v;
        price = p;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getEnergy(){
        return total_energy;
    }

    public float getSize() {
        return volume;
    }

    public float getCost() {
        return price;
    }

}
