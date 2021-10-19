package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity11 extends AppCompatActivity {

    TextView tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        tv11 = findViewById(R.id.tv11);
        String name = getIntent().getStringExtra("name");

        tv11.setText("Properties of " + name + "\n" + "\n 1. Rectifiers allow the flow of current in only one direction." + "\n" + "\n 2. In thе fоrwаrd direction, а small voltage iѕ required aсrosѕ thе diode bеfоre іt conducts - thе turn оn voltage. Thе actual voltage depends оn thе type оf rectifier diode аnd thе material used." + "\n" + "\n 3. In thе reverse direction, thе diode rectifier wіll ultimately break down. Thе breakdown voltage іѕ nоrmallу wеll іn excess оf thе turn оn voltage." + "\n" + "\n 3. Ripple Factor:- Ripple factor is a measure of effectiveness of a rectifier circuit. It is defined as the ratio of RMS value of the AC component (ripple component) Irrms in the output waveform to the DC component VDC in the output waveform." + "\n" + "\n 4. The efficiency is defined as the ratio of input AC to the output DC." + "\n" + "\n 5. Peak Inverse Voltage is defined as the maximum voltage that a diode can with stand in reverse bias. During the reverse bias as the diode do not conduct total voltage drops across the diode. Thus peak inverse voltage is equal to the input voltage Vs." + "\n" + "\n 6. The Transformer Utilisation Factor (TUF) is defined as the ratio of DC power is delivered to the load and the AC rating of the transformer secondary. Half wave rectifier has around 0.287 and full wave rectifier has around 0.693.");
    }
}