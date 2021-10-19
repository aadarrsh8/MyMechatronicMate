package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        tv4 = findViewById(R.id.tv4);

        String name = getIntent().getStringExtra("name");
        tv4.setText("Properties of a " + name + "\n" + "\n 1.The working voltage is an important capacitor characteristic that defines the maximum continuous voltage either DC or AC that can be applied to the capacitor without failure during its working life." + "\n" + "\n 2. Capacitors also have a tolerance rating expressed as a plus-or-minus value either in picofarad’s (±pF) for low value capacitors generally less than 100pF or as a percentage (±%) for higher value capacitors generally higher than 100pF." + "\n" + "\n a) The tolerance value is the extent to which the actual capacitance is allowed to vary from its nominal value and can range anywhere from -20% to +80%. Thus a 100µF capacitor with a ±20% tolerance could legitimately vary from 80μF to 120μF and still remain within tolerance." + "\n" + "\n 3. The temperature coefficient of a capacitor is the maximum change in its capacitance over a specified temperature range. The temperature coefficient of a capacitor is generally expressed linearly as parts per million per degree centigrade (PPM/oC), or as a percent change over a particular range of temperatures." + "\n" + "\n 4. The dielectric used inside the capacitor to separate the conductive plates is not a perfect insulator resulting in a very small current flowing or “leaking” through the dielectric due to the influence of the powerful electric fields built up by the charge on the plates when applied to a constant supply voltage. This small DC current flow in the region of nano-amps (nA) is called the capacitors Leakage Current." + "\n" + "\n 4. Changes in temperature around the capacitor affect the value of the capacitance because of changes in the dielectric properties. If the air or surrounding temperature becomes to hot or to cold the capacitance value of the capacitor may change so much as to affect the correct operation of the circuit. The normal working range for most capacitors is -30oC to +125oC with nominal voltage ratings given for a Working Temperature of no more than +70oC especially for the plastic capacitor types." + "\n" +"\n 5. The Temperature Coefficient of a capacitor is the maximum change in its capacitance over a specified temperature range. The temperature coefficient of a capacitor is generally expressed linearly as parts per million per degree centigrade (PPM/oC), or as a percent change over a particular range of temperatures.");
    }
}