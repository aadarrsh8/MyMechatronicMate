package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU10 extends AppCompatActivity {

    TextView tvu101, tvu102;
    ListView lvu10;
    ArrayList<String> arru10;
    ArrayAdapter<String> adapu10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u10);

        tvu101 = findViewById(R.id.tvu101);
        tvu102 = findViewById(R.id.tvu102);
        lvu10 = findViewById(R.id.lvu10);

        tvu101.setText("Uses of Transistors");
        tvu102.setVisibility(View.GONE);

        arru10 = new ArrayList<>();

        arru10.add("Microphones");
        arru10.add("Cameras");
        arru10.add("Radios");
        arru10.add("Calculators");
        arru10.add("Fire Alarms");

        adapu10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru10);
        lvu10.setAdapter(adapu10);

        lvu10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "FETs are used primarily as impedance converters in condenser microphones. The condenser microphone capsule works as a transducer, converting sound waves (mechanical wave energy) into audio signals (electrical energy). The electrical audio signals (AC voltages) a condenser capsule outputs have incredibly high impedances and drive barely any current. FETs, by design, have extremely high input impedances at their gates. The impedance at the drain, however, is much lower and actually allows for current to flow. Hence they take  a high-impedance signal at its input and uses it to modulate a low-impedance signal at its output. This output signal is then capable of traveling through the rest of the microphone’s circuitry; the mic output, and through a mic cable to a microphone preamplifier.";
                }

                if(position == 1){
                    def = "When you press the charging button it closes the charging switch so that a short burst of current flows from the battery through the feedback coil to the base of the transistor. Applying current to the base of the transistor allows current to flow from the transistor collector to the emitter -- it makes the transistor briefly conductive. When the transistor is \"switched on\" in this way, a burst of current can flow from the battery to the primary coil of the transformer. The burst in current causes a change in voltage in the secondary coil, which in turn causes a change in voltage in the feedback coil. This voltage in the feedback coil conducts current to the transistor base, making the transistor conductive again, and the process repeats. The circuit keeps interrupting itself in this way, gradually boosting voltage through the transformer. This oscillating action produces the high-pitch whine you hear when a flash is charging up.";
                }

                if(position == 2){
                    def = "The function of transistors in radios is straightforward. Sounds are recorded through a microphone and turned into electrical signals. Those signals travel through a circuit, and the transistor amplifies the signal, which is subsequently much louder when it reaches a speaker.";
                }

                if(position == 3){
                    def = "Transistors are microscopic electrical switches that have two positions: on and off. The on position is represented by the number 1, and the off position by the number 0. (These are the famous 1s and 0sthat form the binary language of computers and calculators.) All numbers can be represented by a series of 1s and 0s. The number 2 — the one you keyed in for this calculation — sends electrons shooting into two transistors, turning one of them on and the other, off. The transistor configuration for \"2\" is thus \"10\".";
                }

                if(position == 4){
                    def = "A transistor drives a buzzer or an Led at the output as it detects a fire. The working of a fire sensor is quite easy and simple. The transistor turns on whenever it gets the base voltage of 0.7V through the resistor. As the circuit senses the fire it decreases the resistance at the base. Due to which the voltage across the base terminal increases or becomes equal to 0.7V which turns the transistor ON. The Led starts glowing to indicate the fire. When there is no fire, the led turns Off as the voltage across the base terminal falls below 0.7V so the transistor turns off.";
                }

                tvu102.setText(def);
                tvu102.setVisibility(View.VISIBLE);
            }
        });
    }
}