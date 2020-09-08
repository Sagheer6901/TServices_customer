package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TServices extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tservices);



        findViewById(R.id.signin_guest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices.this, Activity_Selection_guest.class));
            }
        });

        onClick_location_buttons();
    }



    private void onClick_location_buttons()
    {
        findViewById(R.id.skr_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices.this, Activity_skr_details.class));
            }
        });

        findViewById(R.id.khi_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices.this, Activity_khi_details.class));
            }
        });

        findViewById(R.id.isl_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices.this, Activity_isl_details.class));
            }
        });

        findViewById(R.id.lhr_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TServices.this, Activity_lhr_details.class));
            }
        });
    }

}
