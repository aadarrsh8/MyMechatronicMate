package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU7 extends AppCompatActivity {

    TextView tvu71, tvu72;
    ListView lvu7;
    ArrayList<String> arru7;
    ArrayAdapter<String> adapu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u7);

        tvu71 = findViewById(R.id.tvu71);
        tvu72 = findViewById(R.id.tvu72);
        lvu7 = findViewById(R.id.lvu7);

        tvu71.setText("Uses of Oscillators");
        tvu72.setVisibility(View.GONE);

        arru7 = new ArrayList<String>();

        arru7.add("Quartz Clock");
        arru7.add("Metal Detectors");
        arru7.add("Siren");
        arru7.add("Clock Generator");

        adapu7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru7);
        lvu7.setAdapter(adapu7);

        lvu7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Quartz clocks and quartz watches are timepieces that use an electronic oscillator regulated by a quartz crystal to keep time. The crystal oscillator creates a signal with very precise frequency, so that quartz clocks and watches are at least an order of magnitude more accurate than mechanical clocks. Generally, some form of digital logic counts the cycles of this signal and provides a numerical time display, usually in units of hours, minutes, and seconds." + "\n" + "\n In modern quartz clocks, the quartz crystal resonator or oscillator is in the shape of a small tuning fork (XY-cut), laser-trimmed or precision lapped to vibrate at 32768 Hz. This frequency is equal to 32768 cycles per second. A power of 2 is chosen so a simple chain of digital divide-by-2 stages can derive the 1 Hz signal needed to drive the watch's second hand. In most clocks, the resonator is in a small can or flat package, about 4 mm long. The 32768 Hz resonator has become so common due to a compromise between the large physical size of low-frequency crystals for watches and the large current drain of high-frequency crystals, which reduces the life of the watch battery. ";
                }

                if(position == 1){
                    def = "The sensor assembly of a metal detector consists of one or more coils, usually two. An oscillator outputs an alternating current that passes through the send coil, producing a fluctuating magnetic field that penetrates the ground or other layer that is opaque to visible light." + "\n" + "\n The fluctuating magnetic field induces eddy currents in any conductive material that is within range. These eddy currents, in turn, produce another magnetic field, which causes current to flow in the receive coil. The induced current can be amplified and directed to earphones or a gauge and the operator can interpret the display to ascertain the size, depth and nature of the material. This system can discriminate between metals every metal has a different phase response when exposed to AC.";
                }

                if(position == 2){
                    def = "An electronic siren including yelp and wail oscillators, means for mixing the signals from the yelp and wail oscillators, and an amplifier output circuit for broadcasting the mixed yelp and wail signals. The wail oscillator is adapted to operate automatically or may be operated manually by means of a push button or from remote switching means. It may also be switched to operate with a siren sound or a horn sound having a variable pitch." + "\n" + "\n In operation, the electronic siren will provide a microphone or radio output, a manually selected automatic siren or horn sound output from the wail oscillator, the output of both the wail and yelp oscillators simultaneously, or the output of the yelp oscillator. The manually selected horn or siren sound output of the wail oscillator may also be initiated manually and under control of a remote switch. ";
                }

                if(position == 3){
                    def = "A clock generator is an electronic oscillator that produces a clock signal for use in synchronizing a circuit's operation. The signal can range from a simple symmetrical square wave to more complex arrangements. The basic parts that all clock generators share are a resonant circuit and an amplifier. The resonant circuit is usually a quartz piezo-electric oscillator, although simpler tank circuits and even RC circuits may be used. The amplifier circuit usually inverts the signal from the oscillator and feeds a portion back into the oscillator to maintain oscillation.";
                }

                tvu72.setText(def);
                tvu72.setVisibility(View.VISIBLE);
            }
        });
    }
}