package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT52 extends AppCompatActivity {

    TextView tvt521, tvt522;
    ListView lv52;
    ArrayList<String> arr52;
    ArrayAdapter<String> adap52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t52);

        tvt521 = findViewById(R.id.tvt521);
        tvt522 = findViewById(R.id.tvt522);
        lv52 = findViewById(R.id.lv52);

        tvt521.setText("Based on Core Material");
        tvt522.setVisibility(View.GONE);

        arr52 = new ArrayList<String>();

        arr52.add("Iron Core Transformer");
        arr52.add("Ferrite Core Transformer");
        arr52.add("Toroidal Core Transformer");
        arr52.add("Air Core Transformer");

        adap52 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr52);

        lv52.setAdapter(adap52);

        lv52.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def52 = new String();

                if(position == 0){
                    def52 = "Iron core transformer uses multiple soft iron plates as the core material. Due to the excellent magnetic properties of iron, the flux linkage of the iron core transformer is very high. Thus, the efficiency of the iron core transformer is also high. The soft iron core plates can be available in multiple shapes and sizes. The coils of the primary and secondary wound or wrapped on a coil former. After that, the coil former is mounted in soft iron core plates. Depending on the core size and shapes, a different type of core plates is available in the market. Few common shapes are E, I, U, L, etc. The iron plates are thin, and multiple plates are bunched together to form the actual core. For example, E type cores are made with thin plates with a look of letter E. Iron core transformers are widely used and usually heavier in weight and shape.";
                }

                if (position == 1){
                    def52 = "A ferrite core transformer uses a ferrite core due to high magnetic permeability. This type of transformer offers very low losses in the high-frequency application. Due to this, ferrite core transformers are used in high-frequency application such as in switch mode power supply (SMPS), RF related applications, etc. Ferrite core transformers also offer a different type of shapes, sizes depending on the application requirement. It is mainly used in electronics rather than electrical application. The most common shape in the ferrite core transformer is E core.";
                }

                if (position == 2){
                    def52 = "Toroidal core transformer uses toroid shaped core material, such as iron core or ferrite core. Toroids are ring or donut shaped core material and widely used for superior electrical performance. Due to the ring shape, the leakage inductance is very low and offers very high inductance and Q factors. The windings are relatively short and weight is much less than traditional, same rating transformers.";
                }

                if(position == 3){
                    def52 = "Air Core transformer does not use any physical magnetic core as the core material. The flux linkage of the air-core transformer is made entirely using the air. In air core transformer, the primary coil is supplied with alternating current which produces an electromagnetic field around it. When a secondary coil is placed inside the magnetic field, as per the Faraday law of induction, the secondary coil is induced with a magnetic field which further is used to power the load. However, air core transformer produces low mutual inductance compared to physical core material such as iron or ferrite core.";
                }

                tvt522.setText(def52);
                tvt522.setVisibility(View.VISIBLE);
            }
        });
    }
}