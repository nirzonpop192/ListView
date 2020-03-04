package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapter.CountryAdpater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    List<String> country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            country.add("Bangladesh");
            country.add("India");
            country.add("Paksthan");
            country.add("Napel");
            country.add("Srilanka");
            country.add("Usa");
            country.add("UK");
            country.add("Afganishthan");
            country.add("Uganda");
            country.add("Canda");
            country.add("Austilia");
            country.add("Egept");
            country.add("China");
        }
        lv = (ListView) findViewById(R.id.lv);

        CountryAdpater adpater = new CountryAdpater(this, country);

        lv.setAdapter(adpater);

    }
}
