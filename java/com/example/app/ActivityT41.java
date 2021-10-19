package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT41 extends AppCompatActivity {

    TextView tvt411, tvt412;
    ListView lvt411;
    ArrayList<String> arr41;
    ArrayAdapter<String> adapt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t41);

        tvt411 = findViewById(R.id.tvt411);
        tvt412 = findViewById(R.id.tvt412);
        lvt411 = findViewById(R.id.lvt411);

        tvt411.setText("A polymer capacitor is an electrolytic capacitor (e-cap) that uses a solid electrolyte of a conductive polymer like the electrolyte instead of gel or liquid electrolytes. The solid polymer type capacitors highest rated voltage is lesser as compared with the highest voltage of classical electrolytic type capacitors like up to 35 volts, even though some polymer type capacitors are designed with highest operating voltages like 100 volts DC. These capacitors have different and better qualities as compared with a longer lifetime, working temperature is high, good stability, lower ESR (equivalent series resistance) & failure mode is much safer." + "\n" + "\n Types of Polymer Capacitors are:- ");
        tvt412.setVisibility(View.GONE);

        arr41 = new ArrayList<String>();

        arr41.add("Polyester Capacitor");
        arr41.add("Polystyrene Capacitor");
        arr41.add("Polycarbonate Capacitor");
        arr41.add("Polypropylene Capacitor");
        arr41.add("Teflon Capacitor");
        arr41.add("Glass Capacitor");

        adapt4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr41);

        lvt411.setAdapter(adapt4);

        lvt411.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def41 = new String();

                if(position == 0){
                    def41 = "Polyester or Mylar capacitor is cheap, precise & has small leakage. These capacitors work in the range of 0.001 to 50 microfarad. These capacitors are applicable where stability and accuracy are not so significant.";
                }

                if(position == 1){
                    def41 = "These capacitors are extremely accurate includes less leakage. These are utilized within filters and also wherever accuracy, as well as stability, is significant. These are quite costly & work in the range of 10 pF to 1 mF.";
                }

                if(position == 2){
                    def41 = "These capacitors are costly & available extremely in good quality, with high accuracy and very low leakage. Unfortunately, they have been discontinued and are now hard to find. They perform well in harsh and high-temperature environments in the 100 pF to 20 mF range.";
                }

                if(position == 3){
                    def41 = "These capacitors are costly and the range of its performance can be in the 100 pF to 50 mF. These are extremely constant, accurate over time & have very little leakage.";
                }

                if(position == 4){
                    def41 = "These capacitors are the most stable, accurate & have nearly no leakage. These are considered the best capacitors. The way of behavior is precisely similar over a broad range of frequency variations. They function in the range of 100 pF to 1 mF.";
                }

                if(position == 5){
                    def41 = "These capacitors are very strong, stable, and operates in the range of 10 pF to 1,000 pF. But, these are also very expensive components.";
                }

                tvt412.setText(def41);
                tvt412.setVisibility(View.VISIBLE);
            }
        });
    }
}