package com.androidlime.mobileos;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MD JOSIM UDDIN on 2/18/2016.
 */
public class MyCustomAdapter extends BaseAdapter {

    String[] namesz;
    int[] imsz;
    Context ct;
    private static LayoutInflater inflater = null;

    public MyCustomAdapter(MainActivity mainact, String[] nameofos, int[] osims){
        namesz=nameofos;
        imsz=osims;
        ct=mainact;
        inflater= (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return namesz.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class MyHolder{
        TextView tvs;
        ImageView ims;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        MyHolder myh=new MyHolder();
        View myview;

        myview=inflater.inflate(R.layout.custom_layout_item,null);
        myh.tvs=(TextView)myview.findViewById(R.id.textviewid);
        myh.ims=(ImageView) myview.findViewById(R.id.imageviewid);
        myh.tvs.setText(namesz[position]);
        myh.ims.setImageResource(imsz[position]);

        myview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ct,"Click on"+namesz[position], Toast.LENGTH_LONG).show();
            }
        });
        return myview;
    }
}
