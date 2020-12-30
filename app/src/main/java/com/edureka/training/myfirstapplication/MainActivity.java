package com.edureka.training.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //This is where we take care of core business logic...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Following line brings view on top of the activity...
        //setContentView(R.layout.activity_main); //This is related to view

        setContentView(R.layout.activity_main);
        Log.d("tag", "In onCreate"); //Log Debug
//        Log.e("tag", "In onCreate"); //Log Error
//        Log.w("tag", "In onCreate"); //Log warning
//        Log.i("tag", "In onCreate"); //Log Information

        //We can expect Hello Ibrahim here...
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "In onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "In onDestroy");
    }
}