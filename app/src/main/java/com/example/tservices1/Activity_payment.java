package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity_payment extends AppCompatActivity {
    Button payment_visa,payment_mastercard,payment_easypaisa,payment_jazzcash;
    Intent intent;
    String emailstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        intent=getIntent();
        final String str = intent.getStringExtra("root");
        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String time=intent.getStringExtra("time");
        final String seat_price=intent.getStringExtra("seat_price");
        final String selection= intent.getStringExtra("selection");
        final String string1=intent.getStringExtra("seat1");
        final String string2=intent.getStringExtra("seat2");
        final String string3=intent.getStringExtra("seat3");
        final String string4=intent.getStringExtra("seat4");
        final String string5=intent.getStringExtra("seat5");
        final String string6=intent.getStringExtra("seat6");
        final String string7=intent.getStringExtra("seat7");
        final String string8=intent.getStringExtra("seat8");
        final String string9=intent.getStringExtra("seat9");
        final String string10=intent.getStringExtra("seat10");
        final String string11=intent.getStringExtra("seat11");
        final String string12=intent.getStringExtra("seat12");
        final String string13=intent.getStringExtra("seat13");
        final String string14=intent.getStringExtra("seat14");
        final String string15=intent.getStringExtra("seat15");
        final String string16=intent.getStringExtra("seat16");
        final String string17=intent.getStringExtra("seat17");
        emailstr = intent.getStringExtra("email");

        payment_visa=findViewById(R.id.payment_visa);
        payment_mastercard=findViewById(R.id.payment_mastercard);
        payment_easypaisa=findViewById(R.id.payment_easypaisa);
        payment_jazzcash=findViewById(R.id.payment_jazzcash);

        payment_visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(Activity_payment.this,Activity_card_info.class);
                intent.putExtra("pay_type","Visa");
                intent.putExtra("root",str);
                intent.putExtra("id",str1);
                intent.putExtra("date",date);
                intent.putExtra("selection",selection);
                intent.putExtra("seat1",string1);
                intent.putExtra("seat2",string2);
                intent.putExtra("seat3",string3);
                intent.putExtra("seat4",string4);
                intent.putExtra("seat5",string5);
                intent.putExtra("seat6",string6);
                intent.putExtra("seat7",string7);
                intent.putExtra("seat8",string8);
                intent.putExtra("seat9",string9);
                intent.putExtra("seat10",string10);
                intent.putExtra("seat11",string11);
                intent.putExtra("seat12",string12);
                intent.putExtra("seat13",string13);
                intent.putExtra("seat14",string14);
                intent.putExtra("seat15",string15);
                intent.putExtra("seat16",string16);
                intent.putExtra("seat17",string17);
                intent.putExtra("time",time);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("email",emailstr);
                startActivity(intent);
            }
        });

        payment_mastercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(Activity_payment.this,Activity_card_info.class);
                intent.putExtra("pay_type","Mastercard");
                intent.putExtra("root",str);
                intent.putExtra("id",str1);
                intent.putExtra("date",date);
                intent.putExtra("selection",selection);
                intent.putExtra("seat1",string1);
                intent.putExtra("seat2",string2);
                intent.putExtra("seat3",string3);
                intent.putExtra("seat4",string4);
                intent.putExtra("seat5",string5);
                intent.putExtra("seat6",string6);
                intent.putExtra("seat7",string7);
                intent.putExtra("seat8",string8);
                intent.putExtra("seat9",string9);
                intent.putExtra("seat10",string10);
                intent.putExtra("seat11",string11);
                intent.putExtra("seat12",string12);
                intent.putExtra("seat13",string13);
                intent.putExtra("seat14",string14);
                intent.putExtra("seat15",string15);
                intent.putExtra("seat16",string16);
                intent.putExtra("seat17",string17);
                intent.putExtra("time",time);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("email",emailstr);
                startActivity(intent);
            }
        });

        payment_easypaisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(Activity_payment.this,Activity_card_info.class);
                intent.putExtra("pay_type","Easypaisa");
                intent.putExtra("root",str);
                intent.putExtra("id",str1);
                intent.putExtra("date",date);
                intent.putExtra("selection",selection);
                intent.putExtra("seat1",string1);
                intent.putExtra("seat2",string2);
                intent.putExtra("seat3",string3);
                intent.putExtra("seat4",string4);
                intent.putExtra("seat5",string5);
                intent.putExtra("seat6",string6);
                intent.putExtra("seat7",string7);
                intent.putExtra("seat8",string8);
                intent.putExtra("seat9",string9);
                intent.putExtra("seat10",string10);
                intent.putExtra("seat11",string11);
                intent.putExtra("seat12",string12);
                intent.putExtra("seat13",string13);
                intent.putExtra("seat14",string14);
                intent.putExtra("seat15",string15);
                intent.putExtra("seat16",string16);
                intent.putExtra("seat17",string17);
                intent.putExtra("time",time);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("email",emailstr);
                startActivity(intent);
            }
        });

        payment_jazzcash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(Activity_payment.this,Activity_card_info.class);
                intent.putExtra("pay_type","Jazzcash");
                intent.putExtra("root",str);
                intent.putExtra("id",str1);
                intent.putExtra("date",date);
                intent.putExtra("selection",selection);
                intent.putExtra("seat1",string1);
                intent.putExtra("seat2",string2);
                intent.putExtra("seat3",string3);
                intent.putExtra("seat4",string4);
                intent.putExtra("seat5",string5);
                intent.putExtra("seat6",string6);
                intent.putExtra("seat7",string7);
                intent.putExtra("seat8",string8);
                intent.putExtra("seat9",string9);
                intent.putExtra("seat10",string10);
                intent.putExtra("seat11",string11);
                intent.putExtra("seat12",string12);
                intent.putExtra("seat13",string13);
                intent.putExtra("seat14",string14);
                intent.putExtra("seat15",string15);
                intent.putExtra("seat16",string16);
                intent.putExtra("seat17",string17);
                intent.putExtra("time",time);
                intent.putExtra("seat_price",seat_price);
                intent.putExtra("email",emailstr);
                startActivity(intent);
            }
        });

    }

}
