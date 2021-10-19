package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity12 extends AppCompatActivity {

    TextView tv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);

        tv12 = findViewById(R.id.tv12);
        String name = getIntent().getStringExtra("name");

        tv12.setText("Properties of " + name + "\n" + "\n 1. Filter alters the relative amplitudes of the various frequency components and the phase characteristics and its gain depends entirely on the signal frequency." + "\n" + "\n 2. A filter is defined by their frequency-domain effects on signals, which is often described mathematically in terms of its transfer function and it is expressed in the ratio of the Laplace Transforms of its output and input signals." + "\n" + "\n 3. The frequency band that includes the passed components is called the passband, and the band that includes the attenuated components is called the stop band. The filtering properties of an electric filter are quantitatively described by the magnitude of attenuation contributed by the filter relative to the components of the spectrum of electric oscillations. The greater difference in attenuation between the stop band and the passband, the higher the filtering capacity. ");
    }
}