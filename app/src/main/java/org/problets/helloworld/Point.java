package org.problets.helloworld;

/**
 * Created by Alex on 2/10/2015.
 */
public class Point {
    private int x_value, y_value;

    public Point() {
        x_value = 0;
        y_value = 0;
    }

    public Point(int x, int y) {
        x_value = x;
        y_value = y;
    }

    public int getX() {
        return this.x_value;
    }

    public int getY() {
        return this.y_value;
    }

    public void setX(int value) {
        this.x_value = value;
    }

    public void setY(int value) {
        this.y_value = value;
    }

}
