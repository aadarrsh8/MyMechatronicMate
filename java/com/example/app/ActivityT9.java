package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT9 extends AppCompatActivity {

    TextView tvt91, tvt92;
    ListView lvt9;
    ArrayList<String> arr9;
    ArrayAdapter<String> adap9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t9);

        tvt91 = findViewById(R.id.tvt91);
        tvt92 = findViewById(R.id.tvt92);
        lvt9 = findViewById(R.id.lvt9);

        tvt91.setText("Types of Integrated Circuits");
        tvt92.setVisibility(View.GONE);

        arr9 = new ArrayList<String>();

        arr9.add("Digital ICs");
        arr9.add("Analog ICs");
        arr9.add("Mixed ICs");
        arr9.add("Logic Circuits");

        adap9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr9);

        lvt9.setAdapter(adap9);

        lvt9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "The integrated circuits that operate only at a few defined levels instead of operating overall levels of signal amplitude are called Digital ICs and these are designed by using multiple numbers of digital logic gates, multiplexers, flip flops, and other electronic components of circuits. These logic gates work with binary input data or digital input data, such as 0 (low or false or logic 0) and 1 (high or true or logic 1). These digital ICs are frequently used in computers, microprocessors, digital signal processors, computer networks, and frequency counters. There are different types of digital ICs or types of digital integrated circuits, such as programmable ICs, memory chips, logic ICs, power management ICs and interface ICs.";
                }

                if(position == 1){
                    def = "The integrated circuits that operate over a continuous range of signals are called Analog ICs. In fact, the relationship between the voltage and current may be nonlinear in some cases over a long range of the continuous analog signal. The frequently used analog IC is an operational amplifier or simply called an op-amp, similar to the differential amplifier, but possesses a very high voltage gain. It consists of a very less number of transistors compared to the digital ICs, and, for developing analog application-specific integrated circuits (analog ASICs), computerized simulation tools are used.";
                }

                if(position == 2){
                    def = "The integrated circuits that are obtained by the combination of analog and digital ICs on a single chip are called Mixed ICs. These ICs functions as Digital to Analog converters, Analog to Digital converters (D/A and A/D converters), and clock/timing ICs. This mixed-signal Systems-on-a-chip is a result of advances in the integration technology, which enabled to the integration of digital, multiple analogs, and RF functions on a single chip. Mixed-signal ICs are often used to convert analog signals to digital signals so that digital devices can process them. For example, mixed-signal ICs are essential components for FM tuners in digital products such as media players, which have digital amplifiers. Any analog signal (such as an FM radio transmission, a light wave or a sound) can be digitized using a very basic analog-to-digital converter, and the smallest and most energy efficient of these would be in the form of mixed-signal ICs. Mixed-signal ICs are more difficult to design and manufacture than analog-only or digital-only integrated circuits. For example, an efficient mixed-signal IC would have its digital and analog components share a common power supply. However, analog and digital components have very different power needs and consumption characteristics that make this a non-trivial goal in chip design.";
                }

                if(position == 3){
                    def = "The outputs of Logic Circuits are only determined by the logical function of their current input state, logic “0” or logic “1”, at any given instant in time. The result is that combinational logic circuits have no feedback, and any changes to the signals being applied to their inputs will immediately have an effect at the output. In other words, in a Logic Circuit, the output is dependant at all times on the combination of its inputs. Thus a combinational circuit is memoryless. So if one of its inputs condition changes state, from 0-1 or 1-0, so too will the resulting output as by default combinational logic circuits have “no memory”, “timing” or “feedback loops” within their design.";
                }

                tvt92.setText(def);
                tvt92.setVisibility(View.VISIBLE);

            }
        });
    }
}