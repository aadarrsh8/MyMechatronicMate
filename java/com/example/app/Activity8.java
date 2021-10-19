package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity8 extends AppCompatActivity {

    TextView tv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        tv8 = findViewById(R.id.tv8);

        String name = getIntent().getStringExtra("name");
        tv8.setText("Properties of " + name + "\n" + "\n 1. The isolator is a mechanical switch which isolates a part of the circuit from the system as when required. It separates a part of the system from rest for safe maintenance works." + "\n" + "\n 2. Isolators are used to open a circuit under no load. Its main purpose is to isolate one portion of the circuit from the other and is not intended to be opened while current is flowing in the line." + "\n" + "\n 3. Isolators are generally used on both ends of the breaker so that repair or replacement of circuit breaker can be done without any danger." + "\n" + "\n 4. Oscillators are usually housed in metal, ceramic, or plastic packages. They come in a variety of industry-standard package dimensions. The pad (pin) arrangements may vary among vendors, but the overall x-y dimensions are standardized." + "\n" + "\n 5. Electrical isolators play a key role within a transmission line like insulators isolate the transmission line from the conductor. Here, isolators are mainly useful to eliminate grounding loops like lowering the hazard of accidental lanes for the flow of current towards the ground." + "\n" + "\n 6. When a fault occurs in a substation, the isolator cuts out a portion of a substation. The other apparatus works without any intrusion.");
    }
}

