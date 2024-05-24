package com.example.enjoykuningan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class register extends AppCompatActivity {
    private ImageButton cancelreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        cancelreg = findViewById(R.id.cancelreg);

        cancelreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(log);
                finish();

            }

        });
    }
}