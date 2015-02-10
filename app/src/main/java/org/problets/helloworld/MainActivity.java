package org.problets.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends Activity {
	public static final String EXTRA_MESSAGE = "org.problets.helloworld.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	/* destination is the location of the tile to be moved,
	 * source is the location of the blank space
	 * Returns the direction in which the tile was moved */
	private String getDirection( int destination, int source )
	{
		switch( destination - source )
		{
		case -1: return "right";
		case 1: return "left";
		case -3: return "down";
		case 3: return "up";
		default: return "";
		}
	}



	/** Converts number to string, 0 to blank string */
	private String convert( int number )
	{
		if( 0 == number )
			return " ";
		else
			return Integer.toString( number );
	}
}
