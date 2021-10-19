package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity14 extends AppCompatActivity {

    TextView tv14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);

        tv14 = findViewById(R.id.tv14);
        String name = getIntent().getStringExtra("name");

        tv14.setText("Properties of " + name + "\n" + "\n  1. Switches are the binary devices so they can be either completely off or completely on or in other words we can say that a switch is an electronic device which is used to break or make the electronic circuit automatically or manually." + "\n" + "\n 2. A switch that is operated by another electrical circuit is called a relay." + "\n" +"\n 3. A switch may be directly manipulated by a human as a control signal to a system, such as a computer keyboard button, or to control power flow in a circuit, such as a light switch." + "\n" + "\n 4. Switches may be operated by process variables such as pressure, temperature, flow, current, voltage, and force, acting as sensors in a process and used to automatically control a system." + "\n");
    }
}