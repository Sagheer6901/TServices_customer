package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_available_twoseater extends AppCompatActivity {

    private TextView twoseater_from_to, twoseater1_id, twoseater2_id, departure1_time, departure2_time, seat1_price, seat2_price;
    Button twoseater1_seatbook, twoseater2_seatbook;

    String time, price;
    int i;
    String emailstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_twoseater);

        final Intent intent = getIntent();

        String str = intent.getStringExtra("root");
        String str1 = intent.getStringExtra("id");
        String date = intent.getStringExtra("date");
        String selection = intent.getStringExtra("selection");

        intent.putExtra("name", str);
        intent.putExtra("id", str1);
        intent.putExtra("date", date);

        twoseater_from_to = findViewById(R.id.twoseater_from_to);
        twoseater_from_to.setText(str);


        twoseater1_id = findViewById(R.id.twoseater1_id);
        twoseater2_id = findViewById(R.id.twoseater2_id);

        twoseater1_id.setText(str1 + "_1");
        twoseater2_id.setText(str1 + "_2");

        departure1_time = (TextView) findViewById(R.id.departuretime1);
        departure2_time = (TextView) findViewById(R.id.departuretime2);


        seat1_price = (TextView) findViewById(R.id.twoseater_price1);
        seat2_price = (TextView) findViewById(R.id.twoseater_price2);


        twoseater1_seatbook = findViewById(R.id.twoseater1_seatbook);
        twoseater2_seatbook = findViewById(R.id.twoseater2_seatbook);

        twoseater1_seatbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1;
                time = departure1_time.getText().toString();
                price = seat1_price.getText().toString();

                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");


                Intent intent = new Intent(Activity_available_twoseater.this, Activity_twoseater_coach.class);
                intent.putExtra("name", str);
                intent.putExtra("id", str1 + "_" + i);
                intent.putExtra("date", date);
                intent.putExtra("time", time);
                intent.putExtra("seat_price", price);
                intent.putExtra("selection", selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);
            }
        });

        twoseater2_seatbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 2;
                time = departure2_time.getText().toString();
                price = seat2_price.getText().toString();

                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");

                Intent intent = new Intent(Activity_available_twoseater.this, Activity_twoseater_coach.class);
                intent.putExtra("name", str);
                intent.putExtra("id", str1 + "_" + i);
                intent.putExtra("date", date);
                intent.putExtra("time", time);
                intent.putExtra("seat_price", price);
                intent.putExtra("selection", selection);
                intent.putExtra("email",emailstr);
                startActivity(intent);
            }
        });
    }
}