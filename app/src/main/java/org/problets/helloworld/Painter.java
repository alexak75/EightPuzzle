package org.problets.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by alexak75 on 2/12/15.
 */
public class Painter extends View {

    protected Maze maze;

    public Painter(Context context) {
        super(context);
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
