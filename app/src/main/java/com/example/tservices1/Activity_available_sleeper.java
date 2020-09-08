package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_available_sleeper extends AppCompatActivity {

    private TextView sleeper_from_to,sleeper1_id,departure_time,seat_price;
    Button sleeper1_seatbook;

    String time,price;
    int i;
    String emailstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_sleeper);

        final Intent intent = getIntent();

        String str = intent.getStringExtra("root");
        String str1 = intent.getStringExtra("id");
        String date = intent.getStringExtra("date");
        String selection = intent.getStringExtra("selection");

        sleeper_from_to = findViewById(R.id.sleeper_from_to);
        sleeper_from_to.setText(str);


        sleeper1_id = findViewById(R.id.sleeper1_id);

        sleeper1_id.setText(str1 + "_1");

        departure_time=(TextView)findViewById(R.id.sleeper_departure1_time);
        time=departure_time.getText().toString();
        seat_price = (TextView)findViewById(R.id.sleeper1_price);
        price=seat_price.getText().toString();
        sleeper1_seatbook = findViewById(R.id.sleeper1_seatbook);

        sleeper1_seatbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=1;

                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");


                Intent intent = new Intent(Activity_available_sleeper.this, Activity_sleeper_coach.class);
                intent.putExtra("root",str);
                intent.putExtra("id",str1+"_"+i);
                intent.putExtra("date",date);
                intent.putExtra("time",time);
                intent.putExtra("seat_price",price);
                intent.putExtra("selection",selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);
            }
        });
    }
}
