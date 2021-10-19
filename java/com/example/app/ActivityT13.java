package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT13 extends AppCompatActivity {

    TextView tvt131, tvt132;
    ListView lvt13;
    ArrayList<String> arr13;
    ArrayAdapter<String> adap13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t13);

        tvt131 = findViewById(R.id.tvt131);
        tvt132 =findViewById(R.id.tvt132);
        lvt13 = findViewById(R.id.lvt13);

        arr13 = new ArrayList<String>();

        tvt131.setText("Types of Motors");
        tvt132.setVisibility(View.GONE);

        arr13.add("AC Brushless Motor");
        arr13.add("DC Brushed Motor");
        arr13.add("DC Brushless Motor");
        arr13.add("Direct Drive");
        arr13.add("Linear Motor");
        arr13.add("Servo Motor");
        arr13.add("Stepper Motor");

        adap13 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr13);

        lvt13.setAdapter(adap13);

        lvt13.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "AC brushless motors are some of the most popular in motion control. They use induction of a rotating magnetic field, generated in the stator, to turn both the stator and rotor at a synchronous rate. They rely on permanent electromagnets to operate.";
                }

                if(position == 1){
                    def = "In a DC brushed motor, brush orientation on the stator determines current flow. In some models, the brush’s orientation relative to the rotor bar segments is decisive instead. The commutator is especially important in any DC brushed motor design.";
                }

                if(position == 2){
                    def = "DC brushless motors were first developed to achieve higher performance in a smaller space than DC brushed motors, and they are smaller than comparable AC models. An embedded controller is used to facilitate operation in the absence of a slip ring or commutator.";
                }

                if(position == 3){
                    def = "Direct drive is a high-efficiency, low-wear technology implementation that replaces conventional servo motors and their accompanying transmissions. In addition to being far easier to maintain over a longer period of time, these motors accelerate more quickly.";
                }

                if(position == 4){
                    def = "These electric motors feature an unrolled stator and motor, producing linear force along the device’s length. In contrast to cylindrical models, they have a flat active section featuring two ends. They are typically faster and more accurate than rotatory motors.";
                }

                if(position == 5){
                    def = "A servo motor is any motor coupled with a feedback sensor to facilitate positioning; thus, servo motors are the backbone of robotics. Both rotary and linear actuators are used. Low-cost brushed DC motors are common, but are being superseded by brushless AC motors for high-performance applications.";
                }

                if(position == 6){
                    def = "Stepper motors use an internal rotor, electronically manipulated by external magnets. The rotor can be made with permanent magnets or a soft metal. As windings are energized, the rotor teeth align with the magnetic field. This allows them to move from point to point in fixed increments.";
                }

                tvt132.setText(def);
                tvt132.setVisibility(View.VISIBLE);
            }
        });
    }
}