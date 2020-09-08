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


public class Activity_twoseater_coach extends AppCompatActivity {
    Button twoseaer_seat1, twoseaer_seat2, twoseaer_seat3, twoseaer_seat4, twoseaer_seat5, twoseaer_seat6, twoseaer_seat7, twoseaer_seat8, twoseaer_seat9, twoseaer_seat10, twoseaer_seat11, twoseaer_seat12, twoseaer_seat13, twoseaer_seat14, twoseaer_seat15, twoseaer_seat16, twoseaer_seat17, bookbutton;

    Intent intent;
    int i;
    String string1, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30;
    String emailstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoseater_coach);


        intent = getIntent();
        final String str = intent.getStringExtra("name");
        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String time = intent.getStringExtra("time");
        final String seat_price = intent.getStringExtra("seat_price");
        final String selection = intent.getStringExtra("selection");
        emailstr = intent.getStringExtra("email");



        twoseaer_seat1 = findViewById(R.id.twoseater_1ls);
        twoseaer_seat2 = findViewById(R.id.twoseater_2rs);
        twoseaer_seat3 = findViewById(R.id.twoseater_3rs);
        twoseaer_seat4 = findViewById(R.id.twoseater_4ls);
        twoseaer_seat5 = findViewById(R.id.twoseater_5ls);
        twoseaer_seat6 = findViewById(R.id.twoseater_6rs);
        twoseaer_seat7 = findViewById(R.id.twoseater_7rs);
        twoseaer_seat8 = findViewById(R.id.twoseater_8ls);
        twoseaer_seat9 = findViewById(R.id.twoseater_9ls);
        twoseaer_seat10 = findViewById(R.id.twoseater_10rs);
        twoseaer_seat11 = findViewById(R.id.twoseater_11rs);
        twoseaer_seat12 = findViewById(R.id.twoseater_12ls);
        twoseaer_seat13 = findViewById(R.id.twoseater_13ls);
        twoseaer_seat14 = findViewById(R.id.twoseater_14rs);
        twoseaer_seat15 = findViewById(R.id.twoseater_15rs);
        twoseaer_seat16 = findViewById(R.id.twoseater_16ls);
        twoseaer_seat17 = findViewById(R.id.twoseater_17ls);

        check_seat1();
        check_seat2();
        check_seat3();
        check_seat4();
        check_seat5();
        check_seat6();
        check_seat7();
        check_seat8();
        check_seat9();
        check_seat10();

        bookbutton = findViewById(R.id.book_button);

        twoseaer_seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1;
                string1 = twoseaer_seat1.getText().toString();
                twoseaer_seat1.setEnabled(false);
                twoseaer_seat1.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });

        twoseaer_seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 2;
                string2 = twoseaer_seat2.getText().toString();
                twoseaer_seat2.setEnabled(false);
                twoseaer_seat2.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 3;
                string3 = twoseaer_seat3.getText().toString();
                twoseaer_seat3.setEnabled(false);
                twoseaer_seat3.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 4;
                string4 = twoseaer_seat4.getText().toString();
                twoseaer_seat4.setEnabled(false);
                twoseaer_seat4.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 5;
                string5 = twoseaer_seat5.getText().toString();
                twoseaer_seat5.setEnabled(false);
                twoseaer_seat5.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 6;
                string6 = twoseaer_seat6.getText().toString();
                twoseaer_seat6.setEnabled(false);
                twoseaer_seat6.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 7;
                string7 = twoseaer_seat7.getText().toString();
                twoseaer_seat7.setEnabled(false);
                twoseaer_seat7.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 8;
                string8 = twoseaer_seat8.getText().toString();
                twoseaer_seat8.setEnabled(false);
                twoseaer_seat8.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 9;
                string9 = twoseaer_seat9.getText().toString();
                twoseaer_seat9.setEnabled(false);
                twoseaer_seat9.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 10;
                string10 = twoseaer_seat10.getText().toString();
                twoseaer_seat10.setEnabled(false);
                twoseaer_seat10.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 11;
                string11 = twoseaer_seat11.getText().toString();
                twoseaer_seat11.setEnabled(false);
                twoseaer_seat11.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 12;
                string12 = twoseaer_seat12.getText().toString();
                twoseaer_seat12.setEnabled(false);
                twoseaer_seat12.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 13;
                string13 = twoseaer_seat13.getText().toString();
                twoseaer_seat13.setEnabled(false);
                twoseaer_seat13.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 14;
                string14 = twoseaer_seat14.getText().toString();
                twoseaer_seat14.setEnabled(false);
                twoseaer_seat14.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 15;
                string15 = twoseaer_seat15.getText().toString();
                twoseaer_seat15.setEnabled(false);
                twoseaer_seat15.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 16;
                string16 = twoseaer_seat16.getText().toString();
                twoseaer_seat16.setEnabled(false);
                twoseaer_seat16.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        twoseaer_seat17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 17;
                string17 = twoseaer_seat17.getText().toString();
                twoseaer_seat17.setEnabled(false);
                twoseaer_seat17.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });

        bookbutton = findViewById(R.id.book_button2);
        bookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Activity_twoseater_coach.this, Activity_payment.class);
                intent.putExtra("root", str);
                intent.putExtra("id", str1);
                intent.putExtra("date", date);
                intent.putExtra("time", time);
                intent.putExtra("seat_price", seat_price);
                intent.putExtra("selection", selection);
                intent.putExtra("seat1", string1);
                intent.putExtra("seat2", string2);
                intent.putExtra("seat3", string3);
                intent.putExtra("seat4", string4);
                intent.putExtra("seat5", string5);
                intent.putExtra("seat6", string6);
                intent.putExtra("seat7", string7);
                intent.putExtra("seat8", string8);
                intent.putExtra("seat9", string9);
                intent.putExtra("seat10", string10);
                intent.putExtra("seat11", string11);
                intent.putExtra("seat12", string12);
                intent.putExtra("seat13", string13);
                intent.putExtra("seat14", string14);
                intent.putExtra("seat15", string15);
                intent.putExtra("seat16", string16);
                intent.putExtra("seat17", string17);
                intent.putExtra("email",emailstr);
                startActivity(intent);

            }
        });
    }


    public void check_seat1(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("1 LS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat1.setEnabled(false);

                        twoseaer_seat1.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


    public void check_seat2(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("2 RS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat2.setEnabled(false);

                        twoseaer_seat2.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat3(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("3 RS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat3.setEnabled(false);

                        twoseaer_seat3.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat4(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("4 LS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat4.setEnabled(false);

                        twoseaer_seat4.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat5(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("5 LS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat5.setEnabled(false);

                        twoseaer_seat5.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat6(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("6 RS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat6.setEnabled(false);

                        twoseaer_seat6.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat7(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("7 RS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat7.setEnabled(false);

                        twoseaer_seat7.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat8(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("8 LS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat8.setEnabled(false);

                        twoseaer_seat8.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat9(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("9 LS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat9.setEnabled(false);

                        twoseaer_seat9.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void check_seat10(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("10 RS");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        twoseaer_seat10.setEnabled(false);

                        twoseaer_seat10.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}