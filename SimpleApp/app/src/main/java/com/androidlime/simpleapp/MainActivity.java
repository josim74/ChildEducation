package com.androidlime.simpleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;
    EditText userNameEditText;
    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= (TextView) findViewById(R.id.showTextView);
        userNameEditText = (EditText) findViewById(R.id.userInputEditText);
        okButton= (Button) findViewById(R.id.okButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // button on press method...
                String nameString=userNameEditText.getText().toString();
                Intent intent=new Intent(MainActivity.this,LastActivity.class);
                intent.putExtra("Person_name", nameString);

                startActivity(intent);
            }
        });
    }
}
