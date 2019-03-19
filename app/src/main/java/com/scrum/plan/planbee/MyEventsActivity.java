package com.scrum.plan.planbee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MyEventsActivity extends AppCompatActivity {
    private RecyclerView eventsView;
    private ArrayList<MyEventsModel> eventsArrayList;
    private MyEventsAdapter adapter;

    private String[] eventTitles = new String[]{"BPI Group Meeting", "Drinks with the bois", "Band rehearsal", "Scrum 4 due", "Cinema", "Climbing", "Paint balling", "D&D", "BU Guest Lecture", "Team meeting"};
    private int[] eventIcons = new int[]{R.drawable.chat_bpi, R.drawable.chat_default, R.drawable.chat_trumpet, R.drawable.chat_scrum, R.drawable.chat_cinema, R.drawable.chat_climbing, R.drawable.chat_paintballing, R.drawable.chat_board_game, R.drawable.chat_bu, R.drawable.chat_11};
    private String[] eventUpcoming = new String[]{"Talbot Campus\n1pm March 3rd", "Mary Shelley\n9pm March 3rd", "Music room\n2pm March 4th", "Brightspace\n12pm March 7th", "Odeon\n7pm March 8th", "The Project\n5pm March 15th", "BU Paintball\n1pm March 22nd", "Talbot Campus\n8pm March 23rd", "Talbot Campus\n11am March 25th", "Talbot Campus\n1:30pm March 29th"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);

        // Events recycler
        eventsView = findViewById(R.id.my_events_recycler);
        eventsArrayList = getMyEvents();
        adapter = new MyEventsAdapter(this, eventsArrayList);
        eventsView.setAdapter(adapter);
        eventsView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList<MyEventsModel> getMyEvents(){
        ArrayList<MyEventsModel> myEvents = new ArrayList<>();

        for(int i = 0; i < eventTitles.length; i++){
            MyEventsModel eventModel = new MyEventsModel();
            eventModel.setName(eventTitles[i]);
            eventModel.setImage_drawable(eventIcons[i]);
            eventModel.setUpcoming(eventUpcoming[i]);
            myEvents.add(eventModel);
        }
        return myEvents;
    }
}
