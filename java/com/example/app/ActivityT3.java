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

public class ActivityT3 extends AppCompatActivity {

    TextView tvt31, tvt32;
    ListView lvt3;
    ArrayList<String> arr3;
    ArrayAdapter<String> adap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t3);

        tvt31= findViewById(R.id.tvt31);
        tvt32 = findViewById(R.id.tvt32);
        lvt3 = findViewById(R.id.lvt3);

        tvt31.setText("Types of Resistors");
        tvt32.setVisibility(View.GONE);

        arr3 = new ArrayList<String>();

        arr3.add("Fixed Resistors");
        arr3.add("Variable Resistor");
        arr3.add("Photoresistors");
        arr3.add("Thermistor");
        arr3.add("Varistor");

        adap3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr3);

        lvt3.setAdapter(adap3);

        lvt3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def3 = new String();

                if(position == 0){

                    Intent intent = new Intent(ActivityT3.this, ActivityT31.class);

                    startActivity(intent);
                }

                if(position == 1){
                    def3 = "These resistors consist of a fixed resistor element and a slider which taps onto the main resistor element. This gives three connections to the component: two connected to the fixed element, and the third is the slider. In this way the component acts as a variable potential divider if all three connections are used. It is possible to connect to the slider and one end to provide a resistor with variable resistance.  A variable resistor is similar to a potentiometer, but with the slider linked to one end of the resistor so that it provides a true variable resistance.";
                }

                if(position == 2){
                    def3 = " Light dependent resistors or photoresistors change their resistance with the level of light. They are used in a number of sensor applications and provide a very cost effective solution in many instances. Light dependent resistors have a lag in the time taken to respond to light changes, but they are cheap and easy to use.";
                }

                if(position == 3){
                    def3 = "As the name indicates, thermistors are heat sensitive resistors. The resistance of the thermistor varying with temperature. Some have a negative temperature coefficient, NTC thermistors, whist others have a positive temperature coefficient, PTC thermistors.";
                }

                if(position == 4){
                    def3 = "Varistors are available in a number of forms. Essentially these electronic components vary their resistance with the applied voltage and as a result they find uses for spike and surge protection. Often they may be seen described as Movistors, which is a contraction of the words Metal Oxide Varistor. Varistors are the devices that are widely used in surge or transient protected mains extension leads and used to protect computers. It should be remembered that each time the varistor receives a spike its properties change slightly.";
                }

                tvt32.setText(def3);
                tvt32.setVisibility(View.VISIBLE);
            }
        });
    }
}