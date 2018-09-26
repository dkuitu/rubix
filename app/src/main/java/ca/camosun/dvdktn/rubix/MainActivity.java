package ca.camosun.dvdktn.rubix;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //top face
        final ImageView t1 = findViewById(R.id.t1);
        final ImageView t2 = findViewById(R.id.t2);
        final ImageView t3 = findViewById(R.id.t3);
        final ImageView t4 = findViewById(R.id.t4);
        //left face
        final ImageView l1 = findViewById(R.id.l1);
        final ImageView l2 = findViewById(R.id.l2);
        final ImageView l3 = findViewById(R.id.l3);
        final ImageView l4 = findViewById(R.id.l4);
        //front face
        final ImageView f1 = findViewById(R.id.f1);
        final ImageView f2 = findViewById(R.id.f2);
        final ImageView f3 = findViewById(R.id.f3);
        final ImageView f4 = findViewById(R.id.f4);
        //right face
        final ImageView r1 = findViewById(R.id.r1);
        final ImageView r2 = findViewById(R.id.r2);
        final ImageView r3 = findViewById(R.id.r3);
        final ImageView r4 = findViewById(R.id.r4);
        //bottom face
        final ImageView b1 = findViewById(R.id.b1);
        final ImageView b2 = findViewById(R.id.b2);
        final ImageView b3 = findViewById(R.id.b3);
        final ImageView b4 = findViewById(R.id.b4);
        //rear face
        final ImageView re1 = findViewById(R.id.re1);
        final ImageView re2 = findViewById(R.id.re2);
        final ImageView re3 = findViewById(R.id.re3);
        final ImageView re4 = findViewById(R.id.re4);

        //Left vertical up or down
        Button LU = findViewById(R.id.buttonLU);
        Button LD = findViewById(R.id.buttonLD);
        //Top horizontal left or right
        Button TR = findViewById(R.id.buttonTR);
        Button TL = findViewById(R.id.buttonTL);
        //Front face cw(right) or ccw(left)
        Button FR = findViewById(R.id.buttonFR);
        Button FL = findViewById(R.id.buttonFL);

        //Left Up button
        LU.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable tempt1 = t1.getBackground();
                Drawable tempt3 = t3.getBackground();
                Drawable tempf1 = f1.getBackground();
                Drawable tempf3 = f3.getBackground();
                Drawable tempb1 = b1.getBackground();
                Drawable tempb3 = b3.getBackground();
                Drawable tempre1 = re1.getBackground();
                Drawable tempre3 = re3.getBackground();
                Drawable templ1 = l1.getBackground();
                Drawable templ2 = l2.getBackground();
                Drawable templ3 = l3.getBackground();
                Drawable templ4 = l4.getBackground();
                f1.setBackground(tempb1);
                f3.setBackground(tempb3);
                b1.setBackground(tempre1);
                b3.setBackground(tempre3);
                re1.setBackground(tempt1);
                re3.setBackground(tempt3);
                t1.setBackground(tempf1);
                t3.setBackground(tempf3);
                l1.setBackground(templ2);
                l2.setBackground(templ4);
                l4.setBackground(templ3);
                l3.setBackground(templ1);
            }
        });

        //Left Down button swaps tiles appropriately
        LD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable tempt1 = t1.getBackground();
                Drawable tempt3 = t3.getBackground();
                Drawable tempf1 = f1.getBackground();
                Drawable tempf3 = f3.getBackground();
                Drawable tempb1 = b1.getBackground();
                Drawable tempb3 = b3.getBackground();
                Drawable tempre1 = re1.getBackground();
                Drawable tempre3 = re3.getBackground();
                Drawable templ1 = l1.getBackground();
                Drawable templ2 = l2.getBackground();
                Drawable templ3 = l3.getBackground();
                Drawable templ4 = l4.getBackground();
                f1.setBackground(tempt1);
                f3.setBackground(tempt3);
                b1.setBackground(tempf1);
                b3.setBackground(tempf3);
                re1.setBackground(tempb1);
                re3.setBackground(tempb3);
                t1.setBackground(tempre1);
                t3.setBackground(tempre3);
                l1.setBackground(templ3);
                l2.setBackground(templ4);
                l3.setBackground(templ2);
                l4.setBackground(templ1);
            }
        });

        //Top Right Button swaps tiles appropriately
        TR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable tempt1 = t1.getBackground();
                Drawable tempt2 = t2.getBackground();
                Drawable tempt3 = t3.getBackground();
                Drawable tempt4 = t4.getBackground();
                Drawable templ1 = l1.getBackground();
                Drawable templ2 = l2.getBackground();
                Drawable tempr1 = r1.getBackground();
                Drawable tempr2 = r2.getBackground();
                Drawable tempre3 = re3.getBackground();
                Drawable tempre4 = re4.getBackground();
                Drawable tempf1 = f1.getBackground();
                Drawable tempf2 = f2.getBackground();
                t1.setBackground(tempt2);
                t2.setBackground(tempt4);
                t4.setBackground(tempt3);
                t3.setBackground(tempt1);
                l1.setBackground(tempre4);
                l2.setBackground(tempre3);
                r1.setBackground(tempf1);
                r2.setBackground(tempf2);
                re3.setBackground(tempr2);
                re4.setBackground(tempr1);
                f1.setBackground(templ1);
                f2.setBackground(templ2);
            }
        });

        //Top Left Button swaps tiles appropriately
        TL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable tempt1 = t1.getBackground();
                Drawable tempt2 = t2.getBackground();
                Drawable tempt3 = t3.getBackground();
                Drawable tempt4 = t4.getBackground();
                Drawable templ1 = l1.getBackground();
                Drawable templ2 = l2.getBackground();
                Drawable tempr1 = r1.getBackground();
                Drawable tempr2 = r2.getBackground();
                Drawable tempre3 = re3.getBackground();
                Drawable tempre4 = re4.getBackground();
                Drawable tempf1 = f1.getBackground();
                Drawable tempf2 = f2.getBackground();
                t1.setBackground(tempt3);
                t2.setBackground(tempt1);
                t3.setBackground(tempt4);
                t4.setBackground(tempt2);
                l1.setBackground(tempf1);
                l2.setBackground(tempf2);
                re3.setBackground(templ2);
                re4.setBackground(templ1);
                r2.setBackground(tempre3);
                r1.setBackground(tempre4);
                f1.setBackground(tempr1);
                f2.setBackground(tempr2);
            }
        });

        //Front Left Button swaps tiles appropriately
        FL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable tempf1 = f1.getBackground();
                Drawable tempf2 = f2.getBackground();
                Drawable tempf3 = f3.getBackground();
                Drawable tempf4 = f4.getBackground();
                Drawable templ2 = l2.getBackground();
                Drawable templ4 = l4.getBackground();
                Drawable tempr1 = r1.getBackground();
                Drawable tempr3 = r3.getBackground();
                Drawable tempt3 = t3.getBackground();
                Drawable tempt4 = t4.getBackground();
                Drawable tempb1 = b1.getBackground();
                Drawable tempb2 = b2.getBackground();
                f1.setBackground(tempf2);
                f2.setBackground(tempf4);
                f3.setBackground(tempf1);
                f4.setBackground(tempf3);
                t4.setBackground(tempr3);
                t3.setBackground(tempr1);
                l2.setBackground(tempt4);
                l4.setBackground(tempt3);
                b1.setBackground(templ2);
                b2.setBackground(templ4);
                r3.setBackground(tempb1);
                r1.setBackground(tempb2);
            }
        });

        //Front Right Button swaps tiles appropriately
        FR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable tempf1 = f1.getBackground();
                Drawable tempf2 = f2.getBackground();
                Drawable tempf3 = f3.getBackground();
                Drawable tempf4 = f4.getBackground();
                Drawable templ2 = l2.getBackground();
                Drawable templ4 = l4.getBackground();
                Drawable tempr1 = r1.getBackground();
                Drawable tempr3 = r3.getBackground();
                Drawable tempt3 = t3.getBackground();
                Drawable tempt4 = t4.getBackground();
                Drawable tempb1 = b1.getBackground();
                Drawable tempb2 = b2.getBackground();
                f1.setBackground(tempf3);
                f2.setBackground(tempf1);
                f3.setBackground(tempf4);
                f4.setBackground(tempf2);
                t4.setBackground(templ2);
                t3.setBackground(templ4);
                l2.setBackground(tempb1);
                l4.setBackground(tempb2);
                b1.setBackground(tempr3);
                b2.setBackground(tempr1);
                r3.setBackground(tempt4);
                r1.setBackground(tempt3);
            }
        });

    }
}
