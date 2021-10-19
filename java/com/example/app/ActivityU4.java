package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU4 extends AppCompatActivity {

    TextView tvu41, tvu42;
    ListView lvu4;
    ArrayList<String> arru4;
    ArrayAdapter<String> adapu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u4);

        tvu41 = findViewById(R.id.tvu41);
        tvu42 = findViewById(R.id.tvu42);
        lvu4 = findViewById(R.id.lvu4);

        tvu41.setText("Uses of Capacitors");
        tvu42.setVisibility(View.GONE);

        arru4 = new ArrayList<String>();

        arru4.add("Sensors");
        arru4.add("Coupling");
        arru4.add("Tuning");
        arru4.add("Pulse power and weapons");
        arru4.add("Signal Processing");
        arru4.add("Timing");

        adapu4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru4);
        lvu4.setAdapter(adapu4);

        lvu4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Capacitors measure a variety of things, including fuel levels, mechanical strain, and air humidity as sensors. Its structure determines the capacitance of a device. Changes in the fabric are measured as a gain or loss of capacitance. Aspects of a capacitor that are used in sensing applications are the material between them and the distance between the parallel plates. The former is used to uncover mechanical changes such as pressure and acceleration. Every minute changes in the material between the plates are enough to the capacitance of the device.";
                }

                if(position == 1){
                    def = "Capacitors can let AC pass through yet block DC in a process called Capacitor Coupling. It is used in the case of a loudspeaker. Speakers work by converting an alternating current into sound, but they could be damaged by any direct current that reaches them. A capacitor prevents the direct current from damaging the speakers.";
                }

                if(position == 2){
                    def = "Variable capacitors are used when tuning circuits on radio systems by connecting them to an LC oscillator. The capacitor charges and discharges into a wire coil, hence a magnetic field is generated. Once the capacitor is discharged completely, the magnetic field falls while, recharging the capacitor. Charging and releasing the current take place at regular intervals, but it can be changed by altering the capacitor. If the frequency of these intervals is equal to the frequency of a nearby radio station, the amplifier in the radio strengthens this signal, and you will hear the broadcast.";
                }

                if(position == 3){
                    def = "Capacitors are used to supply massive pulses of current for many pulsed power applications. These include electromagnetic forming, pulsed lasers, Marx generators, pulse forming networks, particle accelerators, and fusion research. Large capacitor banks are energy sources for the exploding-bridge wire detonators or slapper detonators in specialty weapons. Experimental work is underway using banks of capacitors as power sources for electromagnetic amour and electromagnetic rail guns or coil guns.";
                }

                if(position == 4){
                    def = "Capacitors have found many advanced applications in IT. Dynamic Random Access Memory devices use capacitors to show binary information as 1s and 0s. The device can read one value when the capacitor is charged and another when discharged. Charge-Coupled Devices (CCDs) use capacitors in an analog form. Capacitors are also used together with inductors to tune circuits to particular frequencies, an effect exploited by radio receivers, speakers, and analog equalizers.";
                }

                if(position == 5){
                    def = "Capacitors can be used in a time-dependent course because their charging and discharging happen at regular intervals. It can be connected to any light-emitting diode or loudspeaker system. Further, any flashing light that you see or steady beeping likely uses a timing capacitor.";
                }

                tvu42.setText(def);
                tvu42.setVisibility(View.VISIBLE);
            }
        });
    }
}