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

public class ActivityT22 extends AppCompatActivity {

    TextView tvt221, tvt222;
    ListView lv22;
    ArrayList<String> arr22;
    ArrayAdapter<String> adap22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t22);

        tvt221 = findViewById(R.id.tvt221);
        tvt222 = findViewById(R.id.tvt222);
        lv22 = findViewById(R.id.lv22);

        tvt222.setVisibility(View.GONE);
        tvt221.setText("Based on Power Requirement");

        arr22 = new ArrayList<String>();

        arr22.add("Active Sensors");
        arr22.add("Passive Sensors");

        adap22 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr22);

        lv22.setAdapter(adap22);

        lv22.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def22 = new String();

                if (position == 0){

                    def22 = " Active sensors are those which do not require external power source for their functioning. They generate power within themselves to operate and hence called as self-generating type. The energy for functioning is derived from the quantity being measured. For example piezoelectric crystal generate electrical output (charge) when subjected to acceleration.";
                }

                if(position == 1){

                    def22 = "A passive sensor is a device that detects and responds to some type of input from the physical environment. They gather target data through the detection of vibrations, light, radiation, heat or other phenomena occurring in the subject’s environment. They only sense what is in the environment rather than relying on a transmitter whose activity might be detected with equipment.";
                }

                tvt222.setText(def22);
                tvt222.setVisibility(View.VISIBLE);
            }
        });

    }
}