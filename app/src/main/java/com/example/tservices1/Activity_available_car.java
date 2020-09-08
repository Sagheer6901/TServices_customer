package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_available_car extends AppCompatActivity {
    private TextView car, carid1, carid2, carid3, carid4, carid5,
            departure1_time,departure2_time,departure3_time,departure4_time,departure5_time,
            seat_price1,seat_price2,seat_price3,seat_price4,seat_price5;
    Button car_seatbook1, car_seatbook2, car_seatbook3, car_seatbook4, car_seatbook5;

    int i;
    Intent intent;
    String st,seat_price;
    String emailstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_car);

        intent = getIntent();
        String str = intent.getStringExtra("root");
        String str1 = intent.getStringExtra("id");
        String date = intent.getStringExtra("date");
        String selection = intent.getStringExtra("selection");


        car = findViewById(R.id.car_from_to);
        car.setText(str);


        carid1 = findViewById(R.id.car1_id);
        carid2 = findViewById(R.id.car2_id);
        carid3 = findViewById(R.id.car3_id);
        carid4 = findViewById(R.id.car4_id);
        carid5 = findViewById(R.id.car5_id);

        carid1.setText(str1 + "_1");
        carid2.setText(str1 + "_2");
        carid3.setText(str1 + "_3");
        carid4.setText(str1 + "_4");
        carid5.setText(str1 + "_5");

        departure1_time=(TextView)findViewById(R.id.departure1_time);
        departure2_time=(TextView)findViewById(R.id.departure2_time);
        departure3_time=(TextView)findViewById(R.id.departure3_time);
        departure4_time=(TextView)findViewById(R.id.departure4_time);
        departure5_time=(TextView)findViewById(R.id.departure5_time);

        seat_price1 = findViewById(R.id.firstseat_price1);
        seat_price2 = findViewById(R.id.firstseat_price2);
        seat_price3= findViewById(R.id.firstseat_price3);
        seat_price4 = findViewById(R.id.firstseat_price4);
        seat_price5 = findViewById(R.id.firstseat_price5);

        car_seatbook1 = findViewById(R.id.car1_seatbook);
        car_seatbook2 = findViewById(R.id.car2_seatbook);
        car_seatbook3 = findViewById(R.id.car3_seatbook);
        car_seatbook4 = findViewById(R.id.car4_seatbook);
        car_seatbook5 = findViewById(R.id.car5_seatbook);

        car_seatbook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            i=1;
            st=departure1_time.getText().toString();
            seat_price=seat_price1.getText().toString();

                intent = getIntent();
                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");



                intent = new Intent(Activity_available_car.this, Activity_car.class);
                intent.putExtra("root",str);
                intent.putExtra("id",str1+"_"+i);
                intent.putExtra("date",date);
                intent.putExtra("time",st);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("selection",selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);
            }
        });

        car_seatbook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               i=2;
                st=departure2_time.getText().toString();
                seat_price=seat_price2.getText().toString();

                intent = getIntent();
                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");

                intent = new Intent(Activity_available_car.this, Activity_car.class);
                intent.putExtra("root",str);
                intent.putExtra("id",str1+"_"+i);
                intent.putExtra("date",date);
                intent.putExtra("time",st);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("selection",selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);
            }
        });

        car_seatbook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=3;
                st=departure3_time.getText().toString();
                seat_price=seat_price3.getText().toString();

                intent = getIntent();
                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");

                intent = new Intent(Activity_available_car.this, Activity_car.class);
                intent.putExtra("root",str);
                intent.putExtra("id",str1+"_"+i);
                intent.putExtra("date",date);
                intent.putExtra("time",st);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("selection",selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);
            }
        });

        car_seatbook4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=4;
                st=departure4_time.getText().toString();
                seat_price=seat_price4.getText().toString();

                intent = getIntent();
                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");


                intent = new Intent(Activity_available_car.this, Activity_car.class);
                intent.putExtra("root",str);
                intent.putExtra("id",str1+"_"+i);
                intent.putExtra("date",date);
                intent.putExtra("time",st);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("selection",selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);
            }
        });

        car_seatbook5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=5;
                st=departure5_time.getText().toString();
                seat_price=seat_price5.getText().toString();

                intent = getIntent();
                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");


                intent = new Intent(Activity_available_car.this, Activity_car.class);
                intent.putExtra("root",str);
                intent.putExtra("id",str1+"_"+i);
                intent.putExtra("date",date);
                intent.putExtra("time",st);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("selection",selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);
            }
        });

    }


}

