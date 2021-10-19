package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT1 extends AppCompatActivity {

    ListView lv1;
    ArrayList<String> arr1;
    ArrayAdapter<String> adap1;
    TextView tvt1, tvt11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);

        tvt1 = findViewById(R.id.tvt1);
        tvt11 = findViewById(R.id.tvt11);
        lv1 = findViewById(R.id.lv1);

        tvt11.setVisibility(View.GONE);

        tvt1.setText("Types of Actuators");

        arr1 = new ArrayList<String>();

        arr1.add("Hydraulic");
        arr1.add("Pneumatic");
        arr1.add("Electric");
        arr1.add("Thermal or Magnetic");
        arr1.add("Mechanical");

        adap1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr1);

        lv1.setAdapter(adap1);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def1 = new String();


                if(position == 0){
                    def1 = "Hydraulic actuators have a cylinder or fluid motor that uses hydraulic power to generate mechanical motion, which in turn leads to linear, rotatory or oscillatory motion. Given the fact that liquids are nearly impossible to compress, a hydraulic actuator can exert a large force. When the fluid enters the lower chamber of the actuator’s hydraulic cylinder, pressure inside increases and exerts a force on the bottom of the piston, also inside the cylinder. The pressure causes the sliding piston to move in a direction opposite to the force caused by the spring in the upper chamber, making the piston move upward and opening the valve. The downside with these actuators is the need for many complementary parts and possibility of fluid leakage.";}

                if(position == 1){
                    def1 = "Pneumatic actuators convert energy in the form of compressed air into mechanical motion. Here pressurised gas or compressed air enters a chamber thus building up the pressure inside. Once this pressure goes above the required pressure levels in contrast to the atmospheric pressure outside the chamber, it makes the piston or gear move kinetically in a controlled manner, thus leading to a straight or circular mechanical motion. Examples include pneumatic cylinders, air cylinders, and air actuators. Cheaper and often more powerful than other actuators, they can quickly start or stop as no power source has to be stored in reserve for operation. Often used with valves to control the flow of air through the valve, these actuators generate considerable force through relatively small pressure changes.";}

                if(position == 2){
                    def1 = "An electric actuator is a mechanical device used to convert electricity into kinetic energy in either a single linear or rotary motion. It automates damper or valve in order to increase process efficiency and complexity. Designs for electric actuators are based on the specific tasks they accomplish within the processes for which they’re intended, and they can vary in both dimension and size.";}

                if (position == 3){
                    def1 = "Thermal or magnetic actuators usually consist of shape memory alloys that can be heated to produce movement. The motion of thermal or magnetic actuators often comes from the Joule effect, but it can also occur when a coil is placed in a static magnetic field. The magnetic field causes constant motion called the Laplace-Lorentz force. Most thermal actuators can produce a wide and powerful range of motion while remaining lightweight.";
                }

                if (position == 4){
                    def1 = "A mechanical actuator functions to execute movement by converting one kind of motion, such as rotary motion, into another kind, such as linear motion. An example is a rack and pinion. The operation of mechanical actuators is based on combinations of structural components, such as gears and rails, or pulleys and chains.";
                }

                tvt11.setText(def1);
                tvt11.setVisibility(View.VISIBLE);
            }


        });


    }
}