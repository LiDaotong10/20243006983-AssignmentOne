# CampusLife Android Application

COMPX202/Y05853 Assignment One, University of Waikato.

- Student: Li Daotong
- Student ID: 20243006983
- Repository: `20243006983-AssignmentOne`
- Package: `com.example.campuslife`
- Minimum API: 24
- Language: Java

## Assignment parts

- **Part A:** Android application project and Gradle configuration.
- **Part B:** Responsive portrait XML layout using weighted `LinearLayout` groups.
- **Part C:** CampusLife name, launcher icon, green colour palette and pressed-state button selector.
- **Part D:** Landscape layout with the four buttons in a single row.
- **Part E:** Click listeners with Toast feedback.
- **Part F:** `DetailActivity` and scrollable detail layout.
- **Part G:** Explicit Intents carrying a section index.
- **Part H:** Detail UI populated from `arrays.xml` without `if` or `switch`.
- **Part I:** Structured Java, string and dimension resources, comments and CI checks.

## Run in Android Studio

1. Open this repository as an Android Studio project.
2. Let Gradle sync and download dependencies.
3. Select an emulator or connected device with API 24 or newer.
4. Run the `app` configuration.
5. Rotate the device to verify both portrait and landscape layouts.

## Manual verification

1. Launch CampusLife and confirm the banner and four image buttons appear.
2. In portrait, confirm the buttons form a 2 x 2 grid.
3. Rotate to landscape and confirm the four buttons appear in one row.
4. Tap each button and confirm its Toast appears.
5. Confirm each button opens `DetailActivity` with the matching title, image and long content.
6. Scroll the detail page to confirm the full array text is readable.
7. Press Back and repeat for all four sections.

## Automated build

The GitHub Actions workflow runs:

```bash
./gradlew assembleDebug lintDebug --stacktrace
```

and uploads the debug APK as a workflow artifact.
