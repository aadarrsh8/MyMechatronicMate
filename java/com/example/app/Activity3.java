package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        tv3 = findViewById(R.id.tv3);
        String name = getIntent().getStringExtra("name");
        tv3.setText("Properties of a " + name + " " + "\n" + "\n 1. Resistor is bilateral in nature. This means that a resistor can carry current in both directions." + "\n" + "\n 2. It is linear in nature. An element is said to be linear if there exists a linear relationship between voltage and current across the element. This means that with an increase in voltage-current also increases linearly." + "\n" + "\n 3. It is passive in nature. Resistor can’t store energy neither it can be a source on its own. Resistor always dissipates energy in the form of heat." + "\n" + "\n 4. The power rating indicates the maximum dissipation that the component is capable of. The rated dissipation is normally specified at room temperature and decreases at higher temperatures. This is called derating. Typically from 70°C derating is specified. Above this temperature, it can only utilize a reduced power level." + "\n" + "\n 5. For some resistors it is important to have low noise properties. Noise properties are mainly dependent on 3 parameters: resistance, temperature and bandwidth." + "\n" + "\n 6. For applications in very hot and humid climates, the resistor is enclosed in an airtight metal case. If the complete body is covered for example with enamel paint, special care has to be taken that all expansion coefficients are approximately equal. If this is not the case, the enamel layer might burst after the baking process.");
    }
}