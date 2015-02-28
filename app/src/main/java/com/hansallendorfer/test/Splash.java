package com.hansallendorfer.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class Splash extends ActionBarActivity {
    //DONE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t = new Thread() {
            public void run() {
                try {
                    MediaPlayer mp = MediaPlayer.create(Splash.this,R.raw.damnboi);
                    mp.start();
                    sleep(3000);
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
