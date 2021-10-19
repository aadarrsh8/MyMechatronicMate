package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT51 extends AppCompatActivity {

    TextView tvt511, tvt512;
    ListView lv51;
    ArrayList<String> arr51;
    ArrayAdapter<String> adap51;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t51);

        tvt511 = findViewById(R.id.tvt511);
        tvt512 = findViewById(R.id.tvt512);
        lv51 = findViewById(R.id.lv51);

        tvt511.setText("Based on Voltage Level");
        tvt512.setVisibility(View.GONE);

        arr51 = new ArrayList<String>();

        arr51.add("Step-Down Transformer");
        arr51.add("Step-Up Transformer");
        arr51.add("Isolation Transformer");

        adap51 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr51);

        lv51.setAdapter(adap51);

        lv51.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def51 = new String();

                if (position == 0){
                    def51 = "A step-down transformer converts the primary voltage level to a lower voltage across the secondary output. This is achieved by the ratio of primary and secondary windings. For step-down transformers the number of windings is higher across the primary side than the secondary side. Therefore, the overall winding ratio of primary and secondary always remains more than 1. In electronics, many applications run on 5V, 6V, 9V, 12V, 24V or in some cases 48V. To convert the single phase power outlet voltage 230V AC to the desired low voltage level, Step Down transformers are required. In instrumentation as well as in many electrical types of equipment, Step-Down transformer is the primary requirement for the Power section. They are also used in power adapters and cell phone charger circuits. In electrical, step down transformers are used in electrical distribution system which works on very high voltage to ensure low loss and cost-effective solution for long distance power delivery requirements. To convert the high voltage to a low voltage supply line, Step down transformer is used.";
                }

                if (position == 1){
                    def51 = "Step up transformer increase the low primary voltage to a high secondary voltage. Again it is achieved by the ratio of primary and secondary winding ratio. For the Step Up transformer, the ratio of the primary winding and the Secondary winding remains less than 1. That means the number turns in secondary winding is higher than the primary winding. In electronics, step up transformers often used in stabilizers, inverters etc where low voltage is converted to a much higher voltage. A step-up transformer is also used in Electrical power distribution. High voltage is required for power distribution related application. Step up transformer is used in the grid to step up the voltage level before the distribution.";
                }

                if (position == 2){
                    def51 = "Isolation transformer does not convert any voltage levels. The Primary voltage and the secondary voltage of an isolation transformer always remain the same. This is because the primary and the secondary winding ratio is always equal to the 1. That means the number of turns in primary and secondary winding is same in isolation transformer. The isolation transformer is used to isolate the primary and secondary. As discussed previously, the transformer does not have any electrical connections between primary and secondary, it is also used as an isolation barrier where the conduction happens only with the magnetic flux. It is used for safety purpose and to cancel noise transfer from primary to secondary or vice-versa.";
                }

                tvt512.setText(def51);
                tvt512.setVisibility(View.VISIBLE);
            }
        });
    }
}