package com.example.tservices1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Activity_via_guest extends AppCompatActivity {

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    Button khitoskr,khitolhr,khitoisl,skrtokhi,skrtolhr,skrtoisl,lhrtokhi,lhrtoskr,lhrtoisl,isltokhi,isltoskr,isltolhr;

    Intent intent;
    String id;
    String emailstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_via_guest);

        khitoskr=findViewById(R.id.khi_to_skr);
        khitolhr=findViewById(R.id.khi_to_lhr);
        khitoisl=findViewById(R.id.kh_to_isl);

        skrtokhi=findViewById(R.id.skr_to_khi);
        skrtolhr=findViewById(R.id.skr_to_lhr);
        skrtoisl=findViewById(R.id.skr_to_isl);

        lhrtokhi=findViewById(R.id.lhr_to_khi);
        lhrtoskr=findViewById(R.id.lhr_to_skr);
        lhrtoisl=findViewById(R.id.lhr_to_isl);

        isltokhi=findViewById(R.id.isl_to_khi);
        isltoskr=findViewById(R.id.isl_to_skr);
        isltolhr=findViewById(R.id.isl_to_lhr);

        mDisplayDate = (TextView) findViewById(R.id.mDisplayDate);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Activity_via_guest.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d("", "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "_" + day + "_" + year;
                mDisplayDate.setText(date);


                String str=mDisplayDate.getText().toString();
                if (str.isEmpty()){
                    Toast.makeText(getBaseContext(),"pick the date first",Toast.LENGTH_LONG).show();
                }
                else {

                    khitoskr.setEnabled(true);
                    khitolhr.setEnabled(true);
                    khitoisl.setEnabled(true);

                    skrtokhi.setEnabled(true);
                    skrtolhr.setEnabled(true);
                    skrtoisl.setEnabled(true);

                    lhrtokhi.setEnabled(true);
                    lhrtoskr.setEnabled(true);
                    lhrtoisl.setEnabled(true);

                    isltokhi.setEnabled(true);
                    isltoskr.setEnabled(true);
                    isltolhr.setEnabled(true);

                    khitoskr.setOnClickListener(listener);
                    khitolhr.setOnClickListener(listener);
                    khitoisl.setOnClickListener(listener);

                    skrtokhi.setOnClickListener(listener);
                    skrtolhr.setOnClickListener(listener);
                    skrtoisl.setOnClickListener(listener);

                    lhrtokhi.setOnClickListener(listener);
                    lhrtoskr.setOnClickListener(listener);
                    lhrtoisl.setOnClickListener(listener);

                    isltokhi.setOnClickListener(listener);
                    isltoskr.setOnClickListener(listener);
                    isltolhr.setOnClickListener(listener);
                }
            }
        };

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            intent = getIntent();
            String str = intent.getStringExtra("selection");
            emailstr = intent.getStringExtra("email");

            if (str.equals("Car")) {

                if (v.equals(khitoskr)){
                    id = "Car_Khi_To_Skr";
                }
                else if (v.equals(khitolhr)){
                    id = "Car_Khi_To_Lhr";
                }
                else if (v.equals(khitoisl)){
                    id = "Car_Khi_To_Isl";
                }
                else if (v.equals(skrtokhi)){
                    id = "Car_Skr_To_Khi";
                }
                else if (v.equals(skrtolhr)){
                    id = "Car_Skr_To_Lhr";
                }
                else if (v.equals(skrtoisl)){
                    id = "Car_Skr_To_Isl";
                }
                else if (v.equals(lhrtokhi)){
                    id = "Car_Lhr_To_Khi";
                }
                else if (v.equals(lhrtoskr)){
                    id = "Car_Lhr_To_Skr";
                }
                else if (v.equals(lhrtoisl)){
                    id = "Car_Lhr_To_Isl";
                }
                else if (v.equals(isltokhi)){
                    id = "Car_Isl_To_Khi";
                }
                else if (v.equals(isltoskr)){
                    id = "Car_Isl_To_Skr";
                }
                else if (v.equals(isltolhr)){
                    id = "Car_Isl_To_Lhr";
                }

                intent = new Intent(Activity_via_guest.this, Activity_available_car.class);
                intent.putExtra("email",emailstr);
                intent.putExtra ( "root",((Button)v).getText());
                intent.putExtra("id",id);
                intent.putExtra("date",mDisplayDate.getText());
                intent.putExtra("selection",str);
                startActivity(intent);
            }

            else if (str.equals("Sleeper")){

                if (v.equals(khitoskr)) {
                    id = "Sleeper_Khi_To_Skr";
                } else if (v.equals(khitolhr)) {
                    id = "Sleeper_Khi_To_Lhr";
                } else if (v.equals(khitoisl)) {
                    id = "Sleeper_Khi_To_Isl";
                } else if (v.equals(skrtokhi)) {
                    id = "Sleeper_Skr_To_Khi";
                } else if (v.equals(skrtolhr)) {
                    id = "Sleeper_Skr_To_Lhr";
                } else if (v.equals(skrtoisl)) {
                    id = "Sleeper_Skr_To_Isl";
                } else if (v.equals(lhrtokhi)) {
                    id = "Sleeper_Lhr_To_Khi";
                } else if (v.equals(lhrtoskr)) {
                    id = "Sleeper_Lhr_To_Skr";
                } else if (v.equals(lhrtoisl)) {
                    id = "Sleeper_Lhr_To_Isl";
                } else if (v.equals(isltokhi)) {
                    id = "Sleeper_Isl_To_Khi";
                } else if (v.equals(isltoskr)) {
                    id = "Sleeper_Isl_To_Skr";
                } else if (v.equals(isltolhr)) {
                    id = "Sleeper_Isl_To_Lhr";
                }
                intent = new Intent(Activity_via_guest.this, Activity_available_sleeper.class);
                intent.putExtra("email",emailstr);
                intent.putExtra ( "root",((Button)v).getText());
                intent.putExtra("id",id);
                intent.putExtra("date",mDisplayDate.getText());
                intent.putExtra("selection",str);
                startActivity(intent);
            }
            else if (str.equals("Two Seater")){

                if (v.equals(khitoskr)){
                    id = "Two_Seater_Khi_To_Skr";
                }
                else if (v.equals(khitolhr)){
                    id = "Two_Seater_Khi_To_Lhr";
                }
                else if (v.equals(khitoisl)){
                    id = "Two_Seater_Khi_To_Isl";
                }
                else if (v.equals(skrtokhi)){
                    id = "Two_Seater_Skr_To_Khi";
                }
                else if (v.equals(skrtolhr)){
                    id = "Two_Seater_Skr_To_Lhr";
                }
                else if (v.equals(skrtoisl)){
                    id = "Two_Seater_Skr_To_isl";
                }
                else if (v.equals(lhrtokhi)){
                    id = "Two_Seater_Lhr_To_Khi";
                }
                else if (v.equals(lhrtoskr)){
                    id = "Two_Seater_Lhr_To_Skr";
                }
                else if (v.equals(lhrtoisl)){
                    id = "Two_Seater_Lhr_To_Isl";
                }
                else if (v.equals(isltokhi)){
                    id = "Two_Seater_Isl_To_Khi";
                }
                else if (v.equals(isltoskr)){
                    id = "Two_Seater_Isl_To_Skr";
                }
                else if (v.equals(isltolhr)){
                    id = "Two_Seater_Isl_To_Lhr";
                }

                intent = new Intent(Activity_via_guest.this, Activity_available_twoseater.class);
                intent.putExtra("email",emailstr);
                intent.putExtra ( "root",((Button)v).getText());
                intent.putExtra("id",id);
                intent.putExtra("date",mDisplayDate.getText());
                intent.putExtra("selection",str);
                startActivity(intent);
            }
        }
    };

}
