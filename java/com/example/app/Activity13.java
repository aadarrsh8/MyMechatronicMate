package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity13 extends AppCompatActivity {

    TextView tv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        tv13 = findViewById(R.id.tv13);
        String name = getIntent().getStringExtra("name");

        tv13.setText("Properties of " + name + "\n" + "\n 1. A motor will give out more power if its electric circuit is worked harder (i.e. if the current is allowed to increase). The limiting factor is normally the allowable temperature rise of the windings, which depends on the class of insulation. This implies that keeping any one amongst number of insulation windings or the cooling constant and varying the other parameter, the output of motor can be increased." + "\n" + "\n 2. Output power per unit volume is directly proportional to speed. Low-speed motors are unattractive because they are large, and therefore expensive. It is usually much better to use a high-speed motor with a mechanical speed reduction." + "\n" + "\n 3. In large motors the specific electric loading is normally much higher than in small ones, and the specific magnetic loading is somewhat higher. These two factors combine to give the higher specific torque." + "\n" + "\n 4. The efficiency of a motor improves with speed. For a given torque, power output rises in direct proportion to speed, while electrical losses are constant. ");
    }
}