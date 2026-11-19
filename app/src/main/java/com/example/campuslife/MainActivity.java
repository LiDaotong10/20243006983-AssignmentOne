package com.example.campuslife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final int SECTION_FACILITIES = 0;
    private static final int SECTION_EVENTS = 1;
    private static final int SECTION_CLUBS = 2;
    private static final int SECTION_SUPPORT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton facilitiesButton = findViewById(R.id.facilities_button);
        ImageButton eventsButton = findViewById(R.id.events_button);
        ImageButton clubsButton = findViewById(R.id.clubs_button);
        ImageButton supportButton = findViewById(R.id.support_button);

        facilitiesButton.setOnClickListener(view -> {
            Toast.makeText(this, getString(R.string.toast_facilities_clicked), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_SECTION_INDEX, SECTION_FACILITIES);
            startActivity(intent);
        });

        eventsButton.setOnClickListener(view -> {
            Toast.makeText(this, getString(R.string.toast_events_clicked), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_SECTION_INDEX, SECTION_EVENTS);
            startActivity(intent);
        });

        clubsButton.setOnClickListener(view -> {
            Toast.makeText(this, getString(R.string.toast_clubs_clicked), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_SECTION_INDEX, SECTION_CLUBS);
            startActivity(intent);
        });

        supportButton.setOnClickListener(view -> {
            Toast.makeText(this, getString(R.string.toast_support_clicked), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_SECTION_INDEX, SECTION_SUPPORT);
            startActivity(intent);
        });
    }
}
