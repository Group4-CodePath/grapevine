package com.example.grapevine;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.homepage:
                        // do something here
                        return true;
                    case R.id.search:
                        setContentView(R.layout.activity_search);
                        return true;
                    case R.id.post:
                        setContentView(R.layout.activity_post);
                        return true;
                    case R.id.profile:
                        setContentView(R.layout.activity_profile);
                        return true;
                    default: return true;
                }
            }
        });
    }
}