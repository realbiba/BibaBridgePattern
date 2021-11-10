package com.company;

import com.company.abstraction.Circle;
import com.company.abstraction.Shape;
//import java.awt.*;

import com.company.abstraction.Triangle;
import com.company.implementor.BlackColor;
import com.company.implementor.WhiteColor;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape=new Triangle(new BlackColor());
        shape.applyColor();
        Shape shape1=new Circle(new WhiteColor());
        shape1.applyColor();


    }
}
