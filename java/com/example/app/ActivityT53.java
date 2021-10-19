package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityT53 extends AppCompatActivity {

    TextView tvt531, tvt532;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t53);

        tvt531 = findViewById(R.id.tvt531);
        tvt532 = findViewById(R.id.tvt532);

        tvt531.setText("Based on Windinng Arrangement");
        tvt532.setText("Auto-Winding Transformer" + "\n" + "\n In the case of an auto-winding transformer, the primary and the secondary coil can be connected in series and the center tapped node is movable. Depending on the center tapped position, the secondary voltage can be varied. The auto is not the short form of Automatic; rather it is to notify the self or single coil. This coil forms a ratio which consists of two parts, primary and secondary. The position of the center tap node determines the primary and secondary ratio thus varying the output voltage. The most common use is the VARIAC, an instrument to produce variable AC from a steady AC input. It is also used in Power transmission and distribution related applications where the high voltage lines are needed to be changed frequently.");
    }
}