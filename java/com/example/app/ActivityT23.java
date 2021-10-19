package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT23 extends AppCompatActivity {

    TextView tvt231, tvt232;
    ListView lv23;
    ArrayList<String> arr23;
    ArrayAdapter<String> adap23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t23);

        tvt231 = findViewById(R.id.tvt231);
        tvt232 = findViewById(R.id.tvt232);
        lv23 = findViewById(R.id.lv23);

        tvt231.setText("Based on Type of Output Signal");
        tvt232.setVisibility(View.GONE);

        arr23 = new ArrayList<String>();

        arr23.add("Analog Sensors");
        arr23.add("Digital Sensors");

        adap23 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr23);

        lv23.setAdapter(adap23);

        lv23.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def23 = new String();

                if(position == 0){
                    def23 = "Analog sensors are the devices that produce analog output in correspondence to the quantity being calculated. These sensors also observe the change in external factors such as light intensity, speed of the wind, and solar radiation, and others. And the output ranges between 0V to 5V. Here, Logic 1 corresponds to the voltage level of 3.5V to 5V and Logic 0 corresponds to the voltage level of 0V to 3.5V.";
                }

                if(position == 1){
                    def23 = "A digital sensor is an electronic or electrochemical sensor, where data is digitally converted and transmitted. They are often used for analytical measurements, e.g. the measurement of chemical and physical properties of liquids.";
                }

                tvt232.setText(def23);
                tvt232.setVisibility(View.VISIBLE);
            }
        });
    }
}