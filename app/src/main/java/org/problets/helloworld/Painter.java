package org.problets.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.view.View;

/**
 * Created by alexak75 on 2/12/15.
 */
public class Painter extends View {

    protected Maze maze;
    private Path path;
    private ShapeDrawable LineObject;

    public Painter(Context context) {
        super(context);

        LineObject = new ShapeDrawable(new PathShape(path, 1, 10));
        LineObject.getPaint().setColor(Color.BLACK); // Add a color
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    // Sets the maze to be drawn by the Maze class
    public void setMaze(Maze m) {
        maze = m;
    }

    public void drawWall(Canvas canvas, Wall wall) {

    }
}
