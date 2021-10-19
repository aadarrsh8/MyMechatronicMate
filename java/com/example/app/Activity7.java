package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    TextView tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        tv7 = findViewById(R.id.tv7);

        String name = getIntent().getStringExtra("name");
        tv7.setText("Properties of " + name + "\n" + "\n 1. The repetition rate (cycle) of the signal output from the oscillator is called it's frequency and is measured in Hertz (Hz) per second." + "\n" + "\n 2. Frequency stability is a fundamental performance specification for oscillators which represents the deviation of output frequency due to external conditions and is expressed in parts per million (ppm) or parts per billion (ppb)." + "\n" + "\n 3. Supply voltage, specified in volts (V), is the input power required to operate the oscillator. Supply voltage powers the oscillator through the VDD pin and is sometimes referred to as VDD." +"\n" + "\n 4. Supply current is the maximum operating current of an oscillator. It is measured in microamps (µA) or milliamps (mA) at the maximum and sometimes nominal supply voltage." + "\n" + "\n 5. Phase noise and its time-domain counterpart, jitter, are often considered the most important characteristics of an oscillator after frequency stability. Phase noise and jitter have a direct impact on system performance, affecting such parameters as bit-error-ratio (BER) in serial data systems. Phase noise and jitter are two methods for quantifying noise on a clock signal. Phase noise measures clock noise in the frequency domain; jitter measures the noise impact on the clock in the time domain." + "\n" + "\n 6. Oscillators are usually housed in metal, ceramic, or plastic packages. They come in a variety of industry-standard package dimensions. The pad (pin) arrangements may vary among vendors, but the overall x-y dimensions are standardized.");

    }
}