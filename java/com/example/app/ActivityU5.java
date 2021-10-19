package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU5 extends AppCompatActivity {

    TextView tvu51, tvu52;
    ListView lvu5;
    ArrayList<String> arru5;
    ArrayAdapter<String> adapu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u5);

        tvu51 = findViewById(R.id.tvu51);
        tvu52 = findViewById(R.id.tvu52);
        lvu5 = findViewById(R.id.lvu5);

        tvu51.setText("Uses of Transformers");
        tvu52.setVisibility(View.GONE);

        arru5 = new ArrayList<String>();

        arru5.add("Regulating AC");
        arru5.add("Starting and stopping the flow of current");
        arru5.add("Battery Charging");
        arru5.add("Steel-Manufacturing");
        arru5.add("Electrochemicals");

        adapu5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru5);
        lvu5.setAdapter(adapu5);

        lvu5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "All transformers have one basic function: increasing or decreasing alternating current within the electrical system. By regulating the flow of current, the transformer allows for increased energy efficiency, which regulates and ultimately lowers electricity bills.";
                }

                if(position == 1){
                    def = "Transformers are also useful in stopping the flow of electricity and interrupting an electric current. Transformers are commonly present in circuit breakers, where they utilize a switch to automatically interrupt the flow of electricity and to prevent damage that can occur as a result of high voltage.";
                }

                if(position == 2){
                    def = "The concept of battery charging is fuelled by the functioning of generators. Transformers are used to control the voltage that enters the battery during the charging process in order to prevent any damages that can occur to the internal battery components. This is important because an unregulated voltage can result in high surges during charging of batteries.";
                }

                if(position == 3){
                    def = "Steel manufacturing plants rely on the functioning of high voltage transformers to provide a range of voltages for the manufacturing process. High currents are required during melting and welding of steel, and lower current are required during the cooling process. In order to provide this range of voltages, transformers are necessary for regulating currents within the system.";
                }

                if(position == 4){
                    def = "In chemical engineering and manufacturing processes, electrolysis is normally fuelled by the functioning of transformers. Metals such as copper, zinc, and aluminum are normally used for the purposes of electroplating. During the process, transformers provide a regulated electrical current that is used to drive the chemical reaction from the beginning stages until completion. The current can be therefore be regulated as the reaction proceeds.";
                }

                tvu52.setText(def);
                tvu52.setVisibility(View.VISIBLE);
            }
        });
    }
}