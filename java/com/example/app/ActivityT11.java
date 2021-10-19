package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT11 extends AppCompatActivity {

    TextView tvt111, tvt112;
    ListView lvt11;
    ArrayList<String> arr11;
    ArrayAdapter<String> adap11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t11);

        tvt111 = findViewById(R.id.tvt111);
        tvt112 = findViewById(R.id.tvt112);
        lvt11 = findViewById(R.id.lvt11);

        tvt111.setText("Types of Rectifiers");
        tvt112.setVisibility(View.GONE);

        arr11 = new ArrayList<String>();

        arr11.add("Single Phase Rectifier");
        arr11.add("Triple Phase Rectifier");
        arr11.add("Half-Wave Rectifier");
        arr11.add("Full-Wave Rectifier");
        arr11.add("Bridge Rectifiers");
        arr11.add("Uncontrolled & Controlled Rectifiers");

        adap11 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr11);

        lvt11.setAdapter(adap11);

        lvt11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Single phase rectifiers have an input of one phase AC power. The structures are very simple, needing one, two or four diodes (dependent on the type of system). This means that the single phase rectifier delivers a small amount of power and has less transformer utilisation factor (TUF). A single phase rectifier uses only single phase of transformer secondary coil for the conversion and diodes are connected to the secondary winding of single phase transformer. This causes high ripple factor.";
                }

                if(position == 1){
                    def = "Three phase rectifiers have an input of three phase AV power. Structures need three or six diodes and these are connected to each phase of the transformer secondary winding. Three phase rectifiers are used in place of single phase rectifiers to reduce ripple factor. Comparing the two types of rectifiers, three phase is preferred when using large systems. This is because they can deliver large amounts of power and do not require any additional filter to reduce ripple factor. Because of this, three phase rectifiers are more efficient and have more transformer utilisation factor.";
                }

                if(position == 2){
                    def = "Half wave rectifiers convert one half cycle on the AC input into pulsating DC output. This allows half cycle of the AC input while blocking the other half cycle. The half cycle can be either positive or negative. It is the simplest rectifier as only one single diode is used. Due to the pulsating nature of the direct current, ripple factor is high. This means that half wave rectifiers are not considered to be efficient and they often need filters to reduce ripple factor. A high AC voltage is applied to the primary side of the step-down transformer. The obtained secondary low voltage is applied to the diode. The diode is forward biased during the positive half cycle of the AC voltage and reverse biased during the negative half cycle.When a diode is reverse biased, it acts as an open switch. Since no current can flow to the load, the output voltage is equal to zero.";
                }

                if(position == 3){
                    def = "Full wave rectifiers convert both (positive and negative) half cycles on the AC input into pulsating DC output. These types of transformer divides input AC into two parts – positive and negative. Due to this, full wave rectifiers are considered much more effective as the ripple factor is much lower in comparison. Also, as both cycles are allowed at the same time, it means that no signal is wasted. Like the half wave circuit, a full wave rectifier circuit produces an output voltage or current which is purely DC or has some specified DC component. Full wave rectifiers have some fundamental advantages over their half wave rectifier counterparts. The average (DC) output voltage is higher than for half wave, the output of the full wave rectifier has much less ripple than that of the half wave rectifier producing a smoother output waveform. n a Full Wave Rectifier circuit two diodes are now used, one for each half of the cycle. A multiple winding transformer is used whose secondary winding is split equally into two halves with a common centre tapped connection, (C). This configuration results in each diode conducting in turn when its anode terminal is positive with respect to the transformer centre point C producing an output during both half-cycles, twice that for the half wave rectifier so it is 100% efficient.";
                }

                if(position == 4){
                    def = "Bridge rectifiers are widely used in power supplies to supply direct current voltage to the components. They use four or more diodes and a load resistor. The four diodes are arranged in series with only two diodes allowing electric current during each half cycle. The diodes are considered to work in pairs, with one pair allowing electric current through the positive half cycle and the other half allowing current during the negative half cycle. The input alternating current is applied across two terminals and the output direct current is obtained across the resistor inductor which is connected between the other two terminals. Bridge rectifiers allow electric current during both positive and negative half cycles of the input AC signal. These circuit configurations do not require center tapped transformers, which can be very expensive.";
                }

                if(position == 5){
                    def = "Uncontrolled rectifiers are when only diodes are used in the circuit. All the rectifiers we have covered so far are uncontrolled rectifiers. Controlled rectifier circuits use thyristors to control the DC output. These are used when current needs to be controlled more accurately as diodes can only be on or off. Controlled rectifiers allow for continuous control and ensure there is no wastage of power.";
                }

                tvt112.setText(def);
                tvt112.setVisibility(View.VISIBLE);
            }
        });
    }
}