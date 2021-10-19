package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT7 extends AppCompatActivity {

    TextView tvt71, tvt72;
    ListView lvt7;
    ArrayList<String> arrt7;
    ArrayAdapter<String> adapt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t7);

        tvt71 = findViewById(R.id.tvt71);
        tvt72 = findViewById(R.id.tvt72);
        lvt7 = findViewById(R.id.lvt7);

        tvt71.setText("Types of Oscillators");
        tvt72.setVisibility(View.GONE);

        arrt7 = new ArrayList<String>();

        arrt7.add("Armstrong Oscillator");
        arrt7.add("Clapp Oscillator");
        arrt7.add("Hartley Oscillator");
        arrt7.add("Colpitts Oscillator");
        arrt7.add("RC Oscillator");
        arrt7.add("Wein Bridge Oscillator");
        arrt7.add("Crystal Oscillator");

        adapt7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrt7);

        lvt7.setAdapter(adapt7);

        lvt7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if (position == 0){
                    def = "The Armstrong oscillator (also known as Meissner Oscillator) is an electronic oscillator circuit which uses an inductor and capacitor to generate an oscillation. t is sometimes called a tickler oscillator because its distinguishing feature is that the feedback signal needed to produce oscillations is magnetically coupled into the tank inductor in the input circuit by a tickler coil in the output circuit. This circuit was widely used in the regenerative radio receiver, popular until the 1940s. In that application, the input radio frequency signal from the antenna is magnetically coupled into the tank circuit by an additional winding, and the feedback is reduced with an adjustable gain control in the feedback loop, so the circuit is just short of oscillation. The result is a narrow-band radio-frequency filter and amplifier. The non-linear characteristic of the transistor or tube also demodulated the RF signal to produce the audio signal.";
                }

                if(position == 1){
                    def = "The Clapp oscillator or Gouriet oscillator is an LC electronic oscillator that uses a particular combination of an inductor and three capacitors to set the oscillator's frequency. LC oscillators use a transistor (or vacuum tube or other gain element) and a positive feedback network. The oscillator has good frequency stability. The Clapp oscillator uses a single inductor and three capacitors to set its frequency. The Clapp oscillator is often drawn as a Colpitts oscillator that has an additional capacitor (C0) placed in series with the inductor.";
                }

                if(position == 2){
                    def = "The Hartley oscillator is an electronic oscillator circuit in which the oscillation frequency is determined by a tuned circuit consisting of capacitors and inductors, that is, an LC oscillator. The circuit was invented in 1915 by American engineer Ralph Hartley. The distinguishing feature of the Hartley oscillator is that the tuned circuit consists of a single capacitor in parallel with two inductors in series (or a single tapped inductor), and the feedback signal needed for oscillation is taken from the center connection of the two inductors. The Hartley oscillator is distinguished by a tank circuit consisting of two series-connected coils (or, often, a tapped coil) in parallel with a capacitor, with an amplifier between the relatively high impedance across the entire LC tank and the relatively low voltage/high current point between the coils. The original 1915 version used a triode as the amplifying device in common plate (cathode follower) configuration, with three batteries, and separate adjustable coils. The simplified circuit shown to the right uses a JFET (in common-drain configuration), an LC tank circuit (here the single winding is tapped) and a single battery.";
                }

                if(position == 3){
                    def = "A Colpitts oscillator, invented in 1918 by American engineer Edwin H. Colpitts, s one of a number of designs for LC oscillators, electronic oscillators that use a combination of inductors (L) and capacitors (C) to produce an oscillation at a certain frequency. The distinguishing feature of the Colpitts oscillator is that the feedback for the active device is taken from a voltage divider made of two capacitors in series across the inductor. The Colpitts circuit, like other LC oscillators, consists of a gain device (such as a bipolar junction transistor, field-effect transistor, operational amplifier, or vacuum tube) with its output connected to its input in a feedback loop containing a parallel LC circuit (tuned circuit), which functions as a bandpass filter to set the frequency of oscillation. A Colpitts oscillator is the electrical dual of a Hartley oscillator, where the feedback signal is taken from an \"inductive\" voltage divider consisting of two coils in series (or a tapped coil).";
                }

                if(position == 4){
                    def = "Linear electronic oscillator circuits, which generate a sinusoidal output signal, are composed of an amplifier and a frequency selective element, a filter. A linear oscillator circuit which uses an RC network, a combination of resistors and capacitors, for its frequency selective part is called an RC oscillator. RC oscillators are a type of feedback oscillator; they consist of an amplifying device, a transistor, vacuum tube, or op-amp, with some of its output energy fed back into its input through a network of resistors and capacitors, an RC network, to achieve positive feedback, causing it to generate an oscillating sinusoidal voltage. They are used to produce lower frequencies, mostly audio frequencies, in such applications as audio signal generators and electronic musical instruments. At radio frequencies, another type of feedback oscillator, the LC oscillator is used, but at frequencies below 100 kHz the size of the inductors and capacitors needed for the LC oscillator become cumbersome, and RC oscillators are used instead. Their lack of bulky inductors also makes them easier to integrate into microelectronic devices. Since the oscillator's frequency is determined by the value of resistors and capacitors, which vary with temperature, RC oscillators do not have as good frequency stability as crystal oscillators.";
                }

                if(position == 5){
                    def = "A Wien bridge oscillator is a type of electronic oscillator that generates sine waves. It can generate a large range of frequencies. The oscillator is based on a bridge circuit originally developed by Max Wien in 1891 for the measurement of impedances. The bridge comprises four resistors and two capacitors. The oscillator can also be viewed as a positive gain amplifier combined with a bandpass filter that provides positive feedback. Automatic gain control, intentional non-linearity and incidental non-linearity limit the output amplitude in various implementations of the oscillator. Wien's bridge is used for precision measurement of capacitance in terms of resistance and frequency.  It was also used to measure audio frequencies. The Wien bridge does not require equal values of R or C.";
                }

                if(position == 6){
                    def = "A crystal oscillator is an electronic oscillator circuit that uses the mechanical resonance of a vibrating crystal of piezoelectric material to create an electrical signal with a constant frequency. This frequency is often used to keep track of time, as in quartz wristwatches, to provide a stable clock signal for digital integrated circuits, and to stabilize frequencies for radio transmitters and receivers. The most common type of piezoelectric resonator used is the quartz crystal, so oscillator circuits incorporating them became known as crystal oscillators, but other piezoelectric materials including polycrystalline ceramics are used in similar circuits. A crystal oscillator relies on the slight change in shape of a quartz crystal under an electric field, a property known as electrostriction or inverse piezoelectricity. A voltage applied to an electrode on the crystal causes it to change shape; when the voltage is removed, the crystal generates a small voltage as it elastically returns to its original shape. The quartz oscillates at a stable resonant frequency, behaving like an RLC circuit, but with a much higher Q factor (less energy loss on each cycle of oscillation). Once a quartz crystal is adjusted to a particular frequency (which is affected by the mass of electrodes attached to the crystal, the orientation of the crystal, temperature and other factors), it maintains that frequency with high stability.";
                }

                tvt72.setText(def);
                tvt72.setVisibility(View.VISIBLE);
            }
        });
    }
}