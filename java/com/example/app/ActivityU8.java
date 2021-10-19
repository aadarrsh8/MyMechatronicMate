package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU8 extends AppCompatActivity {

    TextView tvu81, tvu82;
    ListView lvu8;
    ArrayList<String> arru8;
    ArrayAdapter<String> adapu8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u8);

        tvu81 = findViewById(R.id.tvu81);
        tvu82 = findViewById(R.id.tvu82);
        lvu8 = findViewById(R.id.lvu8);

        tvu81.setText("Uses of Isolators");
        tvu82.setVisibility(View.GONE);

        arru8 = new ArrayList<String>();

        arru8.add("Earthing Switches");
        arru8.add("Air Conditioners");
        arru8.add("Microwaves");
        arru8.add("Extractor Fans");
        arru8.add("Refrigerators");

        adapu8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru8);
        lvu8.setAdapter(adapu8);

        lvu8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Earthing switches are mounted on the base of line side isolator. Earthing switches are usually vertically broken switches. Earthing arms (contact arm of earthing switch) usually are aligned horizontally at off condition during switching on the operation, these earthing arms rotate and move to vertical position and make contact with earth female contacts fitted at the top of the post insulator stack of the isolator at its outgoing side. The earthing arms are so interlocked with the main isolator moving contacts that it can be closed only when the primary contacts of the isolator are in open position. Similarly, the main isolator contacts can be closed only when the earthing arms are in open position.";
                }

                if(position == 1){
                    def = "To guarantee safety and reduce the risk of electrical problems, isolators are installed onto the outdoor units of air conditioners. This allows owners to disconnect the unit whenever needed to protect it from risky situations such as thunderstorms or lightning strikes. Additionally, isolators are also designed and used to prevent home safety switches from tripping repeatedly in the case of a faulty air conditioning system. The isolator disconnects the power supply from the unit the minute it runs into any unusual electrical fault or malfunction.";
                }

                if(position == 2){
                    def = "Isolator at microwave level is a two-port device that permits transmission of microwave power in only one direction. It is specifically useful for protecting input and output equipment from affecting each other. Isolatorsplay a crucial role in minimizing the interference between incident and reflected waves, and they also allow a constant impedance at transmitter which in turnmaximizers the power transfer.";
                }

                if(position == 3){
                    def = "Extractor fans are regularly found in bathrooms or kitchens and work to remove stale and humid air which is then replaced with fresh air. Also, due to building regulations more and more homeowners need extractor fans. Due to the sophistication of these machines and the power they possess, they need isolation switches for repairs or maintenance. For this reason, fans generally make use of 3-pole isolation switches because there are three lines that usually need disconnection to completely isolate the fan. If an isolator switch isn’t installed, maintenance requires shutting down a large swath of circuits which could affect other appliances.";
                }

                if(position == 4){
                    def = "Refrigerators, especially large ones, need an isolation switch to ease the challenges associated with maintenance and repairs. Just like with showers, refrigerators are in close proximity to water and could be dangerous if not handled properly. Also, most freezers or refrigerators have sockets that are hard to reach which means you’ll have to touch or move the appliance; which could be dangerous if it develops a fault. This is why an isolator switch is required.";
                }

                tvu82.setText(def);
                tvu82.setVisibility(View.VISIBLE);
            }
        });
    }
}