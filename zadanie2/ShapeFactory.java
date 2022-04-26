package com.company.zadanie2;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape2 getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("ПРЯМОУГОЛЬНИК")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("КВАДРАТ")){
            return new Square();
        }
        return null;
    }
}