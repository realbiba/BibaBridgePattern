package com.company.abstraction;

import com.company.implementor.Color;

public class Triangle extends Shape{
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle with ");
        color.applyColor();
    }
}
