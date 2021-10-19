package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT6 extends AppCompatActivity {

    TextView tvt61, tvt62;
    ListView lv6;
    ArrayList<String> arr6;
    ArrayAdapter<String> adap6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t6);

        tvt61 = findViewById(R.id.tvt61);
        tvt62 = findViewById(R.id.tvt62);
        lv6 = findViewById(R.id.lv6);

        tvt61.setText("Types of Inductors");
        tvt62.setVisibility(View.GONE);

        arr6 = new ArrayList<String>();

        arr6.add("Air Core Inductor");
        arr6.add("Iron Core Inductor");
        arr6.add("Iron Powder Inductor");
        arr6.add("Laminated Core Inductor");
        arr6.add("Bobbin based Inductor");
        arr6.add("Toroidal Inductor");
        arr6.add("Multi-layer Ceramic Inductor");
        arr6.add("Film Inductor");
        arr6.add("Variable Inductor");
        arr6.add("Coupled Inductor");

        adap6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr6);

        lv6.setAdapter(adap6);

        lv6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Ceramic core inductors are referred as Air core inductors. Ceramic is the most commonly used material for inductor cores. Ceramic has very low thermal co-efficient of expansion, so even for a range of operating temperatures the stability of the inductor’s inductance is high. Since ceramic has no magnetic properties, there is no increase in the permeability value due to the core material. Its main aim is to give a form for the coil. In some cases it will also provide the structure to hold the terminals in place. The main advantage of these inductors are very low core losses, high Quality factor. These are mainly used in high frequency applications where low inductance values are required.";
                }

                if(position == 1){
                    def = "In the areas where low space inductors are in need then these iron core inductors are best option.These inductors have high power and high inductance value but limited in high frequency capacity. These are applicable in audio equipments. When compared with other core indictors these have very limited applications.";
                }

                if(position == 2){
                    def = "These are formed from very fine particles with insulated particles of highly pure iron powder. This type of inductor contains nearly 100% iron only. It gives us a solid looking core when this iron power is compressed under very high pressure and mixed with a binder such as epoxy or phenolic. By this action iron powder forms like a magnetic solid structure which consists of distributed air gap. Due to this air gap it is capable to store high magnetic flux when compared with the ferrite core. This characteristic allows a higher DC current level to flow through the inductor before inductor saturates. This leads to reduce the permeability of the core. Mostly the initial permeability’s are below 100 only. Thus these inductors posses with high temperature co-efficient stability. These are mainly applicable in switching power supplies.";
                }

                if(position == 3){
                    def = "These core materials are formed by arranging many number of laminations on top of each other. These laminations may be made up of different materials and with different thicknesses. So this construction has more flexibility.These laminations are made up of steel with insulating material between them. These are arranged parallel to the field to avoid eddy current losses between the laminations. These are used in low frequency detectors. They have high power levels so , they are mostly used at power filtering devices for excitation frequencies above several KHz.";
                }

                if(position == 4){
                    def = "These are wounded on cylindrical bobbin so these are named as bobbin based inductors. These are mainly used for mounting on printed circuit boards. It consist of two types of leads they are axial lead and radial lead. Axial lead means lead exits from both sides of the core for horizontal mounting on PC board. Radial lead means lead exits from both sides of the core for vertical mounting on PC board.";
                }

                if(position == 5){
                    def = "Wire wounded on core which has ring or donut shaped surface. These are generally made up of different materials like ferrite, powdered iron and tape wound etc. This inductor has high coupling results between winding and early saturation. Its arrangement gives minimum loss in magnetic flux which helps to avoid coupling magnetic flux with other devices. It has high energy transferring efficiency and high inductance values at low frequency applications. These inductors mainly used in medical devices, switching regulators, air conditioners, refrigerators, telecommunications and musical instruments etc.";
                }

                if(position == 6){
                    def = "The name itself indicates that it consist of multi layers. Simply by adding additional layers of coiled wire that is wound around the central core to the inductor gives multi-layer inductor. Generally for more number of turns in a wire , the inductance is also more. In these multi-layer inductors not only the inductance of the inductor increases but also the capacitance between the wires also increases. The most advantage of these inductors is by giving the lower operating frequencies also we can get higher inductance results. These are having applications at high frequencies to suppress noise, in signal processing modules like wireless LANs, Bluetooth etc. These are also used at mobile communication systems.";
                }

                if(position == 7){
                    def = "These uses a film of conductor on base material. Thus according to the requirement this film is shaped for conductor application. Film inductors in thin size are suitable for DC to DC converters that serve as power supplies in smart phones and mobile devices.";
                }

                if(position == 8){
                    def = "It is formed by moving the magnetic core in and outside of the inductor windings. By this magnetic core we can adjust the inductance value. When we consider a ferrite core inductor , by moving its core inside and outside on which the coil is wounded , variable ferrite core inductor can be formed. These type of inductors are used in radio and high frequency applications where the tuning is required. These inductors are typically ranged from 10 μH to 100 μH and in present days these are ranged from 10nH to 100 mH.";
                }

                if(position == 9){
                    def = "The two conductors connected by electromagnetic induction are generally referred as coupled inductors. We already seen that whenever the AC current is flowing in one inductor produces voltage in second inductor gives us mutual inductance phenomenon. Coupled inductors will work on this phenomenon only. These can isolate two circuits electrically by transferring impedance through the circuit. A transformer is one of the type of coupled inductor.";
                }

                tvt62.setText(def);
                tvt62.setVisibility(View.VISIBLE);
            }
        });


    }
}