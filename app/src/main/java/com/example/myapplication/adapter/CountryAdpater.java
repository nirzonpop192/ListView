package com.example.myapplication.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class CountryAdpater extends BaseAdapter {


    Context context;

    List<String> countryList ;


    public CountryAdpater(Context context,List<String> countryList) {
        this.context = context;
        this.countryList = countryList;


    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public String getItem(int position) {
        return countryList.get(position).toUpperCase();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_row_country, parent, false);
        TextView tvCountry = view.findViewById(R.id.lr_tv_country);

        String countryName = getItem(position);

        tvCountry.setText(countryName);
        Log.w("List","getView Called"+(position+1));
        return view;
    }
}
