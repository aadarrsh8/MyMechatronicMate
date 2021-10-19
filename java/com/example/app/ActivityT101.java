package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT101 extends AppCompatActivity {

    TextView tvt101, tvt102;
    ListView lvt101;
    ArrayList<String> arr101;
    ArrayAdapter<String> adap101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t101);

        tvt101 = findViewById(R.id.tvt101);
        tvt102 = findViewById(R.id.tvt102);
        lvt101 = findViewById(R.id.lvt101);

        tvt101.setText("A bipolar junction transistor (BJT) is a type of transistor that uses both electrons and electron holes as charge carriers. In contrast, a unipolar transistor, such as a field-effect transistor, uses only one kind of charge carrier. A bipolar transistor allows a small current injected at one of its terminals to control a much larger current flowing between two other terminals, making the device capable of amplification or switching. BJTs use two junctions between two semiconductor types, n-type and p-type, which are regions in a single crystal of material. The junctions can be made in several different ways, such as changing the doping of the semiconductor material as it is grown, by depositing metal pellets to form alloy junctions, or by such methods as diffusion of n-type and p-type doping substances into the crystal. The superior predictability and performance of junction transistors soon displaced the original point-contact transistor. Diffused transistors, along with other components, are elements of integrated circuits for analog and digital functions. Hundreds of bipolar junction transistors can be made in one circuit at very low cost." + "\n" + "\n Types of BJTs are:-");
        tvt102.setVisibility(View.GONE);

        arr101 = new ArrayList<String>();

        arr101.add("NPN Transistors");
        arr101.add("PNP Transistors");

        adap101 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr101);

        lvt101.setAdapter(adap101);

        lvt101.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "An NPN transistor is the most commonly used bipolar junction transistor, and is constructed by sandwiching a P-type semiconductor between two N-type semiconductors. An NPN transistor has three terminals– a collector, emitter and base. The NPN transistor behaves like two PN junctions diodes connected back to back. These back to back PN junction diodes are known as the collector-base junction and base-emitter junction. Regarding the three terminals of the NPN transistor, the Emitter is a region is used to supply charge carriers to the Collector via the Base region. The Collector region collects most of all charge carriers emitted from the Emitter. The Base region triggers and controls the amount of current flows through the Emitter to Collector.";
                }

                if(position == 1){
                    def = "The transistor in which one n-type material is doped with two p-type materials such type of transistor is known as PNP transistor. It is a current controlled device. The small amount of base current controlled both the emitter and collector current. The PNP transistor has two crystal diodes connected back to back. The left side of the diode in known as the emitter-base diode and the right side of the diode is known as the collector-base diode. The hole is the majority carriers of the PNP transistors which constitute the current in it. The current inside the transistor is constituted because of the changing position of holes and in the leads of the transistor it is because of the flow of the electrons. The PNP transistor turns on when a small current flows through the base. The direction of current in PNP transistor is from the emitter to collector. The letter of the PNP transistor indicates the voltage requires by the emitter, collector and the base of the transistor. The base of the PNP transistor has always been negative with respect to the emitter and collector. In PNP transistor, the electrons are taken from the base terminal. The current which enters into the base is amplified into the collector ends.";
                }

                tvt102.setText(def);
                tvt102.setVisibility(View.VISIBLE);
            }
        });
    }
}