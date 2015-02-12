package org.problets.helloworld;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Alex on 2/10/2015.
 */
public class Wall {
    private Point p1, p2;
    Canvas canvas = new Canvas();

    public Wall()  {
        // Default wall
        p1.setCoordinates(0, 0);
        p2.setCoordinates(0, 0);
    }
    public Wall(Point x, Point y) {
        p1 = x;
        p2 = y;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    public void createLine(Point p) {
        // Draws a line from this to p

        //drawLine(this.get)
    }
}
