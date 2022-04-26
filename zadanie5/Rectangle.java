package com.company.zadanie5;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "прямоугольник";
    }

    @Override
    public void draw() {
        System.out.println("Внутри метода прямоугольник::draw()");
    }
}