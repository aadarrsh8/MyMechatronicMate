package com.example.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etDev;
    Button btnSearch, btnProp, btnTypes, btnUses;
    TextView tv;
    SwipeRefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDev = findViewById(R.id.etDev);
        tv = findViewById(R.id.tv);
        btnSearch = findViewById(R.id.btnSearch);
        btnProp = findViewById(R.id.btnProp);
        btnTypes = findViewById(R.id.btnTypes);
        btnUses = findViewById(R.id.btnUses);
        refreshLayout = findViewById(R.id.refreshLayout);

        tv.setVisibility(View.GONE);

        String [] names = {"Actuator", "Sensor", "Resistor", "Capacitor", "Transformer", "Inductor", "Oscillator",  "Isolator", "Integrated Circuit", "Transistor",  "Filter",  "Rectifier",  "Motor",  "Switch",};

        ArrayAdapter<String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);

        etDev.setThreshold(1);
        etDev.setAdapter(adap);

        ActionBar actionBar = null;
        actionBar = getSupportActionBar();
        actionBar.setTitle("MyMechatronicMate");

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String devName = etDev.getText().toString().trim().toLowerCase();
                String def = null;

                if(devName.isEmpty())
                    Toast.makeText(MainActivity.this, "Please enter the required field.", Toast.LENGTH_SHORT).show();

                if(devName.equalsIgnoreCase("actuator"))
                    def = "An actuator is a part of a device or machine that helps it to achieve physical movements by converting energy, often electrical, air, or hydraulic, into mechanical force.";

                if(devName.equalsIgnoreCase("sensor"))
                   def = " A sensor is a device, module, machine, or subsystem whose purpose is to detect events or changes in its environment and send the information to other electronics, frequently a computer processor.";

                if(devName.equalsIgnoreCase("resistor"))
                    def ="A resistor is a passive 2-terminal electrical component that implements electrical resistance as a circuit element.";

                if(devName.equalsIgnoreCase("capacitor"))
                    def = "The capacitor is a component which has the ability to store energy in the form of an electrical charge producing a potential difference across its plates, much like a small rechargeable battery.";

                if(devName.equalsIgnoreCase("transformer"))
                    def = "A transformer is defined as a passive electrical device that transfers electrical energy from one circuit to another through the process of electromagnetic induction.";

                if(devName.equalsIgnoreCase("inductor"))
                    def ="An inductor, also called a coil, choke, or reactor, is a passive 2-terminal electrical component that stores energy in a magnetic field when electric current flows through it.";

                if(devName.equalsIgnoreCase("oscillator"))
                    def = "An oscillator is an electronic circuit that produces a periodic, oscillating electronic signal, often a sine wave or a square wave or a triangle wave.";

                if(devName.equalsIgnoreCase("isolator"))
                    def = "An isolator is a device used for isolating a circuit or equipment from a source of power.";

                if(devName.equalsIgnoreCase("integrated circuit"))
                    def = "An integrated circuit, or IC, is small chip that can function as an amplifier, oscillator, timer, microprocessor, or even computer memory.";

                if(devName.equalsIgnoreCase("transistor"))
                    def = "A transistor is a semiconductor device used to amplify or switch electronic signals and electrical power.";

                if(devName.equalsIgnoreCase("rectifier"))
                    def = "A rectifier is an electrical device that converts alternating current, which periodically reverses direction, to direct current, which flows in only one direction";

                if(devName.equalsIgnoreCase("filter"))
                    def = "A filter circuit is one which removes the ac component present in the rectified output and allows the dc component to reach the load.";

                if(devName.equalsIgnoreCase("motor"))
                    def = "An electric motor is an electrical machine that converts electrical energy into mechanical energy.";

                if(devName.equalsIgnoreCase("switch"))
                    def = "A switch is an electrical component that can disconnect or connect the conducting path in an electrical circuit, interrupting the electric current or diverting it from one conductor to another.";

                tv.setText(def);
                tv.setVisibility(View.VISIBLE);

            }
        });

        btnProp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etDev.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Please enter the required field.", Toast.LENGTH_SHORT).show();

                else {
                    String name = etDev.getText().toString().trim().toLowerCase();

                    if(name.equalsIgnoreCase("actuator")) {
                        Intent intent = new Intent(MainActivity.this, Activity1.class);

                    intent.putExtra("name", name);
                    startActivity(intent);}

                        if(name.equalsIgnoreCase("sensor")) {
                            Intent intent = new Intent(MainActivity.this, Activity2.class);

                            intent.putExtra("name", name);
                            startActivity(intent);}

                    if(name.equalsIgnoreCase("resistor")) {
                        Intent intent = new Intent(MainActivity.this, Activity3.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("capacitor")) {
                        Intent intent = new Intent(MainActivity.this, Activity4.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("transformer")) {
                        Intent intent = new Intent(MainActivity.this, Activity5.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("inductor")) {
                        Intent intent = new Intent(MainActivity.this, Activity6.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("oscillator")) {
                        Intent intent = new Intent(MainActivity.this, Activity7.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("isolator")) {
                        Intent intent = new Intent(MainActivity.this, Activity8.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("integrated circuit")) {
                        Intent intent = new Intent(MainActivity.this, Activity9.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("transistor")) {
                        Intent intent = new Intent(MainActivity.this, Activity10.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("rectifier")) {
                        Intent intent = new Intent(MainActivity.this, Activity11.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("filter")) {
                        Intent intent = new Intent(MainActivity.this, Activity12.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("motor")) {
                        Intent intent = new Intent(MainActivity.this, Activity13.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}

                    if(name.equalsIgnoreCase("switch")) {
                        Intent intent = new Intent(MainActivity.this, Activity14.class);

                        intent.putExtra("name", name);
                        startActivity(intent);}
                }

            }
        });

        btnTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etDev.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Please enter the required field.", Toast.LENGTH_SHORT).show();

                else {

                    String name = etDev.getText().toString().trim().toLowerCase();

                    if (name.equalsIgnoreCase("actuator")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT1.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("sensor")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT2.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("resistor")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT3.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("capacitor")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT4.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("transformer")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT5.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("inductor")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT6.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("oscillator")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT7.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("isolator")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT8.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("integrated circuit")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT9.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("transistor")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT10.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("rectifier")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT11.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("filter")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT12.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("motor")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT13.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                    if (name.equalsIgnoreCase("switch")) {

                        Intent intent = new Intent(MainActivity.this, ActivityT14.class);

                        intent.putExtra("name", name);
                        startActivity(intent);
                    }

                }
            }
        });

                    btnUses.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if(etDev.getText().toString().isEmpty())
                                Toast.makeText(MainActivity.this, "Please enter the required field.", Toast.LENGTH_SHORT).show();

                            else{

                                String name = etDev.getText().toString().trim().toLowerCase();

                                if (name.equalsIgnoreCase("actuator")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU1.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("sensor")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU2.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("resistor")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU3.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("capacitor")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU4.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("transformer")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU5.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("inductor")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU6.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("oscillator")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU7.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("isolator")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU8.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("integrated circuit")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU9.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("transistor")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU10.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("rectifier")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU11.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("filter")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU12.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("motor")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU13.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }

                                if (name.equalsIgnoreCase("switch")) {

                                    Intent intent = new Intent(MainActivity.this, ActivityU14.class);

                                    intent.putExtra("name", name);
                                    startActivity(intent);
                                }
                            }
                        }
                    });
            }
}