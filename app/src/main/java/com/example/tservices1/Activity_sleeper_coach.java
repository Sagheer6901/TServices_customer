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


public class Activity_sleeper_coach extends AppCompatActivity {

    Button sleeper_seat1,sleeper_seat2,sleeper_seat3,sleeper_seat4,sleeper_seat5,sleeper_seat6,sleeper_seat7,sleeper_seat8
            ,sleeper_seat9,sleeper_seat10,sleeper_seat11,sleeper_seat12,sleeper_seat13,sleeper_seat14,sleeper_seat15,
    sleeper_seat16,sleeper_seat17,sleeper_seat18,sleeper_seat19,sleeper_seat20,sleeper_seat21,sleeper_seat22,sleeper_seat23,
            sleeper_seat24,sleeper_seat25,sleeper_seat26,sleeper_seat27,sleeper_seat28,sleeper_seat29,sleeper_seat30,bookbutton;

    Intent intent;
    int i;
    String string1,string2,string3,string4,string5,string6,string7,string8,string9,string10,string11,string12,string13,string14
            ,string15,string16,string17,string18,string19,string20,string21,string22,string23,string24,string25,string26,string27
            ,string28,string29,string30;

    String emailstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeper_coach);


        intent =getIntent();
        final String str = intent.getStringExtra("root");
        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String time= intent.getStringExtra("time");
        final String seat_price=intent.getStringExtra("seat_price");
        final String selection= intent.getStringExtra("selection");
        emailstr = intent.getStringExtra("email");


        sleeper_seat1=findViewById(R.id.sleeper_1lb);
        sleeper_seat2=findViewById(R.id.sleeper_2lb);
        sleeper_seat3=findViewById(R.id.sleeper_3lb);
        sleeper_seat4=findViewById(R.id.sleeper_4lb);
        sleeper_seat5=findViewById(R.id.sleeper_5lb);
        sleeper_seat6=findViewById(R.id.sleeper_6lb);
        sleeper_seat7=findViewById(R.id.sleeper_7lb);
        sleeper_seat8=findViewById(R.id.sleeper_8lb);
        sleeper_seat9=findViewById(R.id.sleeper_9lb);
        sleeper_seat10=findViewById(R.id.sleeper_10lb);
        sleeper_seat11=findViewById(R.id.sleeper_11lb);
        sleeper_seat12=findViewById(R.id.sleeper_12lb);
        sleeper_seat13=findViewById(R.id.sleeper_13lb);
        sleeper_seat14=findViewById(R.id.sleeper_14lb);
        sleeper_seat15=findViewById(R.id.sleeper_15lb);
        sleeper_seat16=findViewById(R.id.sleeper_1ub);
        sleeper_seat17=findViewById(R.id.sleeper_2ub);
        sleeper_seat18=findViewById(R.id.sleeper_3ub);
        sleeper_seat19=findViewById(R.id.sleeper_4ub);
        sleeper_seat20=findViewById(R.id.sleeper_5ub);
        sleeper_seat21=findViewById(R.id.sleeper_6ub);
        sleeper_seat22=findViewById(R.id.sleeper_7ub);
        sleeper_seat23=findViewById(R.id.sleeper_8ub);
        sleeper_seat24=findViewById(R.id.sleeper_9ub);
        sleeper_seat25=findViewById(R.id.sleeper_10ub);
        sleeper_seat26=findViewById(R.id.sleeper_11ub);
        sleeper_seat27=findViewById(R.id.sleeper_12ub);
        sleeper_seat28=findViewById(R.id.sleeper_13ub);
        sleeper_seat29=findViewById(R.id.sleeper_14ub);
        sleeper_seat30=findViewById(R.id.sleeper_15ub);

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

        bookbutton=findViewById(R.id.book_button);

        sleeper_seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=1;
                string1=sleeper_seat1.getText().toString();
                sleeper_seat1.setEnabled(false);
                sleeper_seat1.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });

        sleeper_seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=2;
                string2=sleeper_seat2.getText().toString();
               sleeper_seat2.setEnabled(false);
                sleeper_seat2.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        sleeper_seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=3;
                string3=sleeper_seat3.getText().toString();
                sleeper_seat3.setEnabled(false);
                sleeper_seat3.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        sleeper_seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=4;
                string4=sleeper_seat4.getText().toString();
                sleeper_seat4.setEnabled(false);
                sleeper_seat4.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });
        sleeper_seat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=5;
                string5=sleeper_seat5.getText().toString();
                sleeper_seat5.setEnabled(false);
                sleeper_seat5.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=6;
                string6=sleeper_seat6.getText().toString();
                sleeper_seat6.setEnabled(false);
                sleeper_seat6.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=7;
                string7=sleeper_seat7.getText().toString();
                sleeper_seat7.setEnabled(false);
                sleeper_seat7.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=8;
                string8=sleeper_seat8.getText().toString();
                sleeper_seat8.setEnabled(false);
                sleeper_seat8.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=9;
                string9=sleeper_seat9.getText().toString();
                sleeper_seat9.setEnabled(false);
                sleeper_seat9.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=10;
                string10=sleeper_seat10.getText().toString();
                sleeper_seat10.setEnabled(false);
                sleeper_seat10.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=11;
                string11=sleeper_seat11.getText().toString();
                sleeper_seat11.setEnabled(false);
                sleeper_seat11.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=12;
                string12=sleeper_seat12.getText().toString();
                sleeper_seat12.setEnabled(false);
                sleeper_seat12.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=13;
                string13=sleeper_seat13.getText().toString();
                sleeper_seat13.setEnabled(false);
                sleeper_seat13.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=14;
                string14=sleeper_seat14.getText().toString();
                sleeper_seat14.setEnabled(false);
                sleeper_seat14.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=15;
                string15=sleeper_seat15.getText().toString();
                sleeper_seat15.setEnabled(false);
                sleeper_seat15.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=16;
                string16=sleeper_seat16.getText().toString();
                sleeper_seat16.setEnabled(false);
                sleeper_seat16.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });sleeper_seat17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=17;
                string17=sleeper_seat17.getText().toString();
                sleeper_seat17.setEnabled(false);
                sleeper_seat17.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
            }
        });


        bookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent=new Intent(Activity_sleeper_coach.this,Activity_payment.class);
                intent.putExtra("root",str);
                intent.putExtra("id",str1);
                intent.putExtra("date",date);
                intent.putExtra("time",time);
                intent.putExtra("seat_price",seat_price);
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
                intent.putExtra("email",emailstr);
               startActivity(intent);
            }
        });
    }

    public void check_seat1(){

        final String str1 = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String selection= intent.getStringExtra("selection");

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("1 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat1.setEnabled(false);
                        sleeper_seat1.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("2 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat2.setEnabled(false);

                        sleeper_seat2.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("3 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat3.setEnabled(false);

                        sleeper_seat3.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("4 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat4.setEnabled(false);

                        sleeper_seat4.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("5 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat5.setEnabled(false);

                        sleeper_seat5.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("6 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat6.setEnabled(false);

                        sleeper_seat6.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("7 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat7.setEnabled(false);

                        sleeper_seat7.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("8 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat8.setEnabled(false);

                        sleeper_seat8.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("9 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat9.setEnabled(false);

                        sleeper_seat9.setBackgroundColor(getResources().getColor(R.color.buttonRed));

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

        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date+str1).document("10 LB");
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot doc = task.getResult();
                    if (doc.exists()) {
                        sleeper_seat10.setEnabled(false);

                        sleeper_seat10.setBackgroundColor(getResources().getColor(R.color.buttonRed));

                        // Toast.makeText(Activity_sign_up.this, "username already exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}
