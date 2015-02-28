package com.hansallendorfer.test;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view){
        Intent openPlay = new Intent(MainActivity.this,Play.class);
        startActivity(openPlay);
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
