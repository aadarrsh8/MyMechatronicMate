package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT8 extends AppCompatActivity {

    TextView tvt81, tvt82;
    ListView lvt8;
    ArrayList<String> arr8;
    ArrayAdapter<String> adap8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t8);

        tvt81 = findViewById(R.id.tvt81);
        tvt82 = findViewById(R.id.tvt82);
        lvt8 = findViewById(R.id.lvt8);

        arr8 = new ArrayList<String>();

        tvt81.setText("Types of Isolators");
        tvt82.setVisibility(View.GONE);

        arr8.add("Single Break-Type Isolator");
        arr8.add("Double Break Isolator");
        arr8.add("Pantograph Isolator");

        adap8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr8);

        lvt8.setAdapter(adap8);

        lvt8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "In this type of isolator, arm contact is separated into two elements. The first arm contact holds male contact, as well as second arm contact, holds female contact. The arm contact shifts because of the post insulator rotation upon which the arm contacts are fixed. The post insulators’ rotation stacks in reverse to each other which makes to shut the isolator by shutting the arm contact. Post insulators counter-rotation stacks to open the arm contact, as well as an isolator, rotate into an off condition. Generally, the motor-operated isolator is used however an emergency manual operated isolator is also offered.";
                }

                if(position == 1){
                    def = "This type of isolator consists of three loads of post insulators. The middle insulator holds a flat male or tubular contact that can be turned straightly by a spin of the middle post insulator. The rotation of the middle post insulator can be done by a lever method at the bottom of the post insulator, as well as it is related to manual operation (operating handle) or motorized operation motor (using motor) of the isolator via a mechanical knot rod.";
                }

                if(position == 2){
                    def = "The pantograph type isolator allows current switchgear installation and requires minimal space. This type of insulator includes a post insulator as well as an operating insulator.";
                }

                tvt82.setText(def);
                tvt82.setVisibility(View.VISIBLE);
            }
        });


    }
}