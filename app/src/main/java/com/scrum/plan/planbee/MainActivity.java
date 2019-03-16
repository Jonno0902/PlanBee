package com.scrum.plan.planbee;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private RecyclerView upcomingView, nearbyView, recommendedView, sponsoredView, popularView, top10View, newView;
    private ArrayList<ScrollerModel> imageModelArrayList;
    private ScrollerAdapter adapter;

    //Arrays for the title and image of each item in the event scroller
    private int[] scrollerImages = new int[]{R.drawable.toy_story_4_icon, R.drawable.reading_festival_icon, R.drawable.bournemouth_fc_logo, R.drawable.basketball_icon, R.drawable.board_game_cafe_icon, R.drawable.sand_sculpture_logo};
    private String[] scrollerTitles = new String[]{"Toy Story 4", "Reading festival", "Bournemouth FC", "Basketball", "Board game cafe", "Sand sculpture festival"};

    private ImageButton btnOpenNav;

    private NavigationView navView;
    private DrawerLayout drawLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upcomingView = findViewById(R.id.upcoming_events_recycler);
        nearbyView = findViewById(R.id.nearby_events_recycler);
        recommendedView = findViewById(R.id.recommended_events_recycler);
        sponsoredView = findViewById(R.id.sponsored_events_recycler);
        popularView = findViewById(R.id.popular_events_recycler);
        top10View = findViewById(R.id.top10_events_recycler);
        newView = findViewById(R.id.new_events_recycler);

        imageModelArrayList = getEvents();
        adapter = new ScrollerAdapter(this, imageModelArrayList);
        upcomingView.setAdapter(adapter);
        nearbyView.setAdapter(adapter);
        recommendedView.setAdapter(adapter);
        sponsoredView.setAdapter(adapter);
        popularView.setAdapter(adapter);
        top10View.setAdapter(adapter);
        newView.setAdapter(adapter);
        upcomingView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        nearbyView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recommendedView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        sponsoredView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        popularView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        top10View.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        newView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_login:
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(MainActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        startActivity(new Intent(MainActivity.this, GroupChats.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(MainActivity.this, MapActivity.class));
                        break;
                    /*case R.id.nav_browse_events:
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

        drawLayout = findViewById(R.id.drawer_layout);
        btnOpenNav = findViewById(R.id.btn_open_nav);
        btnOpenNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawLayout.openDrawer(Gravity.LEFT);
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
