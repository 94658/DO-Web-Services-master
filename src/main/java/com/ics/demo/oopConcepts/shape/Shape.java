package com.ics.demo.oopConcepts.shape;

public class Shape {


    private int noOfEdges, length, width;

    public Shape(int noOfEdges, int length, int width) {
        this.noOfEdges = noOfEdges;
        this.length = length;
        this.width = width;
    }

    public int getNoOfEdges() {
        return noOfEdges;
    }

    public void setNoOfEdges(int noOfEdges) {
        this.noOfEdges = noOfEdges;
    }

    public int getLenght() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
