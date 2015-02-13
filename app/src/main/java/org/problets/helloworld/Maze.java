package org.problets.helloworld;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

public class Maze extends View {
    //private Bitmap[] bitmaps;
    private int size;
    private Cell[][] cellArray;
    private float screenWidth, screenHeight;

    // The maze has a declared size on instantiation and calls
    // for the 2D array to be filled, generating the maze
    public Maze(Context context, int size) {
        super(context);
        this.size = size;
        fillCellArray(cellArray);
    }

    // Populates the 2D array with cells
    void fillCellArray(Cell[][] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // WRITE ALGORITHM TO DETERMINE CORRECT POINTS
                cellArray[i][j] = new Cell(
                        new Wall(new Point(), new Point()),
                        new Wall(new Point(), new Point()),
                        new Wall(new Point(), new Point()),
                        new Wall(new Point(), new Point()));
            }
        }
    }

    // Draws the maze on the Canvas object
    public void drawMaze(Canvas canvas, Maze maze) {

    }
}