package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // logging a message in the logcat using Log.d
        Log.d("Life cycle Event", "onCreate event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle Event", "onStart event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle Event", "onResume event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle Event", "onPause event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle Event", "onStop event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle Event", "onDestroy event");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle Event", "onRestart event");
    }
}