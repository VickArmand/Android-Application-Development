package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // logging a message in the logcat using Log.d
        Log.d("Life cycle Event", "onCreate event");
        Toast.makeText(getApplicationContext(), "onCreate event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle Event", "onStart event");
        Toast.makeText(getApplicationContext(), "onStart event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle Event", "onResume event");
        Toast.makeText(getApplicationContext(), "onResume event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle Event", "onPause event");
        Toast.makeText(getApplicationContext(), "onPause event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle Event", "onStop event");
        Toast.makeText(getApplicationContext(), "onStop event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle Event", "onDestroy event");
        Toast.makeText(getApplicationContext(), "onDestroy event", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle Event", "onRestart event");
        Toast.makeText(getApplicationContext(), "onRestart event", Toast.LENGTH_SHORT).show();
    }
}