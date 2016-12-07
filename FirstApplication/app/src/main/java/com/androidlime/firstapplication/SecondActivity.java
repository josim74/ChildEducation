package com.androidlime.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity implements View.OnClickListener{

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        b1 = (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Clicked on first button", Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"Clicked on second button", Toast.LENGTH_LONG).show();
    }

    //My third button...
    public void myButton(View v){
        Toast.makeText(getApplicationContext(),"Clicked on Third button", Toast.LENGTH_LONG).show();
    }
}
