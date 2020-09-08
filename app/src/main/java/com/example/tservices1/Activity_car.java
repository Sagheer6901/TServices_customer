package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class Activity_car extends AppCompatActivity {
    Button car_seat1, car_seat2, car_seat3, car_seat4, book_button;

    int i;
    String string1, string2, string3, string4;
    Intent intent;
    String emailstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        intent = getIntent();
        String str = intent.getStringExtra("root");
        String str1 = intent.getStringExtra("id");
         String date = intent.getStringExtra("date");
         final String time = intent.getStringExtra("time");
         final String seat_price = intent.getStringExtra("seat_price");
        String selection = intent.getStringExtra("selection");

        car_seat1 = findViewById(R.id.car_seat1);
        car_seat2 = findViewById(R.id.car_seat2);
        car_seat3 = findViewById(R.id.car_seat3);
        car_seat4 = findViewById(R.id.car_seat4);

        check_seat1();
        check_seat2();
        check_seat3();
        check_seat4();

        book_button = findViewById(R.id.book_button);

        car_seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1;
                string1 = car_seat1.getText().toString();
                //car_seat1.setEnabled(false);
                car_seat1.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });

        car_seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 2;
                string2 = car_seat2.getText().toString();
//                car_seat2.setEnabled(false);
                car_seat2.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        car_seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 3;
                string3 = car_seat3.getText().toString();
//                car_seat3.setEnabled(false);
                car_seat3.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        car_seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 4;
                string4 = car_seat4.getText().toString();
//                car_seat4.setEnabled(false);
                car_seat4.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });


        book_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = intent.getStringExtra("root");
                String str1 = intent.getStringExtra("id");
                String date = intent.getStringExtra("date");
                String selection = intent.getStringExtra("selection");
                emailstr = intent.getStringExtra("email");

                intent = new Intent(Activity_car.this, Activity_payment.class);
                intent.putExtra("root", str);
                intent.putExtra("id", str1);
                intent.putExtra("date", date);
                intent.putExtra("time", time);
                intent.putExtra("seat_price", seat_price);
                intent.putExtra("seat1", string1);
                intent.putExtra("seat2", string2);
                intent.putExtra("seat3", string3);
                intent.putExtra("seat4", string4);
                intent.putExtra("selection", selection);
                intent.putExtra("email",emailstr);

                startActivity(intent);

            }
        });
    }

    private void check_seat4() {

        final String str = intent.getStringExtra("root");
        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String time= intent.getStringExtra("time");
        final String seat_price=intent.getStringExtra("seat_price");
        final String selection= intent.getStringExtra("selection");
        emailstr = intent.getStringExtra("email");


        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("C4");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        car_seat4.setEnabled(false);
                        car_seat4.setBackgroundColor(getResources().getColor(R.color.buttonRed));
                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                    else {

                    }
                }
            }
        });

    }

    private void check_seat3() {

        final String str = intent.getStringExtra("root");
        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String time= intent.getStringExtra("time");
        final String seat_price=intent.getStringExtra("seat_price");
        final String selection= intent.getStringExtra("selection");
        emailstr = intent.getStringExtra("email");


        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("C3");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        car_seat3.setEnabled(false);
                        car_seat3.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                    else {

                    }
                }
            }
        });

    }

    private void check_seat2() {

        final String str = intent.getStringExtra("root");
        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String time= intent.getStringExtra("time");
        final String seat_price=intent.getStringExtra("seat_price");
        final String selection= intent.getStringExtra("selection");
        emailstr = intent.getStringExtra("email");


        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("C2");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        car_seat2.setEnabled(false);
                        car_seat2.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                    else {

                    }
                }
            }
        });

    }


    public void check_seat1(){

        final String str = intent.getStringExtra("root");
        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String time= intent.getStringExtra("time");
        final String seat_price=intent.getStringExtra("seat_price");
        final String selection= intent.getStringExtra("selection");
        emailstr = intent.getStringExtra("email");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("C1");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        car_seat1.setEnabled(false);

                            car_seat1.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                    else {

                    }
                }
            }
        });
    }
}



