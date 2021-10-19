package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT31 extends AppCompatActivity {

    TextView tvt311, tvt312;
    ListView lv31;
    ArrayList<String> arr31;
    ArrayAdapter<String> adap31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t31);

        tvt311 = findViewById(R.id.tvt311);
        tvt312 = findViewById(R.id.tvt312);
        lv31 = findViewById(R.id.lv31);

        tvt311.setText("Fixed resistors are by far the most widely used type of resistor. They are used in electronics circuits to set the right conditions in a circuit. Their values are determined during the design phase of the circuit, and they should never need to be changed to adjust the circuit." + "\n" + "\n The different types of Fixed Resistors are:- ");
        tvt312.setVisibility(View.GONE);

        arr31 = new ArrayList<String>();

        arr31.add("Carbon Composition Resistor");
        arr31.add("Carbon Film Resistor");
        arr31.add("Metal Oxide Film Resistor");
        arr31.add("Metal Film Resistor");
        arr31.add("Wire Wound Resistor");
        arr31.add("Surface Mount Resistor");

        adap31 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr31);

        lv31.setAdapter(adap31);

        lv31.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def31 = new String();

                if(position == 0){
                    def31 = "The carbon composition resistor is a type of resistor that was once very common - it was the main type of resistor, but are now seldom used because newer forms of resistor provide better performance, they are smaller and also cheaper. Carbon composition resistors are formed by mixing carbon granules with a binder which was then made into a small rod. This type of resistor was large by today's standards and suffered from a large negative temperature coefficient. The resistors also suffered from a large and erratic irreversible changes in resistance as a result of heat or age. In addition to this the granular nature of the carbon and binder lead to high levels of noise being generated when current flowed.";
                }

                if (position == 1){
                    def31 = "This type of resistor was introduced during he early days of transistor technology when power levels tended to be lower. The carbon film resistor is formed by \"cracking\" a hydrocarbon onto a ceramic former. The resulting deposited film had its resistance set by cutting a helix into the film. This made these resistors highly inductive and of little use for many RF applications. They exhibited a temperature coefficient of between -100 and -900 parts per million per degree Celcius. The carbon film is protected either by a conformal epoxy coating or a ceramic tube.";
                }

                if(position == 2){
                    def31 = "This type of resistor is now the most widely used form of resistor. Rather than using a carbon film, this resistor type uses a metal oxide film deposited on a ceramic rod. As with the carbon film, the the resistance can be adjusted by cutting a helical grove in the film. Again the film is protected using a conformal epoxy coating. This type of resistor has a temperature coefficient of around + or - 15 parts per million per °Celcius, giving it a far superior performance to that of any carbon based resistor. Additionally this type of resistor can be supplied to a much closer tolerance, 5% or even 2% being standard, with 1% versions available. They also exhibit a much lower noise level than carbon types of resistor, however it has mainly been superseded but he metal film resistor.";
                }

                if(position == 3){
                    def31 = "The metal film resistor is very similar to the metal oxide film resistor. Visually it is very similar and the performance is also comparable. Instead of using a metal oxide film, this type of resistor uses a metal film as the name indicates. Metals such as nickel alloy may be used. The metal film resistor is the type that is most widely used when a leaded resistor is needed.";
                }

                if(position == 4){
                    def31 = "This resistor type is generally reserved for high power applications. These resistors are made by winding wire with a higher than normal resistance (resistance wire) on a former. The more expensive varieties are wound on a ceramic former and they may be covered by a vitreous or silicone enamel. This resistor type is suited to high powers and exhibits a high level of reliability at high powers along with a comparatively low level of temperature coefficient, although this will depend on a number of factors including the former, wire used, etc. As wire wound resistors are often intended for high power applications, some varieties are designed so that they can be mounted onto a heatsink to ensure that the power is dissipated into metalwork so it can be carried away. In view of their wound nature, they are not suitable for operation above low frequencies, although by winding parts of the resistance wire in different directions the inductance can be reduced somewhat.";
                }

                if(position == 5){
                    def31 = "Surface mount technology, SMT is now the major format used for electronic components. They are easier to use in automated manufacturing, and they are able to provide very high levels of performance. SMT resistors utilise similar technologies to other forms, but in a surface mount format.";
                }

                tvt312.setText(def31);
                tvt312.setVisibility(View.VISIBLE);
            }
        });


    }
}