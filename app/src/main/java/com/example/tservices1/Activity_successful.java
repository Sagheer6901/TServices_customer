package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_successful extends AppCompatActivity {
    Button seat_again;
    TextView fromto,vehicle_id,departure_date,departure_time,seatno,seatprice,mbnumber,fullname;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful);

        intent=getIntent();
        String v_id= intent.getStringExtra("id");
        String date= intent.getStringExtra("date");
        String from_to=intent.getStringExtra("root");
        String seat_no = intent.getStringExtra("seat_no");
        String time=intent.getStringExtra("time");
        String mb_number=intent.getStringExtra("mb_number");
        String seat_price= intent.getStringExtra("seat_price");
        String full_name= intent.getStringExtra("full_name");
        final String selection=intent.getStringExtra("selection");
        String email = intent.getStringExtra("email");

        fromto=findViewById(R.id.from_to);
        vehicle_id=findViewById(R.id.vehicle_id);
        departure_date=findViewById(R.id.departure_date);
        departure_time=findViewById(R.id.departure_time);
        seatno=findViewById(R.id.seat_no);
        seatprice=findViewById(R.id.seat_price);
        mbnumber=findViewById(R.id.mb_number);
        fullname = findViewById(R.id.fullname);


        fromto.setText(from_to);
        vehicle_id.setText(v_id);
        departure_date.setText(date);
        departure_time.setText(time);
        seatno.setText(seat_no);
        seatprice.setText(seat_price);

        mbnumber.setText(mb_number);
        fullname.setText(full_name);

        seat_again=findViewById(R.id.confirm_seat);
        seat_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             intent=new Intent(Activity_successful.this,Activity_via_guest.class);
                intent.putExtra("selection",selection);
                startActivity(intent);
            }
        });
        onBackPressed();
    }

    public void onBackPressed() {
    }
}
