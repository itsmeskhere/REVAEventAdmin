package com.example.itsmesk.revaevent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity {
    Button CSE, ECE, Arts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_choose );

        CSE = findViewById ( R.id.CSE );
        ECE = findViewById ( R.id.ECE );
        Arts = findViewById ( R.id.Arts );
        CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseActivity.this, ItemsActivity.class);
                startActivity(i);
            }
        });
        ECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseActivity.this, ItemsActivity1.class);
                startActivity(i);
            }
        });
        Arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseActivity.this, ItemsActivity2.class);
                startActivity(i);
            }
        });
    }

}
