package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU13 extends AppCompatActivity {

    TextView tvu131, tvu132;
    ListView lvu13;
    ArrayList<String> arru13;
    ArrayAdapter<String> adapu13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u13);

        tvu131 = findViewById(R.id.tvu131);
        tvu132 = findViewById(R.id.tvu132);
        lvu13 = findViewById(R.id.lvu13);

        tvu131.setText("Uses of Motors");
        tvu132.setVisibility(View.GONE);

        arru13 = new ArrayList<>();

        arru13.add("Vaccum Cleaners");
        arru13.add("Dishwashers");
        arru13.add("Water-Pumping Systems");
        arru13.add("Tape-Recorders");
        arru13.add("Ships");
        arru13.add("Paper Mills");

        adapu13 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru13);
        lvu13.setAdapter(adapu13);

        lvu13.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Vacuum cleaners uses an electric motor that spins a fan, sucking in air – and any small particles caught up in it – and pushing it out the other side, into a bag or a canister, to create the negative pressure. The vacuum has an exhaust port that vents the air out the other side, allowing the motor to continue functioning normally.";
                }

                if(position == 1){
                    def = "Dishwashers normally include a pump to provide the water spray with a controlled pressure. The water is recirculated by using a coarse filter system. The pumps are normally driven by an electric motor. Currently, most dishwashers use an induction motor, such as a permanent split capacitor motor, to drive the pump, because this type of motor has a reliable construction.";
                }

                if(position == 2){
                    def = "Pumps are used to provide water supplies for buildings and well-matched with pneumatic systems where the no-suction lift is necessary. The main purpose of these water pumps is to pump water from wells in homes & to increase water pressure in intake lines. The pump is powered by an electric motor that drives an impeller, or centrifugal pump. The impeller moves water, called drive water, from the well through a narrow orifice, or jet, mounted in the housing in front of the impeller. ... Its function is to slow down the water and increase the pressure.";
                }

                if(position == 3){
                    def = "A motor circuit of a tape recorder comprises a mechanical switch in which a movable contact is connected to a first contact in response to the depression of a recording or reproduction button, and also to a second contact in response to the depression of a fast feeding or rewinding button. A motor control circuit is connected to a D.C. power source through the first contact of the mechanical switch to provide a motor speed suitable for the recording or reproduction. An output terminal of a constant voltage circuit connected to the D.C. power source is connected to the motor through a switching transistor. The switching transistor is rendered conducting in response to the closing of the second contact of the mechanical switch, causing an output from the constant voltage circuit to be supplied to the motor to rotate the motor at a high speed suitable for the fast feeding or rewinding.";
                }

                if(position == 4){
                    def = "The ship electrical motor is the most commonly used device for conversion from electrical to mechanical power on ship and is used for ship electric propulsion, thrusters for propulsion on ship or station keeping, and other on-board loads such as ships winches, pumps on ship, fans, etc. Using electric motor eliminates the need to carry fuel and oil within the boat that can easily spill and cause fire. Ordinarily, for a diesel or gasoline engine boat, it is always important to have fuel backup within the boat in case it runs out.";
                }

                if(position == 5){
                    def = "Paper mills use specialist machines equipped with large DC motors to produce pulp from raw material, convert pulp to paper, wind to reel and post-produce by slitting, coating, printing and packaging. The main motor runs at a constant speed and variation in its speed affects the quality of paper severely.";
                }

                tvu132.setText(def);
                tvu132.setVisibility(View.VISIBLE);
            }
        });

    }
}