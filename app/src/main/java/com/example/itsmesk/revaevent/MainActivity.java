package com.example.itsmesk.revaevent;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.example.itsmesk.revaevent.R;

public class MainActivity extends AppCompatActivity {
    private Button openTeachersActivityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        openTeachersActivityBtn = findViewById ( R.id.openTeachersActivityBtn );

        openTeachersActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ChooseActivity.class);
                startActivity(i);
            }
        });

    }

}
