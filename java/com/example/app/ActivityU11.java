package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU11 extends AppCompatActivity {

    TextView tvu111, tvu112;
    ListView lvu11;
    ArrayList<String> arru11;
    ArrayAdapter<String> adapu11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u11);

        tvu111 = findViewById(R.id.tvu111);
        tvu112 = findViewById(R.id.tvu112);
        lvu11 = findViewById(R.id.lvu11);

        tvu111.setText("Uses of Rectifiers");
        tvu112.setVisibility(View.GONE);

        arru11 = new ArrayList<>();

        arru11.add("Soldering");
        arru11.add("Welding");
        arru11.add("Telecommunication");
        arru11.add("Car Alternator");
        arru11.add("UPS System");

        adapu11 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru11);
        lvu11.setAdapter(adapu11);

        lvu11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "The diode in soldering iron acts as half wave rectifier. During the positive half cycle, it will conduct current and the heating element will get the power supply. During the negative half cycle, the diode blocks the power supply to the heating element.";
                }

                if(position == 1){
                    def = "Rectifier converts A/C to D/C in a welding application it allows you to burn low hydrogen rods in a D/C application. Welding rectifiers are the portable type machines which is used with AC input and provides desired DC output. The rectifier-type welding machine operates. from an ac power source but delivers ac high. grounding permits the electric current to return to. the welding generator through the water, the ship's. frequency and dc welding current.";
                }

                if(position == 2){
                    def = "When it comes to the telecommunications industry, rectifiers are essential for building network systems. Their use means that you won’t have to start from scratch when things need changing. The different types of rectifiers allow telecommunication companies to switch the layout of systems with relative ease. They also allow telcos to tailor their systems to suit their needs as and when they need modifying. Applications of rectifier products include fixed access network, wireless access network, transmission network and communication network of enterprise. Rectifiers can provide stable and reliable power for main suppliers and efficiently reduce power consumption. Because of this, every telecommunications company should take into consideration the different types of rectifiers before setting up or making alterations to their system.";
                }

                if(position == 3){
                    def = "he Bridge Rectifier is the assembly in every alternator that converts the AC (alternating current) that alternators make to DC (direct current) for use by the vehicles battery & electrical system. The Bridge Rectifier converts AC to DC using diodes which are semiconductors that are one way gates. Diodes allow current to flow in only one direction making alternating current into direct current. One very important note when it comes to high output alternators and bridge rectifiers. When we upgrade the output of our alternator, we must also upgrade the diodes in the bridge rectifier to a higher amperage rating. We use Heavy Duty Single, Dual and Triple Internal and External Bridge Rectifiers to increase the durability and prevent High Output Alternator failure.";
                }

                if(position == 4){
                    def = "The rectifier carries out several key functions. The first is to convert the input power from AC (Alternating Current) to DC (Direct Current). Its second main role is to recharge the batteries, while the DC power routes to the inverter too. Depending on the size of the UPS, the rectifier module may incorporate the battery charger. With smaller uninterruptible power supply systems (i.e. below 3 kVA) it is not uncommon for the rectifier and battery charger to be separate components. UPS rectifiers can accept wide input voltage fluctuations, meaning the system can handle overloads or surges without having to engage the batteries.";
                }

                tvu112.setText(def);
                tvu112.setVisibility(View.VISIBLE);
            }
        });

    }
}