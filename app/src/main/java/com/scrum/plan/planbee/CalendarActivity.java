package com.scrum.plan.planbee;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.TextStyle;
import java.util.Date;

public class
CalendarActivity extends AppCompatActivity {
    private NavigationView navView;
    private DrawerLayout drawLayout;
    private ImageButton btnOpenNav;
    private CalendarView calendar;
    private TextView txtCalendar;
    private TextView txtEventTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_login:
                        startActivity(new Intent(CalendarActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(CalendarActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        startActivity(new Intent(CalendarActivity.this, GroupChats.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(CalendarActivity.this, MapActivity.class));
                        break;
                    case R.id.nav_browse_events:
                        startActivity(new Intent(CalendarActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_calendar:
                        //already here
                        break;
                    case R.id.nav_my_events:
                        startActivity(new Intent(CalendarActivity.this, CalendarActivity.class));
                        break;
                }
                return false;
            }
        });

        drawLayout = findViewById(R.id.drawer_layout);
        btnOpenNav = findViewById(R.id.btn_open_nav);
        btnOpenNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawLayout.openDrawer(Gravity.LEFT);
            }
        });

        calendar = findViewById(R.id.calendarView);
        txtCalendar = findViewById(R.id.calendarDate);

        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        Date date = new Date();
        txtCalendar.setText(formatter.format(date));

        txtEventTitle = findViewById(R.id.calendarText);
        txtEventTitle.setText("No events today");


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                txtCalendar.setText(Integer.toString(dayOfMonth));
                txtEventTitle.setText("No events today");
            }

        });


    }

}
