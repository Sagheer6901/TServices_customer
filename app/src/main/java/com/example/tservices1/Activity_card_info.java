package com.example.tservices1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Activity_card_info extends AppCompatActivity {
    TextView payment_type, seatprice;
    EditText mb_number, card_number, verification_code, full_name;
    private String mbnumber, cardnumber, verificationcode, fullname;

    Intent intent;
    Button pay_button;
    String seat_str = "";
    String emailstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_info);

        intent = getIntent();
        String pay_type = intent.getStringExtra("pay_type");
        final String string1 = intent.getStringExtra("seat1");
        final String string2 = intent.getStringExtra("seat2");
        final String string3 = intent.getStringExtra("seat3");
        final String string4 = intent.getStringExtra("seat4");
        final String v_id = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        final String from_to = intent.getStringExtra("root");
        final String time = intent.getStringExtra("time");
        final String seat_price = intent.getStringExtra("seat_price");
        final String selection = intent.getStringExtra("selection");
        final String string5 = intent.getStringExtra("seat5");
        final String string6 = intent.getStringExtra("seat6");
        final String string7 = intent.getStringExtra("seat7");
        final String string8 = intent.getStringExtra("seat8");
        final String string9 = intent.getStringExtra("seat9");
        final String string10 = intent.getStringExtra("seat10");
        final String string11 = intent.getStringExtra("seat11");
        final String string12 = intent.getStringExtra("seat12");
        final String string13 = intent.getStringExtra("seat13");
        final String string14 = intent.getStringExtra("seat14");
        final String string15 = intent.getStringExtra("seat15");
        final String string16 = intent.getStringExtra("seat16");
        final String string17 = intent.getStringExtra("seat17");
        emailstr = intent.getStringExtra("email");

        if (string1 != null) {
            seat_str = string1 + " ";
        }
        if (string2 != null) {
            seat_str = seat_str + string2 + " ";
        }
        if (string3 != null) {
            seat_str = seat_str + string3 + " ";
        }
        if (string4 != null) {
            seat_str = seat_str + string4 + " ";
        }
        if (string5 != null) {
            seat_str = seat_str + string5 + " ";
        }
        if (string6 != null) {
            seat_str = seat_str + string6 + " ";
        }
        if (string7 != null) {
            seat_str = seat_str + string7 + " ";
        }
        if (string8 != null) {
            seat_str = seat_str + string8 + " ";
        }
        if (string9 != null) {
            seat_str = seat_str + string9 + " ";
        }
        if (string10 != null) {
            seat_str = seat_str + string10 + " ";
        }
        if (string11 != null) {
            seat_str = seat_str + string11 + " ";
        }
        if (string12 != null) {
            seat_str = seat_str + string12 + " ";
        }
        if (string13 != null) {
            seat_str = seat_str + string13 + " ";
        }
        if (string14 != null) {
            seat_str = seat_str + string14 + " ";
        }
        if (string15 != null) {
            seat_str = seat_str + string15 + " ";
        }
        if (string16 != null) {
            seat_str = seat_str + string16 + " ";
        }
        if (string17 != null) {
            seat_str = seat_str + string17 + " ";
        }


        mb_number = (EditText) findViewById(R.id.number);
        card_number = (EditText) findViewById(R.id.cardnumber);
        verification_code = (EditText) findViewById(R.id.veri_code);
        full_name = (EditText) findViewById(R.id.full_name1);

        payment_type = (TextView) findViewById(R.id.payment_type);
        payment_type.setText(pay_type);

        seatprice = (TextView) findViewById(R.id.seatprice);
        seatprice.setText(seat_price);


        pay_button = findViewById(R.id.pay_button);

        pay_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initialize();
                if (!validate()) {
                    Toast.makeText(getApplicationContext(), "Invalid Payment Detail", Toast.LENGTH_SHORT).show();
                }
                else {

                    if (string1 != null) {

                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string1);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();

                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    }
                                    else {

                                        Toast.makeText(Activity_card_info.this, emailstr, Toast.LENGTH_SHORT).show();
                                        //Log.d("fasdfs",emailstr);
                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);
                                        user_data.put("Email",emailstr);

                                        db.collection("Services").document(selection).collection(date + v_id).document(string1).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();

                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);


                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string2 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string2);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();

                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    }
                                    else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);

                                        db.collection("Services").document(selection).collection(date + v_id).document(string2).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);

                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string3 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string3);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);

                                        db.collection("Services").document(selection).collection(date + v_id).document(string3).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);


                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string4 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string4);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Service", selection);
                                        user_data.put("Mnumber",string);


                                        db.collection("Services").document(selection).collection(date + v_id).document(string4).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);

                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string5 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string5);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Service", selection);
                                        user_data.put("Mnumber",string);


                                        db.collection("Services").document(selection).collection(date + v_id).document(string5).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);


                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string6 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string6);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);


                                        db.collection("Services").document(selection).collection(date + v_id).document(string6).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);

                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string7 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string7);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);


                                        db.collection("Services").document(selection).collection(date + v_id).document(string7).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);

                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string8 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string8);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);


                                        db.collection("Services").document(selection).collection(date + v_id).document(string8).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);

                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string9 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string9);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);


                                        db.collection("Services").document(selection).collection(date + v_id).document(string9).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();
                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);

                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                    if (string10 != null) {


                        DocumentReference docref = FirebaseFirestore.getInstance().collection("Services").document(selection).collection(date + v_id).document(string10);
                        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                if (task.isSuccessful()) {
                                    DocumentSnapshot doc = task.getResult();
                                    if (doc.exists()) {
                                        Toast.makeText(Activity_card_info.this, "username already exist", Toast.LENGTH_SHORT).show();
                                    } else {

                                        Toast.makeText(Activity_card_info.this, "success", Toast.LENGTH_SHORT).show();

                                        String string = mb_number.getText().toString();
                                        String string_name = full_name.getText().toString();
                                        FirebaseFirestore db = FirebaseFirestore.getInstance();
                                        Map<String, Object> user_data = new HashMap<>();
                                        user_data.put("Route", from_to);
                                        user_data.put("Vehicle id", v_id);
                                        user_data.put("Date", date);
                                        user_data.put("Seat", seat_str);
                                        user_data.put("Time", time);
                                        user_data.put("Full_name", string_name);
                                        user_data.put("Servive", selection);
                                        user_data.put("Mnumber",string);

                                        db.collection("Services").document(selection).collection(date + v_id).document(string10).set(user_data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            ////
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task1) {
                                                if (task1.isSuccessful()) {
                                                    String string = mb_number.getText().toString();
                                                    String string_name = full_name.getText().toString();
                                                    Toast.makeText(Activity_card_info.this, "data added", Toast.LENGTH_SHORT).show();

                                                    intent = new Intent(Activity_card_info.this, Activity_successful.class);
                                                    intent.putExtra("root", from_to);
                                                    intent.putExtra("id", v_id);
                                                    intent.putExtra("date", date);
                                                    intent.putExtra("seat_no", seat_str);
                                                    intent.putExtra("time", time);
                                                    intent.putExtra("mb_number", string);
                                                    intent.putExtra("seat_price", seat_price);
                                                    intent.putExtra("full_name", string_name);
                                                    intent.putExtra("selection", selection);
                                                    intent.putExtra("email",emailstr);

                                                    startActivity(intent);
                                                }
                                            }
                                        });


                                    }
                                }
                            }
                        });

                    }
                }
            }
        });
    }





    public boolean validate() {

        boolean valid = true;
        if (fullname.isEmpty() || fullname.length() > 32) {
            full_name.setError("Please Enter Valid Name");
            valid = false;
        }
        if (mbnumber.isEmpty() || mbnumber.length() > 10) {
            mb_number.setError("Please Enter Valid Mobile Number");
            valid = false;
        }
        if (cardnumber.isEmpty() || cardnumber.length() != 16) {
            card_number.setError("Please Enter Valid Card Number");
            valid = false;
        }
        if (verificationcode.isEmpty() || verificationcode.length() != 3) {
            verification_code.setError("Please Enter Valid Verification Number");
            valid = false;
        }

        return valid;

    }

    final public void initialize() {


        fullname = full_name.getText().toString();
        mbnumber = mb_number.getText().toString();
        cardnumber = card_number.getText().toString();
        verificationcode = verification_code.getText().toString();

    }

}