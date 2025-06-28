How to Run the To-Do List App in Android Studio
Step 1: Open Android Studio and Create a New Project
Open Android Studio.
Click on "New Project" → Choose "Empty Activity".
Name your app (e.g., ToDoListApp).
Choose language as Java.
Set minimum SDK (e.g., API 21: Android 5.0 or higher).
Click Finish.
Step 2: Replace Auto-Generated Files with Your Code
In app > java > com.example.todolist:
- Replace MainActivity.java with your provided code.
- Create a new class named IntroActivity and paste your code.
In res > layout:
- Replace activity_main.xml with your layout.
- Create activity_intro.xml and paste your intro layout.
- Create card.xml and paste the task card layout.
- Create dialog.xml and paste the input dialog layout.
Step 3: Update the Manifest
Open AndroidManifest.xml and register both activities:
<activity android:name=".MainActivity" />
<activity android:name=".IntroActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
Step 4: Update Dependencies (if needed)
If CardView errors occur, open build.gradle (Module: app) and add:
implementation 'androidx.cardview:cardview:1.0.0'
Then click "Sync Now".
Step 5: Run the App
Click the green Run button (▶️) or press Shift + F10.
Choose a connected device or emulator.
The app should launch showing the intro screen and proceed to the main screen.
