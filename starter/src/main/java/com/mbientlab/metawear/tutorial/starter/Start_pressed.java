package com.mbientlab.metawear.tutorial.starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_pressed extends AppCompatActivity {
Button clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_pressed);
        clk = (Button) findViewById(R.id.acc_start);
    }

    public void movestart(View v){
        Intent pageswitch = new Intent();
    }
}
