package com.thoughtworks.rectangle;

public class Rectangle {
    private  static int length;
    private  static int breadth;

    public Rectangle(int length, int breadth) {
        Rectangle.length = length;
        Rectangle.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}