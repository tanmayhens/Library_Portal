package com.tanmayhens.libraryportal;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.hardware.camera2.params.RggbChannelVector.BLUE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchtabs(View view)
    {
        String url="http:61.0.174.125/iOPAC/";

        CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent=builder.build();
        builder.setToolbarColor(BLUE);
        builder.setStartAnimations(this, android.R.anim.slide_out_right, android.R.anim.slide_in_left);
        builder.setExitAnimations(this, android.R.anim.slide_out_right, android.R.anim.slide_in_left);
        builder.setShowTitle(true);
        builder.build().launchUrl(this, Uri.parse("http:61.0.174.125/iOPAC/"));





    }

}
