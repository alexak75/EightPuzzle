package org.problets.helloworld;

/**
 * Created by Alex on 2/10/2015.
 */
public class Point {
    private float x_value, y_value;
    // Since these points will be used for graphics,
    // the units are pixels

    public Point() { // Default point
        x_value = 0;
        y_value = 0;
    }
    public Point(Point p) {
    // Allows us to create points based on other points
        x_value = p.getX();
        y_value = p.getY();
    }
    public Point(int x, int y) {
        if (x >= 0 && y >= 0) {
        // Ensures that no point can be created with negative coordinates
            x_value = x;
            y_value = y;
        }
        else {
            // Throw exception
        }
    }

    public float getX() {
        return this.x_value;
    }
    public float getY() {
        return this.y_value;
    }
    public void setX(int value) {
        this.x_value = value;
    }
    public void setY(int value) {
        this.y_value = value;
    }
    public void setCoordinates(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public boolean equals(Point p) {
    // Returns true if both points are equal
        return (this.getX() == p.getX()) && (this.getY() == p.getY());
    }
    public boolean sharesPointWith(Point p) {
    // Returns true if either the x or y value of both points is the same
        return (this.getX() == p.getX()) || (this.getY() == p.getY());
    }
}
