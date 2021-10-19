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

public class ActivityT5 extends AppCompatActivity {

    TextView tvt5;
    ListView lvt5;
    ArrayList<String> arr5;
    ArrayAdapter<String> adap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t5);

        tvt5 = findViewById(R.id.tvt5);
        lvt5 = findViewById(R.id.lvt5);

        tvt5.setText("Types of Transformers");

        arr5 = new ArrayList<String>();

        arr5.add("Based on Voltage level");
        arr5.add("Based on Core material");
        arr5.add("Based on Winding arrangement");
        arr5.add("Based on Usage");

        adap5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr5);

        lvt5.setAdapter(adap5);

        lvt5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if  (position == 0){
                    Intent intent = new Intent(ActivityT5.this, ActivityT51.class);

                    startActivity(intent);
                }

                if  (position == 1){
                    Intent intent = new Intent(ActivityT5.this, ActivityT52.class);

                    startActivity(intent);
                }

                if  (position == 2){
                    Intent intent = new Intent(ActivityT5.this, ActivityT53.class);

                    startActivity(intent);
                }

                if  (position == 3){
                    Intent intent = new Intent(ActivityT5.this, ActivityT54.class);

                    startActivity(intent);
                }
            }
        });
    }
}