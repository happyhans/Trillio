package com.hansallendorfer.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(1500);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                   Intent openMainActivity = new Intent(Splash.this, MainActivity.class);
                   startActivity(openMainActivity);
                }
            }
        };
        t.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
