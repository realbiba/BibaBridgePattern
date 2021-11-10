package com.company.abstraction;

import com.company.implementor.Color;

public class Circle extends Shape{
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Circle with ");
        color.applyColor();
    }
}
