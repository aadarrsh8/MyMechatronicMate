package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT541 extends AppCompatActivity {

    TextView tvt5411, tvt5412;
    ListView lv5411;
    ArrayList<String> arr5411;
    ArrayAdapter<String> adap5411;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t541);

        tvt5411 = findViewById(R.id.tvt5411);
        tvt5412 = findViewById(R.id.tvt5412);
        lv5411 = findViewById(R.id.lv5411);

        tvt5411.setText("Transformers in Power Domain");
        tvt5412.setVisibility(View.GONE);

        arr5411 = new ArrayList<String>();

        arr5411.add("Power Transformer");
        arr5411.add("Measurement Transformer");
        arr5411.add("Distribution Transformer");

        adap5411 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr5411);

        lv5411.setAdapter(adap5411);

        lv5411.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def5411 = new String();

                if(position == 0){
                    def5411 = "Power Transformers are larger in size and used to transfer the energy to the substation or the public electricity supply. This transformer acts as a bridge between the power generator and the primary distribution grid. Depending on the Power rating and specification, Power transformers can further be classified into three categories: Small power transformer, Medium Power transformers, and the Large power transformers. The rating can be more than 30KVA to the 500-700KVA or in some cases that can be equal to or more than 7000KVA for small rated power transformer. The medium rated power transformer can be up to 50-100 MVA whereas large rated power transformers are capable to handle more than 100MVA. Due to very high power generation, the construction of a power transformer is also critical. The construction includes solid insulating peripherals and well balanced cooling system. The most common power transformers are filled with oils. The main principle of the power transformer is to convert the Low voltage high current to a high voltage low current. This is required to minimize the power loss in the power distribution system. Another important parameter for the Power transformer is the phase availability. Typically Power transformers works in three phase system, but in some cases, Single phase small power transformers are also used. Three Phase Power transformers are the most costly and efficient than the single phase power transformers.";
                }

                if(position == 1){
                    def5411 = "Measurement transformer is often referred to as an instrument transformer. This is another commonly used measurement instrument in the power domain. A measurement transformer is used to isolate the main power and convert the current and voltage in a smaller ratio to its secondary output. By measuring the output, the Phase, Current and Voltage of the actual power line can be measured.";
                }

                if(position == 2){
                    def5411 = "This is used in the last phase of the power distribution system. Distribution transformers are step down transformer, which converts High grid voltage to the end customer required voltage, 110V or 230V. It can also be single phase or three phases. Distribution transformers can be smaller in shape as well as bigger, depending on the conversion capacity or ratings. Distribution transformers can be further categorized into based on the type of insulation it uses. It can be a dry type or can be liquid-immersed. It is made using laminated steel plates mostly constructed in C shape as a core material. Distribution transformer also has a different type of classification based on the location it is used. The transformer can be mounted on a utility pole, if so, it is called a pole mounted distribution transformers. It can be placed inside of an underground chamber, mounted on a concrete pad (pad mounted distribution transformer) or inside an enclosed steel box.";
                }

                tvt5412.setText(def5411);
                tvt5412.setVisibility(View.VISIBLE);
            }
        });
    }
}