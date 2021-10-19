package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU1 extends AppCompatActivity {

    TextView tvu11, tvu12;
    ListView lvu1;
    ArrayList<String> arru1;
    ArrayAdapter<String> adapu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u1);

        tvu11 = findViewById(R.id.tvu11);
        tvu12 = findViewById(R.id.tvu12);
        lvu1 = findViewById(R.id.lvu1);

        tvu11.setText("Uses of Actuators");
        tvu12.setVisibility(View.GONE);

        arru1 = new ArrayList<String>();

        arru1.add("Material Handling");
        arru1.add("Robotics");
        arru1.add("Solar Panel Operation");
        arru1.add("Agricultural Machinery");
        arru1.add("Cutting Experiments");
        arru1.add("Valve Operations");

        adapu1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru1);
        lvu1.setAdapter(adapu1);

        lvu1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "The many uses for an actuator have improved automation in the workplace. It streamlines manufacturing while lowering the cost of production. The electric actuators have transformed into a vital and necessary tool to achieve optimal material handling." + "\n" + "\n Actuators are responsible for moving loads from point A to point B. The electromechanical version has the added ability to stop the movement mid-stroke. Some of the other types of actuators in material handling include industrial, high-speed, and micro models." + "\n" + "\n They enable safe, secure, and precise motion, primarily when operators use them in conjunction with sensors or other smart technologies. The combination allows workers to complete previously repetitive tasks with minimal manual intervention." + "\n" + "\n Some of the visible applications include sorting machines, feed systems, and clamps. One example is using pneumatic actuators along with conveyor belts. An electric actuator provides greater efficiency because it doesn’t slow down the control capabilities.";
                }

                if(position == 1){
                    def = "Actuators make movement possible in robots. They allow robotic machinery to interact with its environment through wheels, clamps, arms, and legs." + "\n" + "\n For example a robotic arm has a gripper on the end. When the operator presses a button, a sensor communicates to the arm to clasp the box in position A. The clamp secures the package and moves it to position B, before releasing the box onto the conveyor belt or desired work surface." + "\n" + "\n The gripping mechanism works because of the actuator. It talks to the smart technology when the clamp reaches the appropriate constraints and maintains it, so the package doesn’t drop or shift during transit. A mechanical actuator presents a more consistent and reliable option than a hydraulic actuator, which uses hydraulic fluid for movement and control.";
                }

                if(position == 2){
                    def = "The push for alternative energy sources has coincided with an uptick in solar panel usage. Conventional panels use hydraulics or other similar devices, but recent innovations have made harnessing the sun’s power more efficient. Electric actuators give panels the ability to track the sun, moving with the sunlight to maximize the amount of direct absorption." + "\n" + "\n Installing actuators provides solar panel users the most bang for their buck. The useful machines absorb more solar energy while withstanding the hot and harsh working environment. They can even withstand high-pressure jets, debris, and dust.";
                }

                if(position == 3){
                    def = "Modern agricultural machinery has never been more reliable, in part, because of actuators. They assist farmers, workers, and other laborers in completing various agricultural tasks, on top of withstanding harsh weather conditions and exposure to herbicides, pesticides, and fertilizers." + "\n" + "\n Ground zero for actuators is in the fields. They give operators control for the height and angle of sprayers for thorough and consistent coverage. Actuators can aid in opening and closing hatches while simplifying the mechanisms to operate machinery." + "\n" + "\n Actuators exist inside tractors to improve work quality and reduce labor. An actuator ensures accurate steering wheel adjustments, toggles ventilation, and adjusts the rearview windows into the correct operating position. The straightforward integrations mean operators increase control of their tractors without sacrificing performance." + "\n" + "\n Many of these same mechanisms apply to seed drills and combine harvesters. Drills require pinpoint accuracy when planting seeds, so farmers can improve land usage and minimize waste. Combine harvesters benefit from seamless functionality through the integration of linear actuators in grain tank extensions, grain tank covers, and concave adjustments.";
                }

                if(position == 4){
                    def = "Machines spare humans from as much danger as possible when cutting. They take over repetitive tasks or risky assignments that require more endurance and power than creative prowess. Actuators power these machines to ensure accurate cuts with every slice." + "\n" + "\n Common uses for a large actuator include wood, glass, metal, and paper cutting devices. The blade can cut straight lines or jigsaw patterns, based on the actuator’s configuration. The same applies to metal cutting, which requires copious mechanical strength." + "\n" + "\n Cleanliness stands out as one of the overlooked benefits of actuators in a cutting environment. Many people associate the desire for automated sanitation with food and beverage processing. The crisp cuts reduce the amount of debris and waste that can otherwise interfere with production.";
                }

                if(position == 5){
                    def = "Today’s industry would not be possible without valve actuators turning electric, pneumatic, and hydraulic energy into a push and pull motion. The cost-effective product offers an attractive alternative to manual operation. It operates with a range of rising stem valves with optional features for integrated control." + "\n" + "\n The two primary models are diaphragm and piston actuators. The diaphragm version contains a section of rubber than encircles the edges of a cylinder or chamber. A connective rod at the center of the diaphragm moves whenever the device receives pressure, making it ideal for a low-pressure environment." + "\n" + "\n Piston actuators contain a piston that moves along the cylinder’s body. The rod translates force on the piston to the valve, which leads to opening and closing. Piston actuators can withstand higher pressure workloads, travel further, and have more substantial thrust than diaphragm actuators.";
                }

                tvu12.setText(def);
                tvu12.setVisibility(View.VISIBLE);
            }
        });
    }
}