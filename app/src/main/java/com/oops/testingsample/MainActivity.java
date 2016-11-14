package com.oops.testingsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hi, This is my example for Unit tests beginners", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    public void add(View v)
    {
        LinearLayout ll=(LinearLayout)findViewById(R.id.ll);
        TextView result=(TextView)findViewById(R.id.result);
        EditText et1=(EditText)findViewById(R.id.editText1);

        //get value from edit text box and convert into double
        double a=Double.parseDouble(String.valueOf(et1.getText()));
        RadioButton cb=(RadioButton)findViewById(R.id.cb);
        RadioButton fb=(RadioButton)findViewById(R.id.fb);

        //check which radio button is checked
        if(cb.isChecked())
        {
            //change background colour
            ll.setBackgroundColor(Color.YELLOW);
            //display conversion
            result.setText(convertFahrenhiet2Celcius(a)+" degree C");
            //cb.setChecked(false);
            fb.setChecked(true);
        }
        else
        {
            ll.setBackgroundColor(Color.CYAN);
            result.setText(convertCelcius2Fahrenhiet(a)+" degree F");
            //fb.setChecked(false);
            cb.setChecked(true);
        }
    }
    //Celcius to Fahrenhiet method
    private double convertCelcius2Fahrenhiet(double celcius)
    {
        return (celcius*9)/5+32;
    }
    //Fahrenhiet to Celcius method
    private double convertFahrenhiet2Celcius(double fahrenhiet)
    {
        return (fahrenhiet-32)*5/9;
    }
}
