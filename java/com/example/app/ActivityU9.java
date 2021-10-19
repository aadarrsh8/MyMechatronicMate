package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityU9 extends AppCompatActivity {

    TextView tvu91, tvu92;
    ListView lvu9;
    ArrayList<String> arru9;
    ArrayAdapter<String> adapu9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u9);

        tvu91 = findViewById(R.id.tvu91);
        tvu92 = findViewById(R.id.tvu92);
        lvu9 = findViewById(R.id.lvu9);

        tvu91.setText("Uses of Integrated Circuits");
        tvu92.setVisibility(View.GONE);

        arru9 = new ArrayList<>();

        arru9.add("Automotive Radars");
        arru9.add("Video Processors");
        arru9.add("Audio Amplifiers");
        arru9.add("Microcontrollers");
        arru9.add("555 Timers");
        arru9.add("Calculators");

        adapu9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arru9);
        lvu9.setAdapter(adapu9);

        lvu9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String def = new String();

                if(position == 0){
                    def = "Monolithic microwave integrated circuits (MMICs) are circuits integrated into small packages for operation at microwave frequencies. MMICs are used in automotive applications for sensing the environment within and around the automobile. By sensing the environment using MMICs, surrounding objects may be identified. Data such as distance and speed are collected for use and response by increasingly-available smart cars.MMICs typically incorporate an onboard low-dropout regulator (LDO) and an analog-to-digital converter (ADC) to condition signals before sending to a digital signal processor (DSP) within the overall radar system block, an embedded system within the car. MMICs use microwave frequencies to transmit and receive information for detection and localization of objects using radio waves. They are typically arranged at the four corners of the vehicles and are sometimes included on each side of the car as part of its automotive radar. Incorporating MMIC design into your vehicle can be an adaptive and easily utilizable process. Autonomous automobiles use both short-range and long-range MMICs. Using short-range radar operating with a center frequency of 24 GHz, the MMICs perform blind spot monitoring, lane and lane-change assist, collision warning and avoidance, parking assist, and cross-traffic monitoring. With long-range range operating at a center frequency of 77 GHz, MMICs provide brake assist, emergency braking, and automatic distance control.";
                }

                if(position == 1){
                    def = "Video processors IC are semiconductor devices used to process video images for a wide range of applications. These integrated circuits (ICs) are designed to display analog and/or digital signals while eliminating multi-path interference and adjacent-channel noise. Video processors IC may also provide high-definition (HD) decompression, pixel-based video analysis, adaptive pixel interpolation, and advanced field merging functions to eliminate problems caused by interlaced coding. Some video processing chips can decode two or more simultaneous standard-definition (SD) signals. Others comply with digital television standards from organizations such as the Advanced Television Systems Committee (ATSC) and the European Digital Video Broadcasting (European DVB). Support for cathode ray tubes (CRTs) and flat panel devices may also be available with some video processors IC.";
                }

                if(position == 2){
                    def = "Audio amplifier ICs (integrated circuits) are devices used within electronic circuits for audio applications. Audio amplifiers increase, control and amplify the strength or amplitude of the signals. They are used to increase the sound and quality of the audio signal. Amplifier characteristics and performance are classed using letter symbols, such as Class-A, Class-B, Class-C, Class-D or Class-AB. IC audio amplifiers are useful because they can vastly decrease the size of amplification devices, making it possible to create sophisticated amplification within a small package. Unlike power amplifiers, they are not standalone devices. Audio amplifier ICs are used in a range of commercial applications. They are found in car stereos, headphones, televisions, keyboards, and toys. They are also used in electronic circuits for line drivers, ultrasonic drivers, power converters and radio amplifiers.";
                }

                if(position == 3){
                    def = "A microcontroller (MCU for microcontroller unit) is a small computer on a single metal-oxide-semiconductor (MOS) integrated circuit (IC) chip. A microcontroller contains one or more CPUs (processor cores) along with memory and programmable input/output peripherals. Program memory in the form of ferroelectric RAM, NOR flash or OTP ROM is also often included on chip, as well as a small amount of RAM. Microcontrollers are designed for embedded applications, in contrast to the microprocessors used in personal computers or other general purpose applications consisting of various discrete chips. Microcontrollers are used in automatically controlled products and devices, such as automobile engine control systems, implantable medical devices, remote controls, office machines, appliances, power tools, toys and other embedded systems. By reducing the size and cost compared to a design that uses a separate microprocessor, memory, and input/output devices, microcontrollers make it economical to digitally control even more devices and processes. Mixed signal microcontrollers are common, integrating analog components needed to control non-digital electronic systems. In the context of the internet of things, microcontrollers are an economical and popular means of data collection, sensing and actuating the physical world as edge devices.";
                }

                if(position == 4){
                    def = "The 555 timer IC is an integrated circuit (chip) used in a variety of timer, delay, pulse generation, and oscillator applications. Derivatives provide two (556) or four (558) timing circuits in one package. The 555 is a monolithic timer device which can be used to produce accurate and highly stable time delays or oscillation. It can be used to produce time delays ranging from few microseconds to several hours. It has a very high temperature stability, as it is designed to operate in the temperature range of 218K to 398K.";
                }

                if(position == 5){
                    def = "A multi-function calculator is designed within a single IC such that it executes five operations which include four basic arithmetic functions and one add-on or discount percentages. It constitutes of a simple layout of a keyboard with ten numerical keys, and six function keys plus a decimal point key. Talking about the physical structure of this IC, in between the keyboard and the display, nine digit connections are established which are used to display the arithmetic numbers. Out of these, three lines from the keyboard are used to notify the IC which rows of keys has been pressed. This information is then combined with the digit information. When any one key from keyboard is pressed, the set of other eight digit lines are enabled and are used to illuminate the selected segments of the numeral. An external oscillator and the signal to enable oscillator are only other inputs to the IC.";
                }

                tvu92.setText(def);
                tvu92.setVisibility(View.VISIBLE);
            }
        });
    }
}