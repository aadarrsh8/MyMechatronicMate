package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU12 extends AppCompatActivity {

    TextView tvu121, tvu122;
    ListView lvu12;
    ArrayList<String> arru12;
    ArrayAdapter<String> adapu12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u12);

        tvu121 = findViewById(R.id.tvu121);
        tvu122 = findViewById(R.id.tvu122);
        lvu12 = findViewById(R.id.lvu12);

        tvu121.setText("Uses of Filters");
        tvu122.setVisibility(View.GONE);

        arru12 = new ArrayList<>();

        arru12.add("Radios");
        arru12.add("Audio Systems");
        arru12.add("Signal Processing Circuits");

        adapu12 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru12);
        lvu12.setAdapter(adapu12);

        lvu12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Radio Frequency (RF) filters are used with the radio receivers so that only the right kind of frequencies can be entertained while filtering out other unwanted bands of frequencies. The RF filters are designed in a way that they could easily operate on frequency ranges that range from medium to extremely high frequency, i.e. megahertz and gigahertz. Because of its operating characteristic, it is most frequently used in equipment such as broadcast radio, wireless communications, and television, etc. In general, the majority of the RF filters are made up of coupled resonators, whose quality factor can decide the level of filtering within the RFs. Based on the application and size of the wireless equipment, there are many filter kinds, i.e. cavity filters, planar filters, electro-acoustic filter, dielectric filter, coaxial filter (not related to coaxial cable), and more.";
                }

                if(position == 1){
                    def = "The audio filters are the electronic circuits designed to amplify or attenuate a certain range of frequency components. This helps eliminate the unwanted noise from the audio signal and improves the tone of the output audio. Filters play a major role in telecommunication and audio electronics.";
                }

                if(position == 2){
                    def = "In the field of signal processing, a filter is a device or process that, completely or partially, suppresses unwanted components or features from a signal. This usually means removing some frequencies to suppress interfering signals and to reduce background noise.";
                }

                tvu122.setText(def);
                tvu122.setVisibility(View.VISIBLE);
            }
        });
    }
}