package com.androidlime.mobileos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = (ListView) findViewById(R.id.mylistview);

        String[] myos = {"Android","IOS","Windows Phone","Java","Blacdberry"};
        int[] myosimg = {R.drawable.mac,R.drawable.ms,R.drawable.list1,R.drawable.bb, R.drawable.ad};

        MyCustomAdapter myAdap = new MyCustomAdapter(this,myos,myosimg);

        mylist.setAdapter(myAdap);
    }
}
