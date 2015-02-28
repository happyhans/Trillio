package com.hansallendorfer.test;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.Timer;
import java.util.TimerTask;


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
    Button d4;

    Spinner s;

    MediaPlayer mp;


    static int numMeasures = 0;
//    MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //numMeasures++;
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
        //   s=(Spinner)findViewById(R.id.spinner);
        //  Integer[] i=new Integer[numMeasures];
        // for (int x=0;x<MainActivity.fragments.length();x++)
        // {
        //     i[x]=x+1;
        // }
        // ArrayAdapter<Integer> adapter=new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item,i);
        //s.setAdapter(adapter);
        //s.setOnItemSelectedListener(this);
        
    }
        //make methods to play each sound individually

    public void playbeep1() {
        mp = MediaPlayer.create(Play.this, R.raw.beep1);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        mp.start();
    }

    public void playbeep2() {
        mp = MediaPlayer.create(Play.this, R.raw.beep2);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        mp.start();
    }

    public void playdjsound1() {
        mp = MediaPlayer.create(Play.this, R.raw.djsound1);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        mp.start();
    }

    public void playdrum1() {
        mp = MediaPlayer.create(Play.this, R.raw.drum1);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        mp.start();
    }

    public void on_a1(View view) {
        if (!a1_pressed) {
            //    MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //   mp.start();
            //           mp.release();
            //change color
            a1.setBackgroundColor(Color.parseColor("#1565C0"));
            a1_pressed = true;
        } else {
            //change to default
            a1.setBackgroundResource(android.R.drawable.btn_default);
            a1_pressed = !a1_pressed;
            // a1.setBackgroundColor(Color.parseColor("#B2DFDB"));
        }
    }

    public void on_a2(View view) {
        if (!a2_pressed) {
            //    MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //    mp.start();
            //         mp.release();
            //change color
            a2.setBackgroundColor(Color.parseColor("#1565C0"));
            a2_pressed = true;
        } else {
            //a2.setBackgroundColor(Color.parseColor("#B2DFDB"));
            a2.setBackgroundResource(android.R.drawable.btn_default);
            a2_pressed = !a2_pressed;
        }
    }

    public void on_a3(View view) {
        if (!a3_pressed) {
            //    MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            //    mp.start();
            //           mp.release();
            //change color
            a3.setBackgroundColor(Color.parseColor("#1565C0"));
            a3_pressed = true;
        } else {
            a3.setBackgroundResource(android.R.drawable.btn_default);
            a3_pressed = !a3_pressed;
        }
    }

    public void on_a4(View view) {
        if (!a4_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //   mp.start();
            //         mp.release();
            //change color
            a4.setBackgroundColor(Color.parseColor("#1565C0"));
            a4_pressed = true;

        } else {
            // a4.setBackgroundColor(Color.parseColor("#B2DFDB"));
            a4.setBackgroundResource(android.R.drawable.btn_default);
            a4_pressed = !a4_pressed;
        }
    }

    public void on_b1(View view) {
        if (!b1_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //   mp.start();
            b1.setBackgroundColor(Color.parseColor("#1E88E5"));
            b1_pressed = !b1_pressed;
        } else {
            b1.setBackgroundResource(android.R.drawable.btn_default);
            b1_pressed = !b1_pressed;
        }
    }

    public void on_b2(View view) {
        if (!b2_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            b2.setBackgroundColor(Color.parseColor("#1E88E5"));
            b2_pressed = !b2_pressed;
        } else {
            b2.setBackgroundResource(android.R.drawable.btn_default);
            b2_pressed = !b2_pressed;
        }
    }

    public void on_b3(View view) {
        if (!b3_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            // mp.start();
            b3.setBackgroundColor(Color.parseColor("#1E88E5"));
            b3_pressed = !b3_pressed;
        } else {
            b3.setBackgroundResource(android.R.drawable.btn_default);
            b3_pressed = !b3_pressed;
        }
    }

    public void on_b4(View view) {
        if (!b4_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            b4.setBackgroundColor(Color.parseColor("#1E88E5"));
            b4_pressed = true;

        } else {
            b4.setBackgroundResource(android.R.drawable.btn_default);
            b4_pressed = !b4_pressed;
        }
    }

    public void on_c1(View view) {
        if (!c1_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //  mp.start();
            c1.setBackgroundColor(Color.parseColor("#42A5F5"));
            c1_pressed = !c1_pressed;
        } else {
            c1.setBackgroundResource(android.R.drawable.btn_default);
            c1_pressed = !c1_pressed;
        }
    }

    public void on_c2(View view) {
        if (!c2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            c2.setBackgroundColor(Color.parseColor("#42A5F5"));
            c2_pressed = !c2_pressed;
        } else {
            c2.setBackgroundResource(android.R.drawable.btn_default);
            c2_pressed = !c2_pressed;
        }
    }

    public void on_c3(View view) {
        if (!c3_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            // mp.start();
            c3.setBackgroundColor(Color.parseColor("#42A5F5"));
            c3_pressed = !c3_pressed;
        } else {
            c3.setBackgroundResource(android.R.drawable.btn_default);
            c3_pressed = !c3_pressed;
        }
    }

    public void on_c4(View view) {
        if (!c4_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            // mp.start();
            c4.setBackgroundColor(Color.parseColor("#42A5F5"));
            c4_pressed = true;
        } else {
            c4.setBackgroundResource(android.R.drawable.btn_default);
            c4_pressed = !c4_pressed;
        }
    }

    public void on_d1(View view) {
        if (!d1_pressed) {
            //MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //mp.start();
            d1.setBackgroundColor(Color.parseColor("#90CAF9"));
            d1_pressed = !d1_pressed;
        } else {
            d1.setBackgroundResource(android.R.drawable.btn_default);
            d1_pressed = !d1_pressed;
        }
    }

    public void on_d2(View view) {
        if (!d2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            d2.setBackgroundColor(Color.parseColor("#90CAF9"));
            d2_pressed = !d2_pressed;
        } else {
            d2.setBackgroundResource(android.R.drawable.btn_default);
            d2_pressed = !d2_pressed;
        }
    }

    public void on_d3(View view) {
        if (!d3_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            //   mp.start();
            d3.setBackgroundColor(Color.parseColor("#90CAF9"));
            d3_pressed = !d3_pressed;
        } else {
            d3.setBackgroundResource(android.R.drawable.btn_default);
            d3_pressed = !d3_pressed;
        }
    }

    public void on_d4(View view) {
        if (!d4_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            d4.setBackgroundColor(Color.parseColor("#90CAF9"));
            d4_pressed = true;
        } else {
            d4.setBackgroundResource(android.R.drawable.btn_default);
            d4_pressed = !d4_pressed;
        }
    }

    public void delete(View view) {
        numMeasures--;
        // finish();
    }

//    public void newMeasure(View view)
//    {
//        Intent openPlay = new Intent(Play.this,Play.class);
//        MainActivity.fragments.add(openPlay);
//        startActivity(openPlay);
//    }


}
