package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT4 extends AppCompatActivity {

    TextView tvt41, tvt42;
    ListView lvt4;
    ArrayList<String> arr4;
    ArrayAdapter<String> adap4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t4);

        tvt41 = findViewById(R.id.tvt41);
        tvt42 = findViewById(R.id.tvt42);
        lvt4 = findViewById(R.id.lvt4);

        tvt41.setText("Types of Capacitors");
        tvt42.setVisibility(View.GONE);

        arr4 = new ArrayList<String>();

        arr4.add("Dielectric Capacitor");
        arr4.add("Mica Capacitor");
        arr4.add("Polarized Capacitor");
        arr4.add("Film Capacitor");
        arr4.add("Ceramic Capacitor");
        arr4.add("Electrolytic Capacitor");
        arr4.add("Super Capacitor");
        arr4.add("Non-Polarized Capacitor");
        arr4.add("Polymer Capacitor");
        arr4.add("Leaded and Surface-Mount Capacitor");
        arr4.add("Special Purpose Capacitor");

        adap4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr4);

        lvt4.setAdapter(adap4);

        lvt4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def4 = new String();

                if (position == 0){
                    def4 = "These types of capacitors are the variable type that requires a continuous change in the capacitance for transmitters, receivers & transistor radios for tuning. Variable dielectric types are obtainable within multi-plate and air-spaced. These capacitors have a set of fixed as well as movable plates to move among the fixed plates. The moving plate’s position as compared with the fixed plates will determine the approximate capacitance value. In general, the capacitance is maximum once the two sets of plates are completely connected. The tuning capacitor with high capacitance includes fairly large spacing otherwise air gaps among the two plates with breakdown voltages getting thousands of volts.";
                }

                if(position == 1){
                    def4 = "The capacitor which uses Mica like the dielectric material is known as a mica capacitor. These capacitors are available in two types like clamped and silver. Clamped type is now considered outdated because of their lower characteristics but the silver type is used in its place. These capacitors are fabricated by sandwiching metal coated mica sheets on both faces. After that, this design is enclosed in epoxy for protecting it from the surroundings. Generally, these capacitors are used whenever stable capacitors with relatively small values are required.";
                }

                if(position == 2){
                    def4 = "The capacitor that has specific polarities like positive and negative is called a polarized capacitor. Whenever these capacitors are used in the circuits we have to check that they are allied within ideal polarities. These capacitors are classified into two type’s namely electrolytic and supercapacitors.";
                }

                if(position == 3){
                    def4 = "Film Capacitors are the most normally ready of numerous types of capacitors, comprising of a generally expansive group of capacitors with the distinction being in their dielectric properties. They are available in almost any value and voltages as high as 1500 volts. They come in any tolerance from 10% to 0.01%. Film capacitors additionally arrive in a combination of shapes and case styles. The electrodes of film capacitors may be metalized aluminum or zinc, applied on one or both sides of the plastic film, resulting in metalized film capacitors.";
                }

                if (position == 4){
                    def4 = "Ceramic capacitors are used in high-frequency circuits such as audio to RF. They are also the best choice for high-frequency compensation in audio circuits. These capacitors are also called disc capacitors. Ceramic capacitors are made by coating two sides of small porcelain or ceramic disc with silver and are then stacked together to make a capacitor. One can make both low capacitance and high capacitance in ceramic capacitors by changing the thickness of the ceramic disc used.";
                }

                if(position == 5){
                    def4 = "These are the most prevalently used capacitors that have a wide tolerance capacity. Electrolytic capacitors are available with working voltages up to about 500V, although the highest capacitance values are not available at high voltage and higher temperature units are available, but uncommon. There are two types of electrolytic capacitors, tantalum, and aluminum in common. Tantalums capacitors have an ordinarily better exhibition, higher value, and are ready just to a more limited extent of parameters. The dielectric properties of tantalum oxide are much superior to those of aluminum oxide giving an easier leakage current and better capacitance strength which makes them suitable for obstructing, decoupling, filtering applications.";
                }

                if (position == 6){
                    def4 = "The capacitors which have an electrochemical capacity with high capacitance values as compared with other capacitors are known as supercapacitors. The categorization of these can be done like a group that lies among electrolytic capacitors as well as rechargeable batteries which are known as ultracapacitors. Their  capacitance value of this capacitor is high, the charge can be stored as well as delivered very quickly and these capacitors can handle additional charge with discharge cycles.";
                }

                if(position == 7){
                    def4 = "The capacitors don’t have polarities like positive otherwise negative. The electrodes of non-polarized capacitors can be inserted randomly into the circuit for feedback, coupling, decoupling, oscillation & compensation. These capacitors have small capacitance so used in pure AC circuits & also used in high-frequency filtering. The selection of these capacitors can be done very conveniently with similar models & specifications.";
                }

                if (position == 8){
                    Intent intent = new Intent(ActivityT4.this, ActivityT41.class);

                    startActivity(intent);
                }

                if (position == 9){
                    def4 = "Capacitors are accessible like leaded ranges & surface mount capacitors. Almost all kinds of the capacitor are obtainable like leaded versions such as ceramic, electrolytic, supercapacitors, silver mica, plastic film, glass, etc. The surface mount or SMD is limited but they must resist the temperatures which are used within the process of soldering. When the capacitor doesn’t have any leads & also as a result of the soldering method is used, then SMD capacitors are exposed to the complete temperature rise of the solder itself. As a result, not all varieties are available as SMD capacitors.";
                }

                if (position == 10){
                    def4 = "Special purpose capacitors are utilized in AC power applications such as UPS & CVT systems up to 660V AC. The selection of appropriate capacitors mainly plays an important role within the life expectancy of the capacitors. Therefore, it is completely required to utilize proper capacitor value through a voltage-current rating to match the precise application. The features of these capacitors are sturdiness, durability, shockproof, dimensional accuracy, and extremely strong.";
                }

                tvt42.setText(def4);
                tvt42.setVisibility(View.VISIBLE);
            }
        });
    }
}