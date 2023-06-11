package com.sasoft.ridebud;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView travel_log_img = findViewById(R.id.travel_log);
        ImageView map_img = findViewById(R.id.map);
        ImageView weather_img = findViewById(R.id.weather);
        ImageView statistics_img = findViewById(R.id.statistics);
        ImageView reminders_img = findViewById(R.id.reminders);
        ImageView price_monitor_img = findViewById(R.id.price_monitor);
        ImageView chat_img = findViewById(R.id.chat);
        ImageView emergency_img = findViewById(R.id.emergency);
        ImageView goals_img = findViewById(R.id.goals);
        travel_log_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                Intent intent = new Intent(MainActivity.this, travel_logs_act.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Travel Logs clicked", Toast.LENGTH_SHORT).show();
            }
        });
        map_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                Intent intent = new Intent(MainActivity.this, navigation_act.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Map clicked", Toast.LENGTH_SHORT).show();
            }
        });
        weather_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                //Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Weather clicked", Toast.LENGTH_SHORT).show();
            }
        });
        statistics_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                //Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Statistics clicked", Toast.LENGTH_SHORT).show();
            }
        });
        reminders_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                //Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Reminders clicked", Toast.LENGTH_SHORT).show();
            }
        });
        price_monitor_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                //Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Price Monitor clicked", Toast.LENGTH_SHORT).show();
            }
        });
        chat_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                //Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Chat clicked", Toast.LENGTH_SHORT).show();
            }
        });
        emergency_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                //Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Emergency clicked", Toast.LENGTH_SHORT).show();
            }
        });
        goals_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the desired action here, such as starting a new activity
                //Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Goals clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle menu item clicks here
        int itemId = menuItem.getItemId();

        if (itemId == R.id.home) {
            Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (itemId == R.id.profile) {
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.about_us) {
            Toast.makeText(this, "About Us clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, about_us.class);
            startActivity(intent);
        } else if (itemId == R.id.exit) {
            Toast.makeText(this, "Exit clicked", Toast.LENGTH_SHORT).show();
            System.exit(0);
        }

        // Close the drawer after handling the click
        drawerLayout.closeDrawers();

        return true;
    }
}
