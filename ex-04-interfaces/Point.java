package com.qa;

public class Point {
    private double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static class Rectangle extends Shape{
        private double height, width;
        //constructor that calls the Shape constructor
         public Rectangle(String name, String colour, double x, double y, double width, double height) {
             super(name, colour, x, y);
             this.width = width;
             this.height = height;
         }

        @Override
        public String toString() {
            return "Retangle{" +
                    "height=" + height +
                    ", width=" + width +
                    '}';
        }
        public boolean isSquare(){
                 return (width == height);
         }

        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public Point getCentrePoint() {
             double centreX = getX()+width/2;
             double centreY = getY()+height/2;
            return null;
        }
    }
}
