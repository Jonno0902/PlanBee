package com.scrum.plan.planbee;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private RecyclerView upcomingView, nearbyView, recommendedView;
    private ArrayList<ScrollerModel> imageModelArrayList;
    private ScrollerAdapter adapter;

    //Arrays for the title and image of each item in the event scroller
    private int[] scrollerImages = new int[]{R.drawable.toy_story_4_icon, R.drawable.reading_festival_icon, R.drawable.bournemouth_fc_logo, R.drawable.basketball_icon, R.drawable.board_game_cafe_icon, R.drawable.sand_sculpture_logo};
    private String[] scrollerTitles = new String[]{"Toy Story 4", "Reading festival", "Bournemouth FC", "Basketball", "Board game cafe", "Sand sculpture festival"};

    private NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upcomingView = (RecyclerView) findViewById(R.id.upcoming_events_recycler);
        nearbyView = (RecyclerView) findViewById(R.id.nearby_events_recycler);
        recommendedView = (RecyclerView) findViewById(R.id.recommended_events_recycler);

        imageModelArrayList = getEvents();
        adapter = new ScrollerAdapter(this, imageModelArrayList);
        upcomingView.setAdapter(adapter);
        nearbyView.setAdapter(adapter);
        recommendedView.setAdapter(adapter);
        upcomingView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        nearbyView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recommendedView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_login:
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        break;
                    /*case R.id.nav_my_events:
                        startActivity(new Intent(MainActivity.this, MyEventsActivity.class));
                        break;
                    case R.id.nav_groups:
                        startActivity(new Intent(MainActivity.this, GroupsActivity.class));
                        break;
                    case R.id.nav_browse_events:
                        startActivity(new Intent(MainActivity.this, BrowseEventsActivity.class));
                        break;
                    case R.id.nav_advanced_search:
                        startActivity(new Intent(MainActivity.this, AdvancedSearchActivity.class));
                        break;
                    case R.id.nav_calendar:
                        startActivity(new Intent(MainActivity.this, CalendarActivity.class));
                        break;*/
                }
                return false;
            }
        });
    }

    private ArrayList<ScrollerModel> getEvents(){
        ArrayList<ScrollerModel> events = new ArrayList<>();

        for(int i = 0; i < scrollerImages.length; i++){
            ScrollerModel scrollerModel = new ScrollerModel();
            scrollerModel.setName(scrollerTitles[i]);
            scrollerModel.setImage_drawable(scrollerImages[i]);
            events.add(scrollerModel);
        }
        return events;
    }
}
