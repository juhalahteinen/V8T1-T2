package com.example.v8t2;

import java.util.ArrayList;

public class BottleDispenser {

    ArrayList<Bottle> pullolista = new ArrayList<Bottle>();

    private int bottles;
    private float money;
    private String name;
    float volume = 0;
    float price = 0;

    private static BottleDispenser bd = null;

    public static BottleDispenser getInstance() {
        if (bd == null) {
            bd = new BottleDispenser();
        }
        return bd;
    }

    public BottleDispenser() {

        bottles = 5;

        for (int i = 0; i < bottles; i++) {
            if (i == 0) {
                name = "Pepsi Max";
                volume = 0.5f;
                price = 1.80f;
            }

            if (i == 1) {
                name = "Pepsi Max";
                volume = 1.5f;
                price = 2.2f;
            }

            if (i == 2) {
                name = "Coca-Cola Zero";
                volume = 0.5f;
                price = 2.0f;
            }

            if (i == 3) {
                name = "Coca-Cola Zero";
                volume = 1.5f;
                price = 2.5f;
            }

            if (i == 4) {
                name = "Fanta Zero";
                volume = 0.5f;
                price = 1.95f;
            }

            pullolista.add(new Bottle(name, volume, price));

        }
    }

    public void addMoney() {

        money += 1;
    }

    public int buyBottle() {

        if (money >= 2) {
            money -= 2;
            int palautus = 1;
            return palautus;
        } else {
            return 0;
        }
    }

    public float returnMoney() {
        float rahat;
        rahat = money;
        money = 0;
        return rahat;
    }
}

