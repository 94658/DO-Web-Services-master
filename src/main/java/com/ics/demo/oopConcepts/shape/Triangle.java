package com.ics.demo.oopConcepts.shape;

public class Triangle extends Shape implements ShapeInterface {


    public Triangle(int noOfEdges, int length, int width) {
        super(noOfEdges, length, width);
    }

    @Override
    public int getArea(int lenght, int width) {
        return (1/2 * lenght*width);
    }

    @Override
    public String toString() {
        return "No of edges: "+ getNoOfEdges()+
                "Area: "+ getArea(getLenght(), getWidth());
    }
}
