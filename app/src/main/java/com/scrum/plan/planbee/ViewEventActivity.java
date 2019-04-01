package com.scrum.plan.planbee;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;




public class ViewEventActivity extends AppCompatActivity {



    private NavigationView navView;
    private DrawerLayout drawLayout;
    private ImageButton btnOpenNav;

    private TextView txtEventTitle;
    private TextView txtDate;
    private TextView txtLocation;
    private TextView txtHost;
    private TextView txtGroupName;
    private TextView txtDescription;
    private ImageView imgEvent;

    //Arrays for the title and image of each item in the event scroller
    private int[] eventIcons = new int[]{R.drawable.chat_bpi, R.drawable.chat_default, R.drawable.chat_trumpet, R.drawable.chat_scrum, R.drawable.chat_cinema, R.drawable.chat_climbing, R.drawable.chat_paintballing, R.drawable.chat_board_game, R.drawable.chat_bu, R.drawable.chat_11};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int eventIndex = intent.getIntExtra(MyEventsActivity.EXTRA_POS,0);
        setContentView(R.layout.activity_view_event);

        EventCollection Events = new EventCollection();
        Events.generateEvents();
        Event event = Events.getEvents().get(eventIndex);

        txtEventTitle = findViewById(R.id.txtEventTitle);
        txtDate = findViewById(R.id.txtDate);
        txtLocation = findViewById(R.id.txtLocation);
        txtHost = findViewById(R.id.txtHost);
        txtGroupName = findViewById(R.id.txtGroupName);
        txtDescription = findViewById(R.id.txtDescription);
        imgEvent = findViewById(R.id.imgEvent);


        txtEventTitle.setText(event.getName());
        txtDate.setText(event.getDate());
        txtLocation.setText(event.getLocation());
        txtHost.setText(event.getHost());
        txtGroupName.setText(event.getGroupName());
        txtDescription.setText(event.getDescription());
        imgEvent.setImageResource(eventIcons[eventIndex]);

    }
}
