package e.vatsalkesarwani.forsightlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class front_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_front);
        Button enter = findViewById(R.id.nxt);
        enter.setOnClickListener(new View.OnClickListener()
                                 {
                                     @Override
                                     public void onClick(View v)
                                     {
                                         Toast.makeText(front_page.this,"Sample Graphs",Toast.LENGTH_LONG).show();
                                         Intent intent = new Intent(front_page.this,page_graph.class);
                                         startActivity(intent);

                                     }
                                 }
        );
    }

    public void exp1(View view)
    {
        display1("EXPERIMENT NO. 1\n\nAIM -To determine the energy band gap of a given semiconductor material by four probe.\n\nAPPARATUS -Probes arrangement, sample, oven and four Probes setup. \n\nPRECAUTION- \n1. The sample should be placed with non-conducting surface towards the bottom.\n2. The current through the sample should not be large enough to cause heating.\n3. The surface of the semiconductor should be flat.\n4. All the probes should be collinear.\n\n");
        displays("@drawable/x1");
    }

    public void exp2(View view)
    {
        display2("EXPERIMENT NO. 2\n\nAIM: To study the variation of magnetic field with distance along the axis of current carrying coil and then to estimate the radius of the coil \n\nAPPARATUS: Stewart and Gee type tangent galvanometer, storage battery, commutator ammeter, rheostat, one way plug key and connecting wires. \n\nPRECAUTION- \n1.All the magnetic materials and current carrying conductors should be at considerable distance from the apparatus.\n2. The coil should be carefully adjusted in magnetic meridian. \n3. Parallax should be removed while reading the position of pointer. \n4. Connections should be clean and tight. \n\n");
        displays("@drawable/x2");
    }

    public void exp3(View view)
    {
        display3("EXPERIMENT NO. 3\n\nAIM: To verify Stefan's law by electrical method. \n\nAPPARATUS USED: Battery, Rheostat, Key, Ammeter, Voltmeter, Bulb, Connecting Wires. \n\nPRECAUTION- \n1. Value of a and B for the filament material should be taken from the tables\n2. Current should not be increased much otherwise the bulb filament will fuse\n3. To get accurate resistance at a particular temperature the filament voltage V' and filament current.\n\n");
        displays("@drawable/x3");
    }

    public void exp4(View view)
    {
        display4("EXPERIMENT NO. 4\n\nAIM: To determine the specific resistance of a given wire by Carey Foster's Bridge and evaluates the end correction S1 and S2. \n\nAPPARATUS: Carey Foster's Bridge, Leclanche Cell, Plug Key, Resistance Boxes Specimen Wire Screw Gauge, Galvanometer, Jockey (slider), Connecting Wires. \n\nPRECAUTION- \n1.Disconnect the circuit just after taking cach reading otherwise resistance of the bridge wire will increase because of heat. \n2.Note down the balancing length accurately. \n3.Radius of the wire should be very much accurately measured.\n\n");
        displays("@drawable/x4");
    }

    public void exp5(View view)
    {
        display5("EXPERIMENT NO. 5\n\nAIM: To determine the wavelength of monochromatic sodium light by using Newton's Rings.\n\nAPPARATUS: A traveling microscope, a plane glass plate, a sodium vapor lamp with Transformer, optical arrangement for Newton's Rings a convex lens, magnifying lens. \n\nPRECAUTION- \n1. The lens and glass plates should be cleaned before using. \n2.The crosswire should be set along the diameter of the rings and not about any chord\n3.Use only dark ring so that crosswise may be set easily on each ring\n4.First three or four rings should be left out for measurement as they are not well defined. \n5.Micrometer screw should be moved only in one direction throughout the experiment in order to avoid any error due to backlash of the screw.\n\n");
        displays("@drawable/x5");
    }

    public void exp6(View view)
    {
        display6("EXPERIMENT NO. 6\n\nAIM: To determine the focal length of the combination of two thin convergent lenses separated by distance with the help of a Nodal - Slide and verify the formula 1/F=1/f1 +1/f2 - x/f1f2 \nwhere, F= focal length of the combination. f1,f2 =focal length of the two lenses\nx= Distance between the two lenses\nAnd also locate the cardinal points.\n\nAPPARATUS: Nodal - Slide Assembly (consisting of an optical bench, plane mirror, cross slit and lamp) and the two given lenses. \n\nPRECAUTION- \n1. False images formed by partial reflection from the faces of the lenses should not be confused with the true image of the cross-slit.\n2. While determining the focal length of a single lens, its optical centre must lie on the axis of rotation of the nodal slide (for easy and quick setting). \n3.Bench-error should also be taken into account. \n4.The nodal slide should be rotated slightly about the axis of rotation. \n5.In order to get a bright image of the slit the plane mirror should be placed as close to the combination as possible.\n\n");
        displays("@drawable/x6");
    }

    public void exp7(View view)
    {
        display7("EXPERIMENT NO. 7\n\nAIM: To determine the specific rotation of an optically active (cane sugar) solution by Polarimeter. \n\nAPPARATUS: Polarimeter, Sodium Vapor Lamp, Cane Sugar, Thermometer, Graduated Jar and Distilled Water. \n\nPRECAUTION- \n1.There should be no air bubble in the tube otherwise the path of light is obstructed. \n2.The eye-piece of the telescope should be focused on the half shade. \n3. The cap of the tube should not be screwed so tightly that the end glass piece strained, if they are strained the light may become elliptically polarized. \n4.The temperature of the solution should be recorded and mentioned with the result.\n\n");
        displays("@drawable/x7");
    }

    public void exp8(View view)
    {
        display8("EXPERIMENT NO. 8\n\nAIM: To determine the Electro Chemical Equivalent of copper using a Tangent Galvanometer (TG). \n\nAPPARATUS: Copper Voltmeter, Storage Cell, Plug Key, Rheostat, Stop Watch, Commutator, Spirit level and TG. \n\nPRECAUTION- \n1.The point of pivot of the magnetic needle may not coincide with the centre of the circular.sat hence both ends of the pointer are read to obtain the deflections. \n2. The plane of TG may not lie exactly in the magnetic meridian. Hence the current through the TG is reversed using the commutator Reading of the pointer is noted. \n3. The current must be steady throughout the experiment.\n4. As the mass of copper deposited is very small, it must be determined accurately by the method of oscillations. \n5. It is preferable to use a copper voltameter with three copper plates, the end plates being connected. The middle plate must be used as cathode. \n6. The cathode plate must be properly cleaned, otherwise deposition of the copper may not be firm. \n7.High current should not be passed; current should not be more than one ampere for 50 sq. cm areas of the cathode plate.\n\n");
        displays("@drawable/x8");
    }

    public void exp9(View view)
    {
        display9("EXPERIMENT NO. 9\n\nAIM- To determine the wavelength of spectral lines using plane transmission grating. \n\nAPPARATUS: Diffraction grating. Spectrometer, mercury vapor lamp, condensing Iens, spirit level reading lens. \n\nPRECAUTION- \n1.Grating should be held from its edges and not to be touched by fingers.\n2.The grating must be adjusted for minimum deviation carefully. \n3.The prism table, telescope and the collimator of the spectrometer are first adjusted. \n4. The grating is mounted at the centre of the prism table with its face normal to the incident.\n\n");
        displays("@drawable/x9");
    }

    public void exp10(View view)
    {
        display10("EXPERIMENT NO. 10\n\nAIM: Measurement of Numerical Aperture (NA) of optical fiber.  \n\nAPPARATUS:ST2501 Techbook with power supply cord, Optical Fibre cable , Numerical Aperture measurement Jig. \n\nPRECAUTION- \n1. Optical fiber cable should be tightly connected to the emitter LED point on the board. \n2.Gain should be adjusted to maximum value otherwise input spot from LED is not visible. \n3.There should not be any bend in the optical fiber cable.\n\n");
        displays("@drawable/x10");
    }

    private void display1(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t1);
        expTextView.setText(""+s);

    }
    private void display2(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t2);
        expTextView.setText(""+s);

    }
    private void display3(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t3);
        expTextView.setText(""+s);

    }
    private void display4(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t4);
        expTextView.setText(""+s);

    }
    private void display5(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t5);
        expTextView.setText(""+s);

    }
    private void display6(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t6);
        expTextView.setText(""+s);

    }
    private void display7(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t7);
        expTextView.setText(""+s);

    }
    private void display8(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t8);
        expTextView.setText(""+s);

    }
    private void display9(String s)
    {

        TextView expTextView=(TextView) findViewById(R.id.t9);
        expTextView.setText(""+s);

    }
    private void display10(String s)
    {
        TextView expTextView=(TextView) findViewById(R.id.t10);
        expTextView.setText(""+s);

    }

    private void displays(String s1)
    {
        Toast.makeText(front_page.this,"Scroll Down For Circuit Diagram",Toast.LENGTH_LONG).show();
        ImageView expimageView=(ImageView) findViewById(R.id.p1) ;
        int imageResource=getResources().getIdentifier(s1,null,this.getPackageName());
        expimageView.setImageResource(imageResource);
    }
}
