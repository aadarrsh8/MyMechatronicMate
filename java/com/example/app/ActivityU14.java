package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU14 extends AppCompatActivity {

    TextView tvu141, tvu142;
    ListView lvu14;
    ArrayList<String> arru14;
    ArrayAdapter<String> adapu14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u14);

        tvu141 = findViewById(R.id.tvu141);
        tvu142 = findViewById(R.id.tvu142);
        lvu14 = findViewById(R.id.lvu14);

        tvu141.setText("Uses of Switches");
        tvu142.setVisibility(View.GONE);

        arru14 = new ArrayList<>();

        arru14.add("Calculators");
        arru14.add("Washing Machine Timer");
        arru14.add("Burglary Alarm System");
        arru14.add("Smart Control of Traffic Signals");
        arru14.add("Temperature-based Fan Speed Controller");
        arru14.add("Precision Agriculture");

        adapu14 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru14);
        lvu14.setAdapter(adapu14);

        lvu14.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Push buttons are generally used in calculators. They are tactile switches designed to operate the circuit when it is pressed. The push button has two pair of legs with top row and bottom row always connected when switch is not pressed (Open Circuit). When the switch is pressed the top row and bottom row are inter connected (Closed Circuit).";
                }

                if(position == 1){
                    def = "Rotary switches are used in washing machine timers. A rotary switch is a switch operated by rotation. Rotary switches have a rotating spindle. As the name implies, rotary switches are operated by turning a knob or a rotating spindle. They move in a circle and can stop in several positions. Selecting the correct position enables the relevant connections. As rotary switches can have many positions, they enable a particular point to be connected to one of a number of points in the electronics circuit. While rotary switches can be found on many types of industrial equipment, they can also be found in consumer equipment such as cars for adjusting things like fan speed and washing machine timer. Since complex switching operations are more available and used nowadays, rotary switches are becoming less common. However, these switches are still used and available. Below is a schematic symbol for a three-position rotary switch.";
                }

                if(position == 2){
                    def = "Magnetic Reed Switches are small electromagnetic switches used to control the flow of electricity in a circuit. When these devices are exposed to a magnetic field, two ferrous materials inside these pull together and closes the switch. Without exposure to a magnetic field, the reeds separate, thus opening the switch. This makes it a great non-contact switch.";
                }

                if(position == 3){
                    def = "Controlling of traffic signals can be done using data acquired from vibration sensors on crossroads. SPST relays act as simple switches for controlling red-yellow-green signals, which work on higher power supply.";
                }

                if(position == 4){
                    def = "Speed of DC motors or fans can be controlled by using simple potentiometer or pulse-width modulated (PWM) signals. For AC equivalents, controlling can be done using power resistors or power semiconductor devices. A power resistor can withstand the rated wattage on it. Resistance across shown power resistor varies from 120 ohms to 60 ohms to 0 ohms, left to right with the right-most terminal fixed. Depending on temperature, an SPDT relay can be switched on to provide resistance of 120 ohms or 60 ohms in the circuit, leading to different fan speeds.";
                }

                if(position == 5){
                    def = "Arduino decides the amount of time and, hence, the amount of water to be pumped in the field, using a DPST relay. A siren in parallel sounds to indicate pump in on condition. This application is helpful in saving water.";
                }

                tvu142.setText(def);
                tvu142.setVisibility(View.VISIBLE);
            }
        });
    }
}