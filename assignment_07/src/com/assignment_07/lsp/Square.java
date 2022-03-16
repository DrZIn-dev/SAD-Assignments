package com.assignment_07.lsp;

public class Square implements Shape {
    private int width;
    private int height;

    Square(int side) {
        this.setSide(side);
    }

    public int getArea() {
        return this.width * this.height;
    }

    public void setSide(int side) {
        this.width = side;
        this.height = side;
    }

    public void setWidth(int width) {
        this.setSide(width);
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.setSide(height);
    }

    public int getHeight() {
        return height;
    }
}
