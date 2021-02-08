package com.example.customadapterbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;//constructor er jonno variable declare
    String[] countryNames;
    Context context;//activity er sob kichu ke ak sathe  bole context
    private LayoutInflater layoutInflater;//xml file k view te convert korte hole ata dorkar
    private int position;
    private View convertView;
    private ViewGroup parent;

    CustomAdapter(Context context, String[] countryNames, int[] flags) {//constructor
        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countryNames.length;
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

        if (convertView == null) {//prothom obosthay kono view toiri kore nif
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =  layoutInflater.inflate(R.layout.sample_view, parent, false);

        }

        ImageView imageView = convertView.findViewById(R.id.imageviewId);

        TextView textView = convertView.findViewById(R.id.countryNameId);

        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);

        return convertView;
    }
}
