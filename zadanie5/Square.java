package com.company.zadanie5;

public class Square extends Shape {

    public Square(){
        type = "Квадрат";
    }

    @Override
    public void draw() {
        System.out.println("Внутри метода Квадрат::draw()");
    }
}