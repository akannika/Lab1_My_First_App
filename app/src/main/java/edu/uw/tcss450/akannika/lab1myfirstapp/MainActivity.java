package edu.uw.tcss450.akannika.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Logging Example";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("onCreate", "In onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d("onStart", "In onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.w("onResume", "In onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("onPause", "In onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("onStop", "In onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.wtf("onRestart", "In onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.v("onDestroy", "In onDestroy");
        super.onDestroy();
    }
}