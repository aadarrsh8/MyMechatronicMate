package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT14 extends AppCompatActivity {

    TextView tvt141, tvt142;
    ListView lvt14;
    ArrayList<String> arr14;
    ArrayAdapter<String> adap14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t14);

        tvt141 = findViewById(R.id.tvt141);
        tvt142 = findViewById(R.id.tvt142);
        lvt14 = findViewById(R.id.lvt14);

        arr14 = new ArrayList<String>();

        tvt141.setText("Types of Switches");
        tvt142.setVisibility(View.GONE);

        arr14.add("Single Pole Single Throw");
        arr14.add("Single Pole Double Throw");
        arr14.add("Double Pole Single Throw");
        arr14.add("Double Pole Double Throw");

        adap14 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr14);

        lvt14.setAdapter(adap14);

        lvt14.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "The SPST is a basic ON/OFF switch, that is used to connect or break the connection between two terminals. The power supply for the owl circuit is given by this switch. The application of SPST switch is light switch given below and it is also called as a toggle switch. This type of switch has one input and one output. This light switch circuit controls one wire and makes one connection. This is an ON/OFF switch, when the switch in the below circuit is ON or closed, then the current flows through the two terminals and the bulb in the circuit will blink. When the switch is OFF or open, then the current doesn’t flow through the two terminals.";
                }

                if(position == 1){
                    def = "The SPDT switch is a three terminal switch, one terminal is used as input and remaining two terminals are used as outputs. It joins a mutual terminal to one or the other of two terminals. In the SPDT switch, instead of other terminals, just use COM terminal. For example, we can use COM & A or COM & B. The application of SPDT switch is mainly involved in a three-way circuit to turn ON/OFF a light from two locations like from the top & bottom of a stairway. In the circuit below, when the switch A is closed, then the current flows through the terminals, but only light A will glow and light B will OFF. When the switch B is closed, then the current flows through the terminals and only light B will glow and light ‘A’ will OFF. Her two circuits will be controlled through one source or one way.";
                }

                if(position == 2){
                    def = "The DPST switch consists of two poles that means it includes two identical switches located on side by side. This switch is operated by one single toggle, which means that two discrete circuits are controlled at a time through one push. This switch is used to turn two circuits ON/OFF and it consists of four terminals namely two inputs and two o/ps. The main purpose of this switch is to regulate a 240V appliance, where both supply voltages must be ON whereas the unbiased wire may be always connected. When this switch is ON then the current starts flowing through two circuits and when it is turned OFF then it is turned OFF.";
                }

                if(position == 3){
                    def = "This switch is equal to two SPDT switches, it means two separate circuits, connecting two inputs of each circuit to one of two outputs. The switch position controls the number of ways and from the two contacts each contact can be routed. When it is in ON-ON mode or ON-OFF-ON mode they work like two discrete SPDT switches worked by the similar actuator. At a time only two loads can be ON. A DPDT switch can be used in any application that needs an open & closed wiring system.";
                }

                tvt142.setText(def);
                tvt142.setVisibility(View.VISIBLE);
            }
        });
    }
}