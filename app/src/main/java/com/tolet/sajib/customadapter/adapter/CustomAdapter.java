package com.tolet.sajib.customadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tolet.sajib.customadapter.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[]countryname;
    int[]flags;
private LayoutInflater inflater;
    public CustomAdapter(Context context, String[] countryname, int[] flags) {
        this.context = context;
        this.countryname = countryname;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countryname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.sampleview,parent,false);
            }
        ImageView imageView=convertView.findViewById(R.id.imageviewid);
        TextView textView=convertView.findViewById(R.id.textviewid);
        imageView.setImageResource(flags[position]);
        textView.setText(countryname[position]);
        return convertView;
    }
}
