package com.example.enjoykuningan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    private CardView rinjani, ciremai, prau, merbabu, semeru, slamet, lawu, sindoro, sumbing, merapi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rinjani = findViewById(R.id.rinjani);
        ciremai = findViewById(R.id.ciremai);
        prau = findViewById(R.id.prau);
        merbabu = findViewById(R.id.merbabu);
        semeru = findViewById(R.id.semeru);
        slamet = findViewById(R.id.slamet);
        lawu = findViewById(R.id.lawu);
        sindoro = findViewById(R.id.sindoro);
        sumbing = findViewById(R.id.sumbing);
        merapi = findViewById(R.id.merapi);


        rinjani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),rinjaniac.class));
            }
        });

        ciremai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ciremaiac.class));
            }
        });

        prau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),prauac.class));
            }
        });
        merbabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),merbabuac.class));
            }
        });
        semeru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),semeruac.class));
            }
        });
        slamet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),slametac.class));
            }
        });
        lawu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),lawuacc.class));
            }
        });

        sindoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),sindoroac.class));
            }
        });

        sumbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),sumbingac.class));
            }
        });


        merapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),merapiac.class));
            }
        });




    }
}