package com.company.abstraction;

import com.company.implementor.Color;

import java.awt.*;

public abstract class Shape {
    protected Color color;

    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
