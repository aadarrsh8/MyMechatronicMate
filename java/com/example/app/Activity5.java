package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    TextView tv5;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        tv5 = findViewById(R.id.tv5);

        String name = getIntent().getStringExtra("name");
        tv5.setText("Properties of " + name + "\n" + "\n 1. The frequency of input and output power is the same." + "\n" + "\n 2. All transformers make use of electromagnetic induction laws." + "\n" + "\n 3. The primary and secondary coils are devoid of electrical connection (except for auto transformers). The transfer of power is through magnetic flux." + "\n" + "\n 4. No moving parts are required to transfer energy, so there are no friction or windage losses as with other electrical devices." + "\n" + "\n 5. The losses that do occur in transformers are smaller than those in other electrical devices, and include:" + "\n" + "\n a) Copper loss (electrical power lost in the heat created by circulation of currents around the copper windings, considered the heaviest loss in transformers)" + "\n" + "\n b) Core loss (eddy current and hysteresis losses, caused by lagging of magnetic molecules in response to the alternating magnetic flux within the core)");
    }
}