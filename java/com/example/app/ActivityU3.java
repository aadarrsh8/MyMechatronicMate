package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU3 extends AppCompatActivity {

    TextView tvu31, tvu32;
    ListView lvu3;
    ArrayList<String> arru3;
    ArrayAdapter<String> adapu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3);

        tvu31 = findViewById(R.id.tvu31);
        tvu32 = findViewById(R.id.tvu32);
        lvu3 = findViewById(R.id.lvu3);

        tvu31.setText("Uses of Resitors");
        tvu32.setVisibility(View.GONE);

        arru3 = new ArrayList<String>();

        arru3.add("Laptop Charger");
        arru3.add("Mobile Phone Charger");
        arru3.add("Fan-speed Controller");
        arru3.add("Lightning-bulb");
        arru3.add("Street-light");

        adapu3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru3);
        lvu3.setAdapter(adapu3);

        lvu3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Our laptop charger has tens (if not hundreds) of resistors for controlling current flow through different components. The resistors make sure that a battery with a particular voltage shuts down at a voltage higher than the battery's voltage and battery starts charging when voltage drops below a significant voltage. Resistors ensure extreme accuracy and foolproof cut offs across the set threshold points, which in turn ensures perfect and a safe charging for the connected battery.";
                }

                if(position == 1){
                    def = "Just like the laptop, a mobile phone charger contains a number of resistors that are responsible for controlling the required amount of current. We notice the amount of current on your mobile charger displaying something like 500 mA, 700 mA, 900 mA, 1.0 A or 2.0 A. This is actually the amount of current. A resistor is a basic component responsible for controlling this flow through the mobile phone.";
                }

                if(position == 2){
                    def = "The rotating knob used for controlling the speed of the fan is actually a potentiometer whose rotation changes the amount of resistance. A variable resistor is connected in series with the fan. At full speed the resistance is zero. To decrease speed we increase the resistance by turning the knob (usually by steps). This will cause some voltage drop across the resistor. So the fan terminals receive a reduced voltage and the fan will rotate at a lesser speed. The drawback is the power dissipation in the resistor i.e. to get reduced speed we are wasting some power into a resistor which causes heating and energy wastage. Due to this fan operating at full speed and lower speeds will be consuming almost same power. There will be heat sinks and openings on top to dissipate heat from resistors coils which makes the design bulky.";
                }

                if(position == 3){
                    def = "The electronics circuits in CFL, LED and other lightning lamps contain resistors. Resistors are connected with LEDs in series and are usually known as ballast resistors. The ballast resistor is used to limit the current through the LED and to prevent that it burns. If the voltage source is equal to the voltage drop of the LED, no resistor is required.";
                }

                if(position == 4){
                    def = "Automatic street lighting system uses LDR (light dependent resistors/photoresistors) in their working. During daylight, the resistance of lamps is adjusted to turns off the lights. When the sun falls the resistance also changes, this variation in resistance is used to turn on the lights.";
                }

                tvu32.setText(def);
                tvu32.setVisibility(View.VISIBLE);
            }
        });
    }
}