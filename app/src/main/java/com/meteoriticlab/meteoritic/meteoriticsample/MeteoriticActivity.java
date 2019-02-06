package com.meteoriticlab.meteoritic.meteoriticsample;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import animation.lodex.com.meteoriticlab.Meteoritic;

public class MeteoriticActivity extends AppCompatActivity {

    Meteoritic mMeteoritic;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meteoritic);

        mMeteoritic=findViewById(R.id.animation);
        mButton=findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMeteoritic.setAnimation(MeteoriticActivity.this);
            }
        });


    }
}
