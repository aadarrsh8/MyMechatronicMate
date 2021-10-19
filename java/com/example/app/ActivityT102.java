package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT102 extends AppCompatActivity {

    TextView tvt201, tvt202;
    ListView lvt102;
    ArrayList<String> arr102;
    ArrayAdapter<String> adap102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t102);

        tvt201 = findViewById(R.id.tvt201);
        tvt202 = findViewById(R.id.tvt202);
        lvt102 = findViewById(R.id.lvt102);

        arr102 = new ArrayList<String>();

        tvt201.setText("The field-effect transistor (FET) is a type of transistor that uses an electric field to control the flow of current. FETs are devices with three terminals: source, gate, and drain. FETs control the flow of current by the application of a voltage to the gate, which in turn alters the conductivity between the drain and source. FETs are also known as unipolar transistors since they involve single-carrier-type operation. That is, FETs use either electrons or holes as charge carriers in their operation, but not both. Many different types of field effect transistors exist. Field effect transistors generally display very high input impedance at low frequencies." + "\n" + "\n Types of FETs are:-");
        tvt202.setVisibility(View.GONE);

        arr102.add("JFET");
        arr102.add("MOSFET");

        adap102 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr102);

        lvt102.setAdapter(adap102);

        lvt102.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "The junction-gate field-effect transistor (JFET) is one of the simplest types of field-effect transistor. JFETs are three-terminal semiconductor devices that can be used as electronically controlled switches or resistors, or to build amplifiers. Unlike bipolar junction transistors, JFETs are exclusively voltage-controlled in that they do not need a biasing current. Electric charge flows through a semiconducting channel between source and drain terminals. By applying a reverse bias voltage to a gate terminal, the channel is \"pinched\", so that the electric current is impeded or switched off completely. A JFET is usually \"on\" when there is no voltage between its gate and source terminals. If a potential difference of the proper polarity is applied between its gate and source terminals, the JFET will be more resistive to current flow, which means less current would flow in the channel between the source and drain terminals. JFETs are sometimes referred to as depletion-mode devices, as they rely on the principle of a depletion region, which is devoid of majority charge carriers. The depletion region has to be closed to enable current to flow.";
                }

                if(position == 1){
                    def = "The metal–oxide–semiconductor field-effect transistor (MOSFET, MOS-FET, or MOS FET), also known as the metal–oxide–silicon transistor (MOS transistor, or MOS), is a type of insulated-gate field-effect transistor that is fabricated by the controlled oxidation of a semiconductor, typically silicon. The voltage of the covered gate determines the electrical conductivity of the device; this ability to change conductivity with the amount of applied voltage can be used for amplifying or switching electronic signals. A key advantage of a MOSFET is that it requires almost no input current to control the load current, when compared with bipolar junction transistors (BJTs). In an enhancement mode MOSFET, voltage applied to the gate terminal can increase the conductivity from the \"normally off\" state. In a depletion mode MOSFET, voltage applied at the gate can reduce the conductivity from the \"normally on\" state. MOSFETs are also capable of high scalability, with increasing miniaturization, and can be easily scaled down to smaller dimensions. They also have faster switching speed (ideal for digital signals), much smaller size, consume significantly less power, and allow much higher density (ideal for large-scale integration), compared to BJTs. MOSFETs are also cheaper and have relatively simple processing steps, resulting in high manufacturing yield.";
                }
                tvt202.setText(def);
                tvt202.setVisibility(View.VISIBLE);
            }
        });
    }
}