package com.example.campuslife;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class DetailActivity extends Activity {

    public static final String EXTRA_SECTION_INDEX = "com.example.campuslife.SECTION_INDEX";
    private static final int DEFAULT_SECTION_INDEX = 0;

    private int sectionIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        sectionIndex = getIntent().getIntExtra(EXTRA_SECTION_INDEX, DEFAULT_SECTION_INDEX);

        ImageButton backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> finish());
    }
}
