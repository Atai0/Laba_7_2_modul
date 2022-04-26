package com.company.zadanie4;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 70.0f;
    }

    @Override
    public String name() {
        return  "Бургер с курицей";
    }
}