package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT54 extends AppCompatActivity {

    TextView tvt54;
    ListView lv54;
    ArrayList<String> arr54;
    ArrayAdapter<String> adap54;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t54);

        tvt54 = findViewById(R.id.tvt54);
        lv54 = findViewById(R.id.lv54);

        tvt54.setText("Based on Usage");

        arr54 = new ArrayList<String>();

        arr54.add("Power Domain");
        arr54.add("Electronics Domain");

        adap54 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr54);

        lv54.setAdapter(adap54);

        lv54.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent intent = new Intent(ActivityT54.this, ActivityT541.class);

                    startActivity(intent);
                }

                if(position == 1){
                    Intent intent = new Intent(ActivityT54.this, ActivityT542.class);

                    startActivity(intent);
                }
            }
        });

    }
}