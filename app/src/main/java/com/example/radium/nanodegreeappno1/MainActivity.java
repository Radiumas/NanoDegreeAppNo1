package com.example.radium.nanodegreeappno1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Opens the dialer to initiate a call
    public void dial(View view) {
        String number = "37063489363";
        Uri call = Uri.parse("tel:" + number);
        Intent dial = new Intent(Intent.ACTION_DIAL, call);
        startActivity(dial);
    }
}
