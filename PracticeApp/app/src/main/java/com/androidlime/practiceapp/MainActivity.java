package com.androidlime.practiceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView listView;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.btnID);
        listView = (ListView) findViewById(R.id.listViewID);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, About.class);
                startActivity(i);
            }
        });


        final String[] days = {"MonDay","TuesDay","WednesDay","ThursDay","FriDay","SaturDay","SunDay"};
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.list_view_lay_out,R.id.listID,days);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(MainActivity.this, MonDay.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), " " + days[position] + " we have 4 classes", Toast.LENGTH_LONG).show();
                } else if (position == 1) {
                    Intent i = new Intent(MainActivity.this, TuesDay.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), " " + days[position] + " we have 4 classes", Toast.LENGTH_LONG).show();
                } else if (position == 2) {
                    Intent i = new Intent(MainActivity.this, WednessDay.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), " " + days[position] + " we have 4 classes", Toast.LENGTH_LONG).show();
                } else if (position == 3) {
                    Intent i = new Intent(MainActivity.this, ThusDay.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), " " + days[position] + " we have 2 classes", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), " " + days[position] + " we don't have any class", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
