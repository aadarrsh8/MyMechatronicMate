package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT542 extends AppCompatActivity {

    TextView tvt5421, tvt5422;
    ListView lv542;
    ArrayList<String> arr542;
    ArrayAdapter<String> adap542;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t542);

        tvt5421 = findViewById(R.id.tvt5421);
        tvt5422 = findViewById(R.id.tvt5422);
        lv542 = findViewById(R.id.lv542);

        tvt5421.setText("Electronics Domain");
        tvt5422.setVisibility(View.GONE);

        arr542 = new ArrayList<String>();

        arr542.add("Pulse Transformer");
        arr542.add("Audio Output Transformer");

        adap542 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr542);

        lv542.setAdapter(adap542);

        lv542.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def542 = new String();

                if(position == 0){
                    def542 = "Pulse transformers are one of most used PCB mounted transformers that produce electrical pulses in a constant amplitude. It is used in various digital circuits where pulse generation is needed in an isolated environment. Therefore, the pulse transformers isolate the primary and secondary and distribute primary pulses to the secondary circuit, often digital logic gates or drivers. Properly constructed pulse transformers should need proper galvanic isolation as well as small leakage and stray capacitance.";
                }

                if(position == 1){
                    def542 = "Audio Transformer is another commonly used transformer in the electronics domain. It is specially used in Audio related application where impedance matching is required. Audio transformer balances the amplifier circuit and loads, typically a loudspeaker. The audio transformer can have multiple primary and secondary coils, separated or center tapped.";
                }

                tvt5422.setText(def542);
                tvt5422.setVisibility(View.VISIBLE);
            }
        });

    }
}