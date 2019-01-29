package com.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Oncreate method called",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(),"onStart method called",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(),"OnPause method called",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();


        Toast.makeText(getApplicationContext(),"OnResume method called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        Toast.makeText(getApplicationContext(),"OnDestroy method called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();


        Toast.makeText(getApplicationContext(),"OnStop method called",Toast.LENGTH_LONG).show();

    }
}
