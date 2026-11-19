package com.example.campuslife;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Displays the CampusLife section selected from MainActivity.
 * The section index passed by the Intent selects matching entries from arrays.xml.
 */
public class DetailActivity extends Activity {

    public static final String EXTRA_SECTION_INDEX = "com.example.campuslife.SECTION_INDEX";
    private static final int DEFAULT_SECTION_INDEX = 0;

    private int sectionIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String[] imageNames = getResources().getStringArray(R.array.string_array_images);
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);

        sectionIndex = Math.floorMod(
                getIntent().getIntExtra(EXTRA_SECTION_INDEX, DEFAULT_SECTION_INDEX),
                titles.length);

        String imageName = imageNames[sectionIndex].trim();
        String title = titles[sectionIndex].trim();
        String content = contents[sectionIndex].trim();
        int imageResourceId = getResources().getIdentifier(
                imageName,
                "drawable",
                getPackageName());

        ImageView detailImage = findViewById(R.id.detail_image);
        TextView detailHeader = findViewById(R.id.detail_header);
        TextView detailTitle = findViewById(R.id.detail_title);
        TextView detailContent = findViewById(R.id.detail_content);

        detailImage.setImageResource(imageResourceId);
        detailHeader.setText(title);
        detailTitle.setText(title);
        detailContent.setText(content);

        ImageButton backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> finish());
    }
}
