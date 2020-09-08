package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Selection_guest extends AppCompatActivity {
    Button car_seat_guest,sleeper_coach_guest,twoseater_coach_guest;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_guest);

        car_seat_guest=findViewById(R.id.car_seat_guest);
        sleeper_coach_guest=findViewById(R.id.sleeper_coach_guest);
        twoseater_coach_guest=findViewById(R.id.twoseater_coach_guest);

        findViewById(R.id.car_seat_guest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 intent= new Intent(Activity_Selection_guest.this,Activity_via_guest.class);
                intent.putExtra("selection",car_seat_guest.getText());
                startActivity(intent);
            }
        });

        findViewById(R.id.sleeper_coach_guest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(Activity_Selection_guest.this,Activity_via_guest.class);
                intent.putExtra("selection",sleeper_coach_guest.getText());
                startActivity(intent);
            }
        });

        findViewById(R.id.twoseater_coach_guest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(Activity_Selection_guest.this,Activity_via_guest.class);
                intent.putExtra("selection",twoseater_coach_guest.getText());
                startActivity(intent);
            }
        });


    }

}
