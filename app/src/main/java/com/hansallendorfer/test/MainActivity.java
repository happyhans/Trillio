package com.hansallendorfer.test;

import android.app.Fragment;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {
    //List<Fragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragments = new ArrayList<Fragment>();
    }

    public void play(View view){
        Intent openPlay = new Intent(MainActivity.this,Play.class);
        //fragments.add(openPlay);
        startActivity(openPlay);
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
