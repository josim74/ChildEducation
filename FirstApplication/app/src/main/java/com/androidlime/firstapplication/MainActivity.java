package com.androidlime.firstapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button b;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button) findViewById(R.id.mybutton);
        lv=(ListView) findViewById(R.id.lvid);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mybuilder=new AlertDialog.Builder(MainActivity.this);
                mybuilder.setTitle("Attention!");
                mybuilder.setMessage("Your are going in a site, whch is 18+");
                mybuilder.setIcon(R.drawable.red_cross);

                mybuilder.setPositiveButton("Yes, Go", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Going to 18+ site...", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(i);

                    }
                });

                mybuilder.setNegativeButton("NO, I won't go", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "I am not going on a freaking 18+ site!...", Toast.LENGTH_LONG).show();

                    }
                });

                AlertDialog mydialog = mybuilder.create();
                mydialog.show();


            }
        });

        final String[] pcs={"Macbook Pro","Macbook Air","The Macbook","iMac","MacMini","HP Pavilion","Toshiba","Lenovo"};
        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.lvlayout, R.id.txtid, pcs);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Clicked on "+pcs[position],Toast.LENGTH_LONG).show();

            }
        });

    }

}
