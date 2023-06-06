package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * this callback, which fires when the system first creates the activity.
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // logging a message in the logcat using Log.d
        Log.d("Life cycle Event", "onCreate event");
        Toast.makeText(getApplicationContext(), "onCreate event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        /** This call makes the activity visible to the user as the app prepares for the activity
         *  to enter the foreground and become interactive.
         *  For example, this method is where the code that maintains the UI is initialized.
         */
        super.onStart();
        Log.d("Life cycle Event", "onStart event");
        Toast.makeText(getApplicationContext(), "onStart event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        /**
         * When the activity enters the Resumed state, it comes to the foreground,
         * and the system invokes the onResume() callback.
         * This is the state in which the app interacts with the user.
         * The app stays in this state until something happens to take focus away from the app,
         * such as the device receiving a phone call, the user navigating to another activity,
         * or the device screen turning off.
         */
        super.onResume();
        Log.d("Life cycle Event", "onResume event");
        Toast.makeText(getApplicationContext(), "onResume event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        /**
         * The system calls this method as the first indication that the user is leaving your activity,
         * though it does not always mean the activity is being destroyed.
         * It indicates that the activity is no longer in the foreground,
         * but it is still visible if the user is in multi-window mode.
         */
        super.onPause();
        Log.d("Life cycle Event", "onPause event");
        Toast.makeText(getApplicationContext(), "onPause event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        /**
         * When your activity is no longer visible to the user, it enters the Stopped state,
         * and the system invokes the onStop() callback. This can occur when a newly launched activity covers the entire screen.
         * The system also calls onStop() when the activity finishes running and is about to be terminated.
         */
        super.onStop();
        Log.d("Life cycle Event", "onStop event");
        Toast.makeText(getApplicationContext(), "onStop event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        /**
         * onDestroy() is called before the activity is destroyed. The system invokes this callback for one of two reasons:
         *
         * The activity is finishing, due to the user completely dismissing the activity or due to finish() being called on the activity.
         * The system is temporarily destroying the activity due to a configuration change, such as device rotation or entering multi-window mode.
         */
        super.onDestroy();
        Log.d("Life cycle Event", "onDestroy event");
        Toast.makeText(getApplicationContext(), "onDestroy event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        /**
         * From the Stopped state, the activity either comes back to interact with the user,
         * or the activity is finished running and goes away. If the activity comes back, the system invokes onRestart().
         * If the Activity is finished running, the system calls onDestroy()
         */
        super.onRestart();
        Log.d("Life cycle Event", "onRestart event");
        Toast.makeText(getApplicationContext(), "onRestart event", Toast.LENGTH_SHORT).show();
    }
}