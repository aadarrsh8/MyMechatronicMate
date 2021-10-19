package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv2 = findViewById(R.id.tv2);

        String name = getIntent().getStringExtra("name");
        tv2.setText("Properties of a " + name + " " + "\n" + "\n 1. Sensor is a device that converts physical phenomenon into an electrical output." + "\n" + "\n 2. The sensitivity is defined in terms of the relationship between input physical signal and output electrical signal." + "\n" + "\n a) Sensitivity is the change in output for a given change in input." + "\n" + "\n 3. Every sensor has an ability to detect signal fluctuation. The minimum signal fluctuation detected by a sensor is called its resolution." + "\n" + "\n 4. Range is the minimum and maximum value of physical variable that the sensor can sense or measure." + "\n" + "\n 5. Span is the difference between the maximum and minimum values of input." + "\n" + "\n 6. Linearity is the maximum deviation between the measured values of a sensor from ideal curve." + "\n" + "\n 7. Reproducibility is defined as the ability of sensor to produce the same output when same input is applied.");


    }
}