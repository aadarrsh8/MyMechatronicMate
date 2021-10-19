package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        tv1 = findViewById(R.id.tv1);

        String name = getIntent().getStringExtra("name");
        tv1.setText("Properties of an " + name + "\n" + "\n 1. Actuators are a component of a machine that helps carry out the moving and controlling of a mechanism or system." + "\n" + "\n 2. Actuators basically need a control signal and a source of energy. Upon receiving a control signal, the actuator uses energy from the source to bring about a mechanical motion." + "\n" + "\n 3. An actuator can move an object in a linear motion or in a rotatory motion." + "\n" + "\n 4. When considering force in actuators for applications, two main metrics should be considered. These two are static and dynamic loads. Static load is the force capability of the actuator while not in motion. Conversely, the dynamic load of the actuator is the force capability while in motion." + "\n" + "\n 5. Speed is considered primarily at a no-load pace, since the speed will invariably decrease as the load amount increases. The rate the speed will decrease will directly correlate with the amount of force and the initial speed." + "\n" + "\n 6. Actuators are commonly rated using the standard IP Code rating system. Those that are rated for dangerous environments will have a higher IP rating than those for personal or common industrial use.");
    }
}