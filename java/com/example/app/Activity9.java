package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity9 extends AppCompatActivity {

    TextView tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        tv9 = findViewById(R.id.tv9);

        String name = getIntent().getStringExtra("name");
        tv9.setText("Properties of " + name + "\n" + "\n 1. The working of an integrated circuit is similar to an amplifier, timer, microprocessor, oscillator, and also computer memory. An IC is made up of silicon and it is a small wafer that includes thousands of components like resistors, transistors, capacitors, etc." + "\n" + "\n 2. All integrated circuits are polarized where each pin of this IC is unique in both function & location that means, the package has to include some technique to communicate. Most of the ICs will utilize either a dot or a notch to specify which pin is the primary pin." + "\n" + "\n 3. The small size of IC’s causes lesser power consumption and lesser power loss." + "\n" + "\n 4. As all the components are fabricated very close to each other in an IC, they are highly suitable for small signal operation, as there won’t be any stray electrical pickup and there won't be any external projections.");
    }
}