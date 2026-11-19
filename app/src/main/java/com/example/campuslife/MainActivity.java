package com.example.campuslife;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton facilitiesButton = findViewById(R.id.facilities_button);
        ImageButton eventsButton = findViewById(R.id.events_button);
        ImageButton clubsButton = findViewById(R.id.clubs_button);
        ImageButton supportButton = findViewById(R.id.support_button);

        facilitiesButton.setOnClickListener(view ->
                Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show());
        eventsButton.setOnClickListener(view ->
                Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show());
        clubsButton.setOnClickListener(view ->
                Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show());
        supportButton.setOnClickListener(view ->
                Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show());
    }
}
