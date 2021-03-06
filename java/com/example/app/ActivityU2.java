package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ActivityU2 extends AppCompatActivity {

    TextView tvu21, tvu22;
    ListView lvu2;
    ArrayAdapter<String> adapu2;
    ArrayList<String> arru2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u2);

        tvu21 = findViewById(R.id.tvu21);
        tvu22 = findViewById(R.id.tvu22);
        lvu2 = findViewById(R.id.lvu2);

        tvu21.setText("Uses of Sensors");
        tvu22.setVisibility(View.GONE);

        arru2 = new ArrayList<String>();

        arru2.add("Automotive");
        arru2.add("Manufacturing");
        arru2.add("Aviation");
        arru2.add("Medical & Healthcare");
        arru2.add("Marine");

        adapu2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru2);
        lvu2.setAdapter(adapu2);

        lvu2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "1. Braking and Traction control: Antilock Braking System (ABS) Sensors connected to the wheel, measures the speed of the wheel and braking pressure and keeps sending them to ABS controlling When the driver applies the sudden brake, ABS system, with breaking pressure and speed data received from the sensors, releases the braking pressure to avoid skidding/locking of wheels. It is one of the critical safety aspects of vehicles." + "\n" + "\n 2. Air Bags – Anti Cushion Restraint System (ACRS): Crush sensors and accelerometers placed in the vehicle measures the force and sends it to During accidents on sensing the force exceeds the limit, ACRS will activate the Airbag and save the life of passengers." + "\n" + "\n 3. Avoiding Collisions: Proximity sensors in the front, back, and sides of the vehicle forewarn the driver of a possible Infrared, Video assistance, Ultrasonic technologies assist drivers while parking their vehicles." + "\n" + "\n 4. Comfort and Convenience: Many sensors provide inputs and warnings to drivers on Vehicle Speed, Engine Speed, Fuel level, Tire pressure, Door/deck, light bulbs for driving comfort and convenience." + "\n" + "\n 5. Engine Data: Sensors provides so much data on Engine performance, such as ignition, combustion, exhaust gas oxygen, fuel mix, exhaust gas recycling, transmission control etc." + "\n" + "\n Other applications include Heating, ventilation, and Air-condition (HVAC), navigation, suspension, remote-locking etc.";
                }

                if(position == 1){
                    def = "1. Predictive maintenance of the machinery, Assembly equipment using the data collected from sensors in the machines." + "\n" + "\n 2. Optimal utilization of Machines by continuously monitoring the performances and effectively rejigging the operations with the data collected from sensors." + "\n" + "\n 3. Fine-tuning the Quality systems and enhance the quality standards using the data collected from sensors. Design notifications and alerts in case of a deterioration of quality and process standards." + "\n" + "\n 4. Agility in reacting to market demands.";
                }

                if(position == 2){
                    def = "Sensors deployed in the aviation industry measures the data during navigation of aircraft, monitoring various systems, and controlling instruments. These data are utilized inefficient flight operations, improve aircraft performance and design improvements." + "\n" + "\n Some of the instrumentation sensors are tachometers, gauges to measure engine pressure and oil& fuel quantity, Altimeters, airspeed meters, etc. Sensors help measure the testing of the ground conditions, vibration and environment factors and provide useful inputs to the pilot to manage the general operation and emergency conditions.";
                }

                if(position == 3){
                    def = "Signals generated by Sensors in Medical equipment, surgical instruments and devices are used for diagnosis, treatment and control functions by doctors." + "\n" + "\n Some of the applications are:" + "\n" + "\n 1. Blood pressure monitoring (self)." + "\n" + "\n 2. Continuous glucose monitoring by individuals." + "\n" + "\n 3. Automatic measurement of vitals of the patient and sending it to the patient’s doctor." + "\n" + "\n 4. Automatic detection of visitors spreading the disease to patients in hospitals.";
                }

                if(position == 4){
                    def = "The marine systems leverage multiple technologies, such as sensors and microelectronics, and communication protocols to ensure ubiquitous connectivity of underwater equipment. Such systems carry out long-term missions with minimal human intervention." + "\n" + "\n In the marine systems, the data acquisition and monitoring tasks of subsea platforms are very critical and predominant. The measurement parameters that are required by the research scientists and engineers in the shore can be retrieved through a user-friendly data management system. The marine systems are set up by linking sensor-packed buoys, shore (land-based) stations, undersea monitors, research vessels, and satellites." + "\n" + "\n The marine sector is driven by a high demand for miniaturized, high sensitive and sustainable sensors for enabling autonomous marine vehicle and safe navigation. Sensor technology, along with Artificial Intelligence, Big Data analytics, and IoT- enabled devices, will drive the adoption of marine sensing systems as they provide competitive safety and security advantages and drive the development of ubiquitous solutions.";
                }

                tvu22.setText(def);
                tvu22.setVisibility(View.VISIBLE);
            }
        });
    }
}