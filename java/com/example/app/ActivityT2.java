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

public class ActivityT2 extends AppCompatActivity {

    TextView tvt2;
    ListView lv2;
    ArrayList<String> arr2;
    ArrayAdapter adap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2);

        tvt2 = findViewById(R.id.tvt2);
        lv2 = findViewById(R.id.lv2);

        tvt2.setText("Types of Sensors");

        arr2 = new ArrayList<String>();

        arr2.add("Based on quantity measured");
        arr2.add("Based on power requirement");
        arr2.add("Based on type of output signal produced");

        adap2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr2);

        lv2.setAdapter(adap2);

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(ActivityT2.this, ActivityT21.class);

                    startActivity(intent);
                }

                if(position == 1){

                    Intent intent = new Intent(ActivityT2.this, ActivityT22.class);

                    startActivity(intent);
                }

                if(position == 2){

                    Intent intent = new Intent(ActivityT2.this, ActivityT23.class);

                    startActivity(intent);
                }
            }
        });
    }
}