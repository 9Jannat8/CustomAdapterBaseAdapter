package com.example.customadapterbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryName ;
    private int[] flags = {R.drawable.afghanistan, R.drawable.armenia, R.drawable.azerbaijan, R.drawable.bahrain,
            R.drawable.bangladesh, R.drawable.bhutan, R.drawable.china, R.drawable.india, R.drawable.japan,
            R.drawable.nepal, R.drawable.pakistan, R.drawable.srilanka
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = getResources().getStringArray(R.array.country_names);

        listView = findViewById(R.id.lstviewId);

        CustomAdapter adapter = new CustomAdapter(this, countryName, flags);

        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}