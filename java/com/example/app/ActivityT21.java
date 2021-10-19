package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT21 extends AppCompatActivity {

    TextView tvt211, tvt212;
    ArrayList<String> arr21;
    ArrayAdapter<String> adap21;
    ListView lv21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t21);

        tvt211 = findViewById(R.id.tvt211);
        tvt212 = findViewById(R.id.tvt212);
        lv21 = findViewById(R.id.lv21);

        tvt211.setText("Based on Quantity Measured");
        tvt212.setVisibility(View.GONE);

        arr21 = new ArrayList<String>();

        arr21.add("Temperature Sensor");
        arr21.add("IR Sensor");
        arr21.add("Proximity Sensor");
        arr21.add("Ultrasonic Sensor");
        arr21.add("Accelerometers");
        arr21.add("Gyroscope Sensor");
        arr21.add("Hall Effect Sensor");
        arr21.add("Pressure Sensor");

        adap21 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr21);

        lv21.setAdapter(adap21);

        lv21.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def21 = new String();

                if(position == 0){
                    def21 = "A temperature sensor is an electronic device that measures the temperature of its environment and converts the input data into electronic data to record, monitor, or signal temperature changes.";
                }

                if (position == 1){
                    def21 = "When we look into electromagnetic spectrum, infrared region is divided into three regions as Near Infrared, mid Infrared and far Infrared region. Infrared spectrum has a higher frequency range than microwave and lesser frequency than visible light. An infrared sensor is used for emitting and detecting IR radiation. By this principle, IR sensor can be used as obstacle detector.";
                }

                if (position == 2){
                    def21 = "Proximity sensor is a type of non-contact sensor used for object detection. It does not have any physical contact with the object. The object whose distance is to be measured is known as target. An IR light or electromagnetic radiation is used in a proximity sensor.";
                }

                if (position == 3){
                    def21 = "Ultrasonic sensors are used to measure distance or travel time using ultrasonic waves. A source will be used to emit ultrasonic wave. After wave hits the target, the waves are reflected and the detector collects the signal. The travel time between the transmitted wave and reflected wave is measured using Ultrasonic sensor.";
                }

                if (position == 4){
                    def21 = "Accelerometer is a type of sensor that is used to detect changes in position, velocity, and vibration by sensing motion. It can be either analog or digital type. In analog accelerometer, depending on volume of acceleration applied to accelerometer, continuous analog voltage signal is produced.";
                }

                if (position == 5){
                    def21 = "Gyroscope sensor to sense and determine the orientation with the help of Earth’s gravity i.e. it measures the angular velocity. The main difference between Accelerometers & Gyroscope Sensors is that Gyroscope can sense the rotation where accelerometer can’t.";
                }

                if (position == 6){
                    def21 = "The sensor that works on principle of magnetic effect is called Hall Effect sensor. Magnetic field is the input and electrical signal is the output. External magnetic field is applied to activate Hall Effect sensor. All magnets have two important characteristics namely Flux density and polarity. Magnetic flux density is always present around the object. Therefore, the Hall Effect sensor output will be function of the flux density.";
                }

                if(position == 7){
                    def21 = "A pressure sensor is a device or instrument which is able to measure the pressure in gases or liquids. A pressure sensor consists of a pressure-sensitive element which can determine the pressure being applied and components to convert the information into an output signal.";
                }

                tvt212.setText(def21);
                tvt212.setVisibility(View.VISIBLE);
            }
        });
    }
}