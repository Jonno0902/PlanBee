package com.scrum.plan.planbee;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class GroupChats extends AppCompatActivity {
    private ImageButton btnOpenNav;
    private NavigationView navView;
    private DrawerLayout drawLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chats);

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_login: // Will later have to be logged in to view group chats anyway
                        startActivity(new Intent(GroupChats.this, LoginActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        // Already open
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
    }
}

