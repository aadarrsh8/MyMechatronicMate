package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityT12 extends AppCompatActivity {

    TextView tvt121, tvt122;
    ListView lvt12;
    ArrayList<String> arr12;
    ArrayAdapter<String> adap12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t12);

        tvt121 = findViewById(R.id.tvt121);
        tvt122 = findViewById(R.id.tvt122);
        lvt12 = findViewById(R.id.lvt12);

        arr12 =  new ArrayList<String>();

        tvt121.setText("Types of Filters");
        tvt122.setVisibility(View.GONE);

        arr12.add("Low-Pass Filter");
        arr12.add("High-Pass Filter");
        arr12.add("Band-Pass Filter");
        arr12.add("Notch Filter");

        adap12 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr12);

        lvt12.setAdapter(adap12);

        lvt12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "A low-pass filter is a filter that passes signals with a frequency lower than a selected cutoff frequency and attenuates signals with frequencies higher than the cutoff frequency. The exact frequency response of the filter depends on the filter design. The filter is sometimes called a high-cut filter, or treble-cut filter in audio applications. A low-pass filter is the complement of a high-pass filter. Low-pass filters exist in many different forms, including electronic circuits such as a hiss filter used in audio, anti-aliasing filters for conditioning signals prior to analog-to-digital conversion, digital filters for smoothing sets of data, acoustic barriers, blurring of images, and so on. The moving average operation used in fields such as finance is a particular kind of low-pass filter, and can be analyzed with the same signal processing techniques as are used for other low-pass filters. Low-pass filters provide a smoother form of a signal, removing the short-term fluctuations and leaving the longer-term trend. In an electronic low-pass RC filter for voltage signals, high frequencies in the input signal are attenuated, but the filter has little attenuation below the cutoff frequency determined by its RC time constant. For current signals, a similar circuit, using a resistor and capacitor in parallel, works in a similar manner.";
                }

                if(position == 1){
                    def = "A high-pass filter (HPF) is an electronic filter that passes signals with a frequency higher than a certain cutoff frequency and attenuates signals with frequencies lower than the cutoff frequency. The amount of attenuation for each frequency depends on the filter design. A high-pass filter is usually modeled as a linear time-invariant system. It is sometimes called a low-cut filter or bass-cut filter in the context of audio engineering. High-pass filters have many uses, such as blocking DC from circuitry sensitive to non-zero average voltages or radio frequency devices. They can also be used in conjunction with a low-pass filter to produce a bandpass filter. n electronics, a filter is a two-port electronic circuit which removes frequency components from a signal (time varying voltage or current) applied to its input port. A high-pass filter attenuates frequency components below a certain frequency, called its cutoff frequency, allowing higher frequency components to pass through. This contrasts with a low-pass filter, which attenuates frequencies higher than a certain frequency, and a bandpass filter, which allows a certain band of frequencies through and attenuates frequencies both higher and lower than the band.In optics a high pass filter is a transparent or translucent window of colored material which allows light longer than a certain wavelength to pass through and attenuates light of shorter wavelengths. Since light is often measured not by frequency but by wavelength, which is inversely related to frequency, a high pass optical filter, which attenuates light frequencies below a cutoff frequency, is often called a short-pass filter; it attenuates longer wavelengths.";
                }

                if(position == 2){
                    def = "A band-pass filter or bandpass filter (BPF) is a device that passes frequencies within a certain range and rejects (attenuates) frequencies outside that range. In electronics and signal processing, a filter is usually a two-port circuit or device which removes frequency components of a signal (an alternating voltage or current). A band-pass filter allows through components in a specified band of frequencies, called its passband but blocks components with frequencies above or below this band. This contrasts with a high-pass filter, which allows through components with frequencies above a specific frequency, and a low-pass filter, which allows through components with frequencies below a specific frequency. In digital signal processing, in which signals represented by digital numbers are processed by computer programs, a band-pass filter is a computer algorithm that performs the same function. The term band-pass filter is also used for optical filters, sheets of colored material which allow through a specific band of light frequencies, and acoustic filters which allow through sound waves of a specific band of frequencies. An example of an analogue electronic band-pass filter is an RLC circuit (a resistor–inductor–capacitor circuit). These filters can also be created by combining a low-pass filter with a high-pass filter.";
                }

                if(position == 3){
                    def = "In signal processing, a band-stop filter or band-rejection filter is a filter that passes most frequencies unaltered, but attenuates those in a specific range to very low levels. It is the opposite of a band-pass filter. A notch filter is a band-stop filter with a narrow stopband (high Q factor). Narrow notch filters (optical) are used in Raman spectroscopy, live sound reproduction (public address systems, or PA systems) and in instrument amplifiers (especially amplifiers or preamplifiers for acoustic instruments such as acoustic guitar, mandolin, bass instrument amplifier, etc.) to reduce or prevent audio feedback, while having little noticeable effect on the rest of the frequency spectrum (electronic or software filters). Other names include \"band limit filter\", \"T-notch filter\", \"band-elimination filter\", and \"band-reject filter\". Typically, the width of the stopband is 1 to 2 decades (that is, the highest frequency attenuated is 10 to 100 times the lowest frequency attenuated). However, in the audio band, a notch filter has high and low frequencies that may be only semitones apart. Band-stop filter can be represented as a combination of low-pass and high-pass filters if the bandwidth is wide enough that the two filters do not interact too much. A more general approach is to design as a low-pass prototype filter which can then be transformed into a bandstop.";
                }

                tvt122.setText(def);
                tvt122.setVisibility(View.VISIBLE);
            }
        });
    }
}