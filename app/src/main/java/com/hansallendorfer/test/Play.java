package com.hansallendorfer.test;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Play extends ActionBarActivity {
    boolean a1_pressed;
    boolean a2_pressed;
    boolean a3_pressed;
    boolean a4_pressed;
    boolean b1_pressed;
    boolean b2_pressed;
    boolean b3_pressed;
    boolean b4_pressed;
    boolean c1_pressed;
    boolean c2_pressed;
    boolean c3_pressed;
    boolean c4_pressed;
    boolean d1_pressed;
    boolean d2_pressed;
    boolean d3_pressed;
    boolean d4_pressed;

     Button a1;
     Button a2;
     Button a3;
     Button a4;
     Button b1;
     Button b2;
     Button b3;
     Button b4;
     Button c1;
     Button c2;
     Button c3;
     Button c4;
     Button d1;
     Button d2;
     Button d3;
     Button d4 ;

//    MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_play);
      //viewpager = (ViewPager) findViewById(R.id.pager);
      // PagerAdapter p = new PagerAdapter(getSupportFragmentManager());
      // viewpager.setAdapter(p);
        //hi ankit
         a1 = (Button) findViewById(R.id.a1);
         a2 = (Button) findViewById(R.id.a2);
         a3 = (Button) findViewById(R.id.a3);
         a4 = (Button) findViewById(R.id.a4);
         b1 = (Button) findViewById(R.id.b1);
         b2 = (Button) findViewById(R.id.b2);
         b3 = (Button) findViewById(R.id.b3);
         b4 = (Button) findViewById(R.id.b4);
         c1 = (Button) findViewById(R.id.c1);
         c2 = (Button) findViewById(R.id.c2);
         c3 = (Button) findViewById(R.id.c3);
         c4 = (Button) findViewById(R.id.c4);
         d1 = (Button) findViewById(R.id.d1);
         d2 = (Button) findViewById(R.id.d2);
         d3 = (Button) findViewById(R.id.d3);
         d4 = (Button) findViewById(R.id.d4);
    }

    public void on_a1(View view){
        if(!a1_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            mp.start();
 //           mp.release();
            //change color
            a1.setBackgroundColor(Color.GREEN);
            a1_pressed = true;
        }
        else{
            //change to default
           // a1.setBackgroundColor(Color.parseColor("#B2DFDB"));
        }
    }

    public void on_a2(View view){
        if(!a2_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            mp.start();
   //         mp.release();
            //change color
            a2.setBackgroundColor(Color.BLUE);
            a2_pressed = true;
        }
        else{
            //a2.setBackgroundColor(Color.parseColor("#B2DFDB"));
        }
    }

    public void on_a3(View view){
        if(!a3_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            mp.start();
 //           mp.release();
            //change color
            a3.setBackgroundColor(Color.parseColor("#26A69A"));
            a3_pressed = true;
        }
        else{
            //a3.setBackgroundColor(Color.parseColor("#B2DFDB"));
        }
    }
    public void on_a4(View view){
        if(!a4_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            mp.start();
   //         mp.release();
            //change color
            a4.setBackgroundColor(Color.parseColor("#009688"));
            a4_pressed = true;

        }
        else{
           // a4.setBackgroundColor(Color.parseColor("#B2DFDB"));
        }
    }
    public void on_b1(View view){
        if(!b1_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            mp.start();

        }
        else{

        }
    }
    public void on_b2(View view){
        if(!b2_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            mp.start();

        }
        else{

        }
    }
    public void on_b3(View view){
        if(!b3_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            mp.start();

        }
        else{

        }
    }
    public void on_b4(View view){
        if(!b4_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            mp.start();
            b4.setBackgroundColor(Color.parseColor("#009688"));
            b4_pressed = true;

        }
        else{

        }
    }
    public void on_c1(View view){
        if(!c1_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            mp.start();


        }
        else{

        }
    }
    public void on_c2(View view){
        if(!c2_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            mp.start();


        }
        else{

        }
    }
    public void on_c3(View view){
        if(!c3_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            mp.start();


        }
        else{

        }
    }
    public void on_c4(View view){
        if(!c4_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            mp.start();
            c4.setBackgroundColor(Color.parseColor("#009688"));
            c4_pressed = true;
        }
        else{

        }
    }
    public void on_d1(View view){
        if(!d1_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            mp.start();

        }
        else{

        }
    }
    public void on_d2(View view){
        if(!d2_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            mp.start();

        }
        else{

        }
    }
    public void on_d3(View view){
        if(!d3_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            mp.start();

        }
        else{

        }
    }

    public void on_d4(View view){
        if(!d4_pressed){
            MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            mp.start();
            d4.setBackgroundColor(Color.parseColor("#009688"));
            d4_pressed = true;
        }
        else{

        }
    }

}
