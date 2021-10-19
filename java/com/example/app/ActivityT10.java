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

public class ActivityT10 extends AppCompatActivity {

    TextView tvt10;
    ListView lvt10;
    ArrayList<String> arr10;
    ArrayAdapter<String> adap10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t10);

        tvt10 = findViewById(R.id.tvt10);
        lvt10 = findViewById(R.id.lvt10);

        arr10 = new ArrayList<String>();

        tvt10.setText("Types of Transistors");

        arr10.add("Bipolar Junction Transistors");
        arr10.add("Field Effect Transistors");

        adap10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr10);

        lvt10.setAdapter(adap10);

        lvt10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent intent = new Intent(ActivityT10.this, ActivityT101.class);
                    startActivity(intent);
                }

                if(position == 1){
                    Intent intent = new Intent(ActivityT10.this, ActivityT102.class);
                    startActivity(intent);
                }
            }
        });

    }
}