package org.problets.helloworld;

import android.graphics.Canvas;

/**
 * Created by Alex on 2/10/2015.
 */
public class Cell {
    private Canvas canvas;
    private Painter painter;
    private Wall top, left, bottom, right;

    // NOTE: EACH CELL IS 10x10 PIXELS

    public Cell(Wall t, Wall b, Wall l, Wall r) {
        top = t;
        left = l;
        bottom = b;
        right = r;
    }

    void drawTopWall() {
        painter.drawWall(canvas, this.top);
    }
    void drawBottomWall() {
        painter.drawWall(canvas, this.bottom);
    }
    void drawLeftWall() {
        painter.drawWall(canvas, this.left);
    }
    void drawRightWall() {
        painter.drawWall(canvas, this.right);
    }

    Wall getTopWall() {
        return this.top;
    }
    Wall getBottomWall() {
        return this.bottom;
    }
    Wall getLeftWall() {
        return this.left;
    }
    Wall getRightWall() {
        return this.right;
    }



}
