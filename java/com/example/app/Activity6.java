package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {

    TextView tv6;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        tv6 = findViewById(R.id.tv6);

        String name = getIntent().getStringExtra("name");
        tv6.setText("Properties of " + name + "\n" + "\n 1. The value of inductance that the inductor is supposed to offer at a particular frequency and voltage is called nominal inductance and it is generally expressed in Microhenry, Millihenry, or Henry." + "\n" + "\n 2. Inductance like capacitance is a dynamic property. It can change with the frequency of the signal, temperature, and current. It is, therefore, always important to consider the inductive tolerance of an inductor. The tolerance is the maximum variation in the value of inductance under all possible test conditions." + "\n" + "\n 3. The inductors using ferromagnetic cores beyond a critical current level show a drop in inductance. This current level is indicated as saturation current. A large current beyond saturation current can damage or fracture an inductor’s core so it is essential to note the saturation current rating of an inductor." + "\n" + "\n 4. As the current increases beyond the saturation level, the core of the inductors heats up. It can get damaged or fractured, leading to loss of its magnetic properties when it gets hot enough. The temperature of the core beyond which the inductor loses its magnetic properties is called curie temperature." + "\n" + "\n 5. Saturation magnetic flux density is the maximum flux density of the core of the inductor. This property is important in determining the maximum magnetic energy that an inductor can store at any time.");
    }
}