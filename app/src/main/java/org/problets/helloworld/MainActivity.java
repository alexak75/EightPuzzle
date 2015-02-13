//************************************************************
//* Name:  Alexander Kuhles and Jacob Roosma                 *
//* Project:  Project 1                                      *
//* Class:  Artificial Intelligence                          *
//* Date:  February 13, 2015                                 *
//************************************************************

package org.problets.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSendUserDimension(View view) {
        EditText textBox = (EditText)findViewById(R.id.users_dimension_edit_text);
        Intent getDimensionScreenIntent = new Intent (this, SecondScreenActivity.class);
        getDimensionScreenIntent.putExtra("callingActivity", Integer.parseInt(textBox.getText().toString()));

        Log.v("Test", "Test log!!!");

        setResult(RESULT_OK, getDimensionScreenIntent);
        startActivity(getDimensionScreenIntent);
        finish();
    }


}