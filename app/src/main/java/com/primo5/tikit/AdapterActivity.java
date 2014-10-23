package com.primo5.tikit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class AdapterActivity extends ArrayAdapter{
    private LayoutInflater inflater;

    public AdapterActivity(Activity activity, String[] items){
        super(activity, R.layout.activity_row, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return inflater.inflate(R.layout.activity_row, parent, false);
    }
}
