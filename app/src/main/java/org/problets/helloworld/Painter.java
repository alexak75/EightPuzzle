package org.problets.helloworld;

import android.content.Context;
import android.graphics.Canvas;
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
    private ShapeDrawable LineObject; // Do we need a ShapeDrawable?

    public Painter(Context context) {
        super(context);

        //LineObject = new ShapeDrawable(new PathShape(path, WIDTH, HEIGHT)); // Need to determine the variables for width and height
        //LineObject.getPaint().setColor(); // Add a color
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    public void setMaze(Maze m) {
        maze = m;
    }

    public void drawWall(Canvas canvas, Wall wall) {

    }
}
