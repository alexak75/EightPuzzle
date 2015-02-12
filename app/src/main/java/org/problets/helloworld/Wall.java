package org.problets.helloworld;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Alex on 2/10/2015.
 */
public class Wall {
    private Point p1, p2;

    public Wall()  {
    // Default wall
        p1.setCoordinates(0, 0);
        p2.setCoordinates(0, 0);
    }
    public Wall(Point x, Point y) {
        p1 = x;
        p2 = y;
    }

    boolean equals(Wall w) {
    // Returns true if the walls have the same two points
        return (this.p1 == w.p1) && (this.p2 == w.p2);
    }
}
