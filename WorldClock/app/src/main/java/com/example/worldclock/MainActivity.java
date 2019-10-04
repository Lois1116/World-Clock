package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    public Button TimeZoneButton1;
    public Button TimeZoneButton2;
    public ConstraintLayout sydneytime;
    public ConstraintLayout londontime;
    public ConstraintLayout newyorktime;
    public ConstraintLayout tokyotime;
    public ConstraintLayout rometime;
    public TextView CityView;
    public TextView TimeZoneTextview;
    public ImageView CityImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimeZoneButton1 = (Button) findViewById(R.id.get12time);
        TimeZoneButton2 = (Button) findViewById(R.id.get24time);

        sydneytime = findViewById(R.id.sydneytime);
        CityView = sydneytime.findViewById(R.id.city);
        CityView.setText("Sydney");
        CityImageView = sydneytime.findViewById(R.id.imageView);
        CityImageView.setImageResource(R.drawable.sydney);

        londontime = findViewById(R.id.londontime);
        CityView = londontime.findViewById(R.id.city);
        CityView.setText("London");
        CityImageView = londontime.findViewById(R.id.imageView);
        CityImageView.setImageResource(R.drawable.london);


        newyorktime = findViewById(R.id.newyorktime);
        CityView = newyorktime.findViewById(R.id.city);
        CityView.setText("New York");
        CityImageView = newyorktime.findViewById(R.id.imageView);
        CityImageView.setImageResource(R.drawable.newyork);


        tokyotime = findViewById(R.id.tokyotime);
        CityView = tokyotime.findViewById(R.id.city);
        CityView.setText("Tokyo");
        CityImageView = tokyotime.findViewById(R.id.imageView);
        CityImageView.setImageResource(R.drawable.tokyo);


        rometime = findViewById(R.id.rometime);
        CityView = rometime.findViewById(R.id.city);
        CityView.setText("Rome");
        CityImageView = rometime.findViewById(R.id.imageView);
        CityImageView.setImageResource(R.drawable.rome);


        TimeZoneButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateFormat formatter = new SimpleDateFormat("h:mma");
                TimeZoneTextview = sydneytime.findViewById(R.id.time);
                TimeZone tz1 = TimeZone.getTimeZone("Australia/Sydney");
                Calendar calendar1 = Calendar.getInstance(tz1);
                formatter.setCalendar(calendar1);
                formatter.setTimeZone(tz1);
                TimeZoneTextview.setText(formatter.format(calendar1.getTime()));

                TimeZoneTextview = londontime.findViewById(R.id.time);
                TimeZone tz2 = TimeZone.getTimeZone("Europe/London");
                Calendar calendar2 = Calendar.getInstance(tz2);
                formatter.setCalendar(calendar2);
                formatter.setTimeZone(tz2);
                TimeZoneTextview.setText(formatter.format(calendar2.getTime()));

                TimeZoneTextview = newyorktime.findViewById(R.id.time);
                TimeZone tz3 = TimeZone.getTimeZone("America/New_York");
                Calendar calendar3 = Calendar.getInstance(tz3);
                formatter.setCalendar(calendar3);
                formatter.setTimeZone(tz3);
                TimeZoneTextview.setText(formatter.format(calendar3.getTime()));

                TimeZoneTextview = tokyotime.findViewById(R.id.time);
                TimeZone tz4 = TimeZone.getTimeZone("Asia/Tokyo");
                Calendar calendar4 = Calendar.getInstance(tz4);
                formatter.setCalendar(calendar4);
                formatter.setTimeZone(tz4);
                TimeZoneTextview.setText(formatter.format(calendar4.getTime()));

                TimeZoneTextview = rometime.findViewById(R.id.time);
                TimeZone tz5 = TimeZone.getTimeZone("Europe/Rome");
                Calendar calendar5 = Calendar.getInstance(tz5);
                formatter.setCalendar(calendar5);
                formatter.setTimeZone(tz5);
                TimeZoneTextview.setText(formatter.format(calendar5.getTime()));
            }
        });

        TimeZoneButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                TimeZoneTextview = sydneytime.findViewById(R.id.time);
                TimeZone tz1 = TimeZone.getTimeZone("Australia/Sydney");
                Calendar calendar1 = Calendar.getInstance(tz1);
                formatter.setCalendar(calendar1);
                formatter.setTimeZone(tz1);
                TimeZoneTextview.setText(formatter.format(calendar1.getTime()));

                TimeZoneTextview = londontime.findViewById(R.id.time);
                TimeZone tz2 = TimeZone.getTimeZone("Europe/London");
                Calendar calendar2 = Calendar.getInstance(tz2);
                formatter.setCalendar(calendar2);
                formatter.setTimeZone(tz2);
                TimeZoneTextview.setText(formatter.format(calendar2.getTime()));

                TimeZoneTextview = newyorktime.findViewById(R.id.time);
                TimeZone tz3 = TimeZone.getTimeZone("America/New_York");
                Calendar calendar3 = Calendar.getInstance(tz3);
                formatter.setCalendar(calendar3);
                formatter.setTimeZone(tz3);
                TimeZoneTextview.setText(formatter.format(calendar3.getTime()));

                TimeZoneTextview = tokyotime.findViewById(R.id.time);
                TimeZone tz4 = TimeZone.getTimeZone("Asia/Tokyo");
                Calendar calendar4 = Calendar.getInstance(tz4);
                formatter.setCalendar(calendar4);
                formatter.setTimeZone(tz4);
                TimeZoneTextview.setText(formatter.format(calendar4.getTime()));

                TimeZoneTextview = rometime.findViewById(R.id.time);
                TimeZone tz5 = TimeZone.getTimeZone("Europe/Rome");
                Calendar calendar5 = Calendar.getInstance(tz5);
                formatter.setCalendar(calendar5);
                formatter.setTimeZone(tz5);
                TimeZoneTextview.setText(formatter.format(calendar5.getTime()));
            }
        });


    }

}