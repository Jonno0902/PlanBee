package com.scrum.plan.planbee;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private NavigationView navView;
    private DrawerLayout drawLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_home:
                        startActivity(new Intent(MapActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_login:
                        startActivity(new Intent(MapActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(MapActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        startActivity(new Intent(MapActivity.this, GroupChatsActivity.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(MapActivity.this, MapActivity.class));
                        break;
                    case R.id.nav_my_events:
                        startActivity(new Intent(MapActivity.this, MyEventsActivity.class));
                        break;
                    case R.id.nav_calendar:
                        startActivity(new Intent(MapActivity.this, CalendarActivity.class));
                        break;
                }
                return false;
            }
        });
        drawLayout = findViewById(R.id.drawer_layout);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng bournemouth = new LatLng(50.7192, -1.9047);
        mMap.addMarker(new MarkerOptions().position(bournemouth).title("Marker in Bournemouth"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bournemouth));
    }
}
