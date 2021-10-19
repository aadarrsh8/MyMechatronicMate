package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity10 extends AppCompatActivity {

    TextView tv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        tv10 = findViewById(R.id.tv10);
        tv10.setMovementMethod(new ScrollingMovementMethod());

        String name = getIntent().getStringExtra("name");
        tv10.setText("Properties of " + name + "\n" + "\n 1. Transistor characteristics are the plots which represent the relationships between the current and the voltages of a transistor in a particular configuration. They are of 3 types:- " + "\n" + "\n a) Input Characteristics: These describe the changes in input current with the variation in the values of input voltage keeping the output voltage constant." + "\n" + "\n b) Output Characteristics: This is a plot of output current versus output voltage with constant input current." + "\n" + "\n c) Current Transfer Characteristics: This characteristic curve shows the variation of output current in accordance with the input current, keeping output voltage constant." + "\n" + "\n 2. Common Base (CB) Configuration:- In CB configuration, the base terminal of the transistor will be common between the input and the output terminals and this configuration offers low input impedance, high output impedance, high resistance gain and high voltage gain." + "\n" + "\n 3. Common Collector (CC) Configuration:- This configuration has the collector terminal of the transistor common between the input and the output terminals and is also referred to as emitter follower configuration. This offers high input impedance, low output impedance, voltage gain less than one and a large current gain." + "\n" + "\n 4. Common Emitter (CE) Configuration:- In this configuration, the emitter terminal is common between the input and the output terminals and this configuration offers medium input impedance, medium output impedance, medium current gain and voltage gain.");
    }
}