package com.hansallendorfer.test;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.AudioManager;
import android.widget.Spinner;
import java.util.Timer;
import java.util.TimerTask;


public class Play extends ActionBarActivity {

    boolean a1_pressed;
    boolean a2_pressed;
    boolean a3_pressed;
    boolean a4_pressed;
    boolean a5_pressed;
    boolean a6_pressed;
    boolean a7_pressed;
    boolean a8_pressed;

    boolean b1_pressed;
    boolean b2_pressed;
    boolean b3_pressed;
    boolean b4_pressed;
    boolean b5_pressed;
    boolean b6_pressed;
    boolean b7_pressed;
    boolean b8_pressed;

    boolean c1_pressed;
    boolean c2_pressed;
    boolean c3_pressed;
    boolean c4_pressed;
    boolean c5_pressed;
    boolean c6_pressed;
    boolean c7_pressed;
    boolean c8_pressed;

    boolean d1_pressed;
    boolean d2_pressed;
    boolean d3_pressed;
    boolean d4_pressed;
    boolean d5_pressed;
    boolean d6_pressed;
    boolean d7_pressed;
    boolean d8_pressed;

    boolean e1_pressed;
    boolean e2_pressed;
    boolean e3_pressed;
    boolean e4_pressed;
    boolean e5_pressed;
    boolean e6_pressed;
    boolean e7_pressed;
    boolean e8_pressed;

    boolean f1_pressed;
    boolean f2_pressed;
    boolean f3_pressed;
    boolean f4_pressed;
    boolean f5_pressed;
    boolean f6_pressed;
    boolean f7_pressed;
    boolean f8_pressed;

    boolean g1_pressed;
    boolean g2_pressed;
    boolean g3_pressed;
    boolean g4_pressed;
    boolean g5_pressed;
    boolean g6_pressed;
    boolean g7_pressed;
    boolean g8_pressed;

    boolean h1_pressed;
    boolean h2_pressed;
    boolean h3_pressed;
    boolean h4_pressed;
    boolean h5_pressed;
    boolean h6_pressed;
    boolean h7_pressed;
    boolean h8_pressed;

    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;
    Button a6;
    Button a7;
    Button a8;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;

    Button c1;
    Button c2;
    Button c3;
    Button c4;
    Button c5;
    Button c6;
    Button c7;
    Button c8;

    Button d1;
    Button d2;
    Button d3;
    Button d4;
    Button d5;
    Button d6;
    Button d7;
    Button d8;

    Button e1;
    Button e2;
    Button e3;
    Button e4;
    Button e5;
    Button e6;
    Button e7;
    Button e8;

    Button f1;
    Button f2;
    Button f3;
    Button f4;
    Button f5;
    Button f6;
    Button f7;
    Button f8;

    Button g1;
    Button g2;
    Button g3;
    Button g4;
    Button g5;
    Button g6;
    Button g7;
    Button g8;

    Button h1;
    Button h2;
    Button h3;
    Button h4;
    Button h5;
    Button h6;
    Button h7;
    Button h8;

    //Spinner s;
    SoundPool sp1 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
    SoundPool sp2 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
    SoundPool sp3 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
    SoundPool sp4 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
    SoundPool sp5 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
    SoundPool sp6 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
    SoundPool sp7 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
    SoundPool sp8 = new SoundPool(1,AudioManager.STREAM_MUSIC,0);

    //  MediaPlayer mp;

    static int numMeasures = 0;
//    MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //numMeasures++;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Intent intent = getIntent();
        final int beats = intent.getIntExtra("radio1option",0);
        final int bpm = intent.getIntExtra("radio2option",0);

        a1 = (Button) findViewById(R.id.a1);
        a2 = (Button) findViewById(R.id.a2);
        a3 = (Button) findViewById(R.id.a3);
        a4 = (Button) findViewById(R.id.a4);
        a5 = (Button) findViewById(R.id.a5);
        a6 = (Button) findViewById(R.id.a6);
        a7 = (Button) findViewById(R.id.a7);
        a8 = (Button) findViewById(R.id.a8);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);

        c1 = (Button) findViewById(R.id.c1);
        c2 = (Button) findViewById(R.id.c2);
        c3 = (Button) findViewById(R.id.c3);
        c4 = (Button) findViewById(R.id.c4);
        c5 = (Button) findViewById(R.id.c5);
        c6 = (Button) findViewById(R.id.c6);
        c7 = (Button) findViewById(R.id.c7);
        c8 = (Button) findViewById(R.id.c8);

        d1 = (Button) findViewById(R.id.d1);
        d2 = (Button) findViewById(R.id.d2);
        d3 = (Button) findViewById(R.id.d3);
        d4 = (Button) findViewById(R.id.d4);
        d5 = (Button) findViewById(R.id.d5);
        d6 = (Button) findViewById(R.id.d6);
        d7 = (Button) findViewById(R.id.d7);
        d8 = (Button) findViewById(R.id.d8);

        e1 = (Button) findViewById(R.id.e1);
        e2 = (Button) findViewById(R.id.e2);
        e3 = (Button) findViewById(R.id.e3);
        e4 = (Button) findViewById(R.id.e4);
        e5 = (Button) findViewById(R.id.e5);
        e6 = (Button) findViewById(R.id.e6);
        e7 = (Button) findViewById(R.id.e7);
        e8 = (Button) findViewById(R.id.e8);

        f1 = (Button) findViewById(R.id.f1);
        f2 = (Button) findViewById(R.id.f2);
        f3 = (Button) findViewById(R.id.f3);
        f4 = (Button) findViewById(R.id.f4);
        f5 = (Button) findViewById(R.id.f5);
        f6 = (Button) findViewById(R.id.f6);
        f7 = (Button) findViewById(R.id.f7);
        f8 = (Button) findViewById(R.id.f8);

        g1 = (Button) findViewById(R.id.g1);
        g2 = (Button) findViewById(R.id.g2);
        g3 = (Button) findViewById(R.id.g3);
        g4 = (Button) findViewById(R.id.g4);
        g5 = (Button) findViewById(R.id.g5);
        g6 = (Button) findViewById(R.id.g6);
        g7 = (Button) findViewById(R.id.g7);
        g8 = (Button) findViewById(R.id.g8);

        h1 = (Button) findViewById(R.id.h1);
        h2 = (Button) findViewById(R.id.h2);
        h3 = (Button) findViewById(R.id.h3);
        h4 = (Button) findViewById(R.id.h4);
        h5 = (Button) findViewById(R.id.h5);
        h6 = (Button) findViewById(R.id.h6);
        h7 = (Button) findViewById(R.id.h7);
        h8 = (Button) findViewById(R.id.h8);

        final int sound1 = sp1.load(this,R.raw.ayy,1);
        final int sound2 = sp2.load(this,R.raw.basskick,1);
        final int sound3 = sp3.load(this,R.raw.clap,1);
        final int sound4 = sp4.load(this,R.raw.gunclick,1);
        final int sound5 = sp5.load(this,R.raw.quietsynth,1);
        final int sound6 = sp6.load(this,R.raw.snare,1);
        final int sound7 = sp7.load(this,R.raw.synth,1);
        final int sound8 = sp8.load(this,R.raw.synth2,1);

        final TimerTask beat1 = new TimerTask() {
            @Override
            public void run() {
                if(a1_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b1_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c1_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d1_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e1_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f1_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g1_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h1_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        final TimerTask beat2 = new TimerTask() {
            @Override
            public void run() {
                if(a2_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b2_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c2_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d2_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e2_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f2_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g2_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h2_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        final TimerTask beat3 = new TimerTask() {
            @Override
            public void run() {
                if(a3_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b3_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c3_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d3_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e3_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f3_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g3_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h3_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        final TimerTask beat4 = new TimerTask() {
            @Override
            public void run() {
                if(a4_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b4_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c4_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d4_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e4_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f4_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g4_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h4_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        final TimerTask beat5 = new TimerTask() {
            @Override
            public void run() {
                if(a5_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b5_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c5_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d5_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e5_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f5_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g5_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h5_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        final TimerTask beat6 = new TimerTask() {
            @Override
            public void run() {
                if(a6_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b6_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c6_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d6_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e6_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f6_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g6_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h6_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        final TimerTask beat7 = new TimerTask() {
            @Override
            public void run() {
                if(a7_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b7_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c7_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d7_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e7_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f7_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g7_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h7_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        final TimerTask beat8 = new TimerTask() {
            @Override
            public void run() {
                if(a8_pressed){
                    sp1.play(sound1,0.5f,0.5f,1,0,1);
                }
                if(b8_pressed){
                    sp2.play(sound2,0.5f,0.5f,1,0,1);
                }
                if(c8_pressed){
                    sp3.play(sound3,0.5f,0.5f,1,0,1);
                }
                if(d8_pressed){
                    sp4.play(sound4,0.5f,0.5f,1,0,1);
                }
                if(e8_pressed){
                    sp5.play(sound5,0.5f,0.5f,1,0,1);
                }
                if(f8_pressed){
                    sp6.play(sound6,0.5f,0.5f,1,0,1);
                }
                if(g8_pressed){
                    sp7.play(sound7,0.5f,0.5f,1,0,1);
                }
                if(h8_pressed){
                    sp8.play(sound8,0.5f,0.5f,1,0,1);
                }
            }
        };

        Thread t = new Thread() {
            public void run() {
                try {
                    Timer timer = new Timer();
                    if(bpm == 0){
                        timer.schedule(beat1,0, 1760);
                        timer.schedule(beat2,220, 1760);
                        timer.schedule(beat3,440, 1760);
                        timer.schedule(beat4,660, 1760);
                        timer.schedule(beat5,880, 1760);
                        timer.schedule(beat6,1100, 1760);
                        timer.schedule(beat7,1320, 1760);
                        timer.schedule(beat8,1540, 1760);
                    }
                    else if(bpm == 1){
                        timer.schedule(beat1,0, 1880);
                        timer.schedule(beat2,235, 1880);
                        timer.schedule(beat3,470, 1880);
                        timer.schedule(beat4,705, 1880);
                        timer.schedule(beat5,940, 1880);
                        timer.schedule(beat6,1175, 1880);
                        timer.schedule(beat7,1410, 1880);
                        timer.schedule(beat8,1645, 1880);
                    }
                    else if(bpm == 2){
                        timer.schedule(beat1,0, 2224);
                        timer.schedule(beat2,278, 2224);
                        timer.schedule(beat3,556, 2224);
                        timer.schedule(beat4,834, 2224);
                        timer.schedule(beat5,1112, 2224);
                        timer.schedule(beat6,1390, 2224);
                        timer.schedule(beat7,1668, 2224);
                        timer.schedule(beat8,1946, 2224);
                    }
                    else if(bpm == 3){
                        timer.schedule(beat1,0, 2608);
                        timer.schedule(beat2,326, 2608);
                        timer.schedule(beat3,652, 2608);
                        timer.schedule(beat4,978, 2608);
                        timer.schedule(beat5,1304, 2608);
                        timer.schedule(beat6,1630, 2608);
                        timer.schedule(beat7,1956, 2608);
                        timer.schedule(beat8,2282, 2608);
                    }



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }


    public void on_a1(View view) {
        if (!a1_pressed) {
            //    MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //   mp.start();
            //           mp.release();
            //change color
            a1.setBackgroundColor(Color.parseColor("#C8E6C9"));
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
            a2.setBackgroundColor(Color.parseColor("#A5D6A7"));
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
            a3.setBackgroundColor(Color.parseColor("#81C784"));
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
            a4.setBackgroundColor(Color.parseColor("#66BB6A"));
            a4_pressed = true;

        } else {
            // a4.setBackgroundColor(Color.parseColor("#B2DFDB"));
            a4.setBackgroundResource(android.R.drawable.btn_default);
            a4_pressed = !a4_pressed;
        }
    }

    public void on_a5(View view) {
        if (!a5_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //   mp.start();
            //         mp.release();
            //change color
            a5.setBackgroundColor(Color.parseColor("#4CAF50"));
            a5_pressed = true;

        } else {
            // a4.setBackgroundColor(Color.parseColor("#B2DFDB"));
            a5.setBackgroundResource(android.R.drawable.btn_default);
            a5_pressed = !a5_pressed;
        }
    }
    public void on_a6(View view) {
        if (!a6_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //   mp.start();
            //         mp.release();
            //change color
            a6.setBackgroundColor(Color.parseColor("#43A047"));
            a6_pressed = true;

        } else {
            // a4.setBackgroundColor(Color.parseColor("#B2DFDB"));
            a6.setBackgroundResource(android.R.drawable.btn_default);
            a6_pressed = !a6_pressed;
        }
    }
    public void on_a7(View view) {
        if (!a7_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //   mp.start();
            //         mp.release();
            //change color
            a7.setBackgroundColor(Color.parseColor("#388E3C"));
            a7_pressed = true;

        } else {
            // a4.setBackgroundColor(Color.parseColor("#B2DFDB"));
            a7.setBackgroundResource(android.R.drawable.btn_default);
            a7_pressed = !a7_pressed;
        }
    }
    public void on_a8(View view) {
        if (!a8_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //   mp.start();
            //         mp.release();
            //change color
            a8.setBackgroundColor(Color.parseColor("#2E7D32"));
            a8_pressed = true;

        } else {
            // a4.setBackgroundColor(Color.parseColor("#B2DFDB"));
            a8.setBackgroundResource(android.R.drawable.btn_default);
            a8_pressed = !a8_pressed;
        }
    }

    public void on_b1(View view) {
        if (!b1_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //   mp.start();
            b1.setBackgroundColor(Color.parseColor("#B2DFDB"));
            b1_pressed = true;
        } else {
            b1.setBackgroundResource(android.R.drawable.btn_default);
            b1_pressed = !b1_pressed;
        }
    }

    public void on_b2(View view) {
        if (!b2_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            b2.setBackgroundColor(Color.parseColor("#80CBC4"));
            b2_pressed = true;
        } else {
            b2.setBackgroundResource(android.R.drawable.btn_default);
            b2_pressed = !b2_pressed;
        }
    }

    public void on_b3(View view) {
        if (!b3_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            // mp.start();
            b3.setBackgroundColor(Color.parseColor("#4DB6AC"));
            b3_pressed = true;
        } else {
            b3.setBackgroundResource(android.R.drawable.btn_default);
            b3_pressed = !b3_pressed;
        }
    }

    public void on_b4(View view) {
        if (!b4_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            b4.setBackgroundColor(Color.parseColor("#26A69A"));
            b4_pressed = true;

        } else {
            b4.setBackgroundResource(android.R.drawable.btn_default);
            b4_pressed = !b4_pressed;
        }
    }
    public void on_b5(View view) {
        if (!b5_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            b5.setBackgroundColor(Color.parseColor("#009688"));
            b5_pressed = true;

        } else {
            b5.setBackgroundResource(android.R.drawable.btn_default);
            b5_pressed = !b5_pressed;
        }
    }
    public void on_b6(View view) {
        if (!b6_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            b6.setBackgroundColor(Color.parseColor("#00897B"));
            b6_pressed = true;

        } else {
            b6.setBackgroundResource(android.R.drawable.btn_default);
            b6_pressed = !b6_pressed;
        }
    }
    public void on_b7(View view) {
        if (!b7_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            b7.setBackgroundColor(Color.parseColor("#00796B"));
            b7_pressed = true;

        } else {
            b7.setBackgroundResource(android.R.drawable.btn_default);
            b7_pressed = !b7_pressed;
        }
    }
    public void on_b8(View view) {
        if (!b8_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            b8.setBackgroundColor(Color.parseColor("#00695C"));
            b8_pressed = true;

        } else {
            b8.setBackgroundResource(android.R.drawable.btn_default);
            b8_pressed = !b8_pressed;
        }
    }

    public void on_c1(View view) {
        if (!c1_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //  mp.start();
            c1.setBackgroundColor(Color.parseColor("#B2EBF2"));
            c1_pressed = true;
        } else {
            c1.setBackgroundResource(android.R.drawable.btn_default);
            c1_pressed = !c1_pressed;
        }
    }

    public void on_c2(View view) {
        if (!c2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            c2.setBackgroundColor(Color.parseColor("#80DEEA"));
            c2_pressed = true;
        } else {
            c2.setBackgroundResource(android.R.drawable.btn_default);
            c2_pressed = !c2_pressed;
        }
    }

    public void on_c3(View view) {
        if (!c3_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            // mp.start();
            c3.setBackgroundColor(Color.parseColor("#4DD0E1"));
            c3_pressed = true;
        } else {
            c3.setBackgroundResource(android.R.drawable.btn_default);
            c3_pressed = !c3_pressed;
        }
    }

    public void on_c4(View view) {
        if (!c4_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            // mp.start();
            c4.setBackgroundColor(Color.parseColor("#26C6D8"));
            c4_pressed = true;
        } else {
            c4.setBackgroundResource(android.R.drawable.btn_default);
            c4_pressed = !c4_pressed;
        }
    }
    public void on_c5(View view) {
        if (!c5_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            // mp.start();
            c5.setBackgroundColor(Color.parseColor("#00BCD4"));
            c5_pressed = true;
        } else {
            c5.setBackgroundResource(android.R.drawable.btn_default);
            c5_pressed = !c5_pressed;
        }
    }
    public void on_c6(View view) {
        if (!c6_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            // mp.start();
            c6.setBackgroundColor(Color.parseColor("#00ACC1"));
            c6_pressed = true;
        } else {
            c6.setBackgroundResource(android.R.drawable.btn_default);
            c6_pressed = !c6_pressed;
        }
    }
    public void on_c7(View view) {
        if (!c7_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            // mp.start();
            c7.setBackgroundColor(Color.parseColor("#0097A7"));
            c7_pressed = true;
        } else {
            c7.setBackgroundResource(android.R.drawable.btn_default);
            c7_pressed = !c7_pressed;
        }
    }
    public void on_c8(View view) {
        if (!c8_pressed) {
            // MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            // mp.start();
            c8.setBackgroundColor(Color.parseColor("#00838F"));
            c8_pressed = true;
        } else {
            c8.setBackgroundResource(android.R.drawable.btn_default);
            c8_pressed = !c8_pressed;
        }
    }

    public void on_d1(View view) {
        if (!d1_pressed) {
            //MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //mp.start();
            d1.setBackgroundColor(Color.parseColor("#B3E5FC"));
            d1_pressed = true;
        } else {
            d1.setBackgroundResource(android.R.drawable.btn_default);
            d1_pressed = !d1_pressed;
        }
    }

    public void on_d2(View view) {
        if (!d2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            d2.setBackgroundColor(Color.parseColor("#81D4FA"));
            d2_pressed = true;
        } else {
            d2.setBackgroundResource(android.R.drawable.btn_default);
            d2_pressed = !d2_pressed;
        }
    }

    public void on_d3(View view) {
        if (!d3_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            //   mp.start();
            d3.setBackgroundColor(Color.parseColor("#4FC3F7"));
            d3_pressed = true;
        } else {
            d3.setBackgroundResource(android.R.drawable.btn_default);
            d3_pressed = !d3_pressed;
        }
    }

    public void on_d4(View view) {
        if (!d4_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            d4.setBackgroundColor(Color.parseColor("#29B6F6"));
            d4_pressed = true;
        } else {
            d4.setBackgroundResource(android.R.drawable.btn_default);
            d4_pressed = !d4_pressed;
        }
    }
    public void on_d5(View view) {
        if (!d5_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            d5.setBackgroundColor(Color.parseColor("#03A9F4"));
            d5_pressed = true;
        } else {
            d5.setBackgroundResource(android.R.drawable.btn_default);
            d5_pressed = !d5_pressed;
        }
    }
    public void on_d6(View view) {
        if (!d6_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            d6.setBackgroundColor(Color.parseColor("#039BE5"));
            d6_pressed = true;
        } else {
            d6.setBackgroundResource(android.R.drawable.btn_default);
            d6_pressed = !d6_pressed;
        }
    }
    public void on_d7(View view) {
        if (!d7_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            d7.setBackgroundColor(Color.parseColor("#0288D1"));
            d7_pressed = true;
        } else {
            d7.setBackgroundResource(android.R.drawable.btn_default);
            d7_pressed = !d7_pressed;
        }
    }
    public void on_d8(View view) {
        if (!d8_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            d8.setBackgroundColor(Color.parseColor("#0277BD"));
            d8_pressed = true;
        } else {
            d8.setBackgroundResource(android.R.drawable.btn_default);
            d8_pressed = !d8_pressed;
        }
    }

    /// d is above, e is blow 1-8
    public void on_e1(View view) {
        if (!e1_pressed) {
            //MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //mp.start();
            e1.setBackgroundColor(Color.parseColor("#BBDEFB"));
            e1_pressed = true;
        } else {
            e1.setBackgroundResource(android.R.drawable.btn_default);
            e1_pressed = !e1_pressed;
        }
    }

    public void on_e2(View view) {
        if (!e2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            e2.setBackgroundColor(Color.parseColor("#90CAF9"));
            e2_pressed = true;
        } else {
            e2.setBackgroundResource(android.R.drawable.btn_default);
            e2_pressed = !e2_pressed;
        }
    }

    public void on_e3(View view) {
        if (!e3_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            //   mp.start();
            e3.setBackgroundColor(Color.parseColor("#64B5F6"));
            e3_pressed = true;
        } else {
            e3.setBackgroundResource(android.R.drawable.btn_default);
            e3_pressed = !e3_pressed;
        }
    }

    public void on_e4(View view) {
        if (!e4_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            e4.setBackgroundColor(Color.parseColor("#42A5F5"));
            e4_pressed = true;
        } else {
            e4.setBackgroundResource(android.R.drawable.btn_default);
            e4_pressed = !e4_pressed;
        }
    }
    public void on_e5(View view) {
        if (!e5_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            e5.setBackgroundColor(Color.parseColor("#2196F3"));
            e5_pressed = true;
        } else {
            e5.setBackgroundResource(android.R.drawable.btn_default);
            e5_pressed = !e5_pressed;
        }
    }
    public void on_e6(View view) {
        if (!e6_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            e6.setBackgroundColor(Color.parseColor("#1E88E5"));
            e6_pressed = true;
        } else {
            e6.setBackgroundResource(android.R.drawable.btn_default);
            e6_pressed = !e6_pressed;
        }
    }
    public void on_e7(View view) {
        if (!e7_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            e7.setBackgroundColor(Color.parseColor("#1976D2"));
            e7_pressed = true;
        } else {
            e7.setBackgroundResource(android.R.drawable.btn_default);
            e7_pressed = !e7_pressed;
        }
    }
    public void on_e8(View view) {
        if (!e8_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            e8.setBackgroundColor(Color.parseColor("#1565C0"));
            e8_pressed = true;
        } else {
            e8.setBackgroundResource(android.R.drawable.btn_default);
            e8_pressed = !e8_pressed;
        }
    }


//////////////// f /////////

    public void on_f1(View view) {
        if (!f1_pressed) {
            //MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //mp.start();
            f1.setBackgroundColor(Color.parseColor("#C5CAE9"));
            f1_pressed = true;
        } else {
            f1.setBackgroundResource(android.R.drawable.btn_default);
            f1_pressed = !f1_pressed;
        }
    }

    public void on_f2(View view) {
        if (!f2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            f2.setBackgroundColor(Color.parseColor("#9FA8DA"));
            f2_pressed = true;
        } else {
            f2.setBackgroundResource(android.R.drawable.btn_default);
            f2_pressed = !f2_pressed;
        }
    }

    public void on_f3(View view) {
        if (!f3_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            //   mp.start();
            f3.setBackgroundColor(Color.parseColor("#7986CB"));
            f3_pressed = true;
        } else {
            f3.setBackgroundResource(android.R.drawable.btn_default);
            f3_pressed = !f3_pressed;
        }
    }

    public void on_f4(View view) {
        if (!f4_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            f4.setBackgroundColor(Color.parseColor("#5C6BC0"));
            f4_pressed = true;
        } else {
            f4.setBackgroundResource(android.R.drawable.btn_default);
            f4_pressed = !f4_pressed;
        }
    }
    public void on_f5(View view) {
        if (!f5_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            f5.setBackgroundColor(Color.parseColor("#3F51B5"));
            f5_pressed = true;
        } else {
            f5.setBackgroundResource(android.R.drawable.btn_default);
            f5_pressed = !f5_pressed;
        }
    }
    public void on_f6(View view) {
        if (!f6_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            f6.setBackgroundColor(Color.parseColor("#3949AB"));
            f6_pressed = true;
        } else {
            f6.setBackgroundResource(android.R.drawable.btn_default);
            f6_pressed = !f6_pressed;
        }
    }
    public void on_f7(View view) {
        if (!f7_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            f7.setBackgroundColor(Color.parseColor("#303F9F"));
            f7_pressed = true;
        } else {
            f7.setBackgroundResource(android.R.drawable.btn_default);
            f7_pressed = !f7_pressed;
        }
    }
    public void on_f8(View view) {
        if (!f8_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            f8.setBackgroundColor(Color.parseColor("#283593"));
            f8_pressed = true;
        } else {
            f8.setBackgroundResource(android.R.drawable.btn_default);
            f8_pressed = !f8_pressed;
        }
    }

    //////////////// g //////////////////

    public void on_g1(View view) {
        if (!g1_pressed) {
            //MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //mp.start();
            g1.setBackgroundColor(Color.parseColor("#D1C4E9"));
            g1_pressed = true;
        } else {
            g1.setBackgroundResource(android.R.drawable.btn_default);
            g1_pressed = !e1_pressed;
        }
    }

    public void on_g2(View view) {
        if (!g2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            g2.setBackgroundColor(Color.parseColor("#B39DDB"));
            g2_pressed = true;
        } else {
            g2.setBackgroundResource(android.R.drawable.btn_default);
            g2_pressed = !g2_pressed;
        }
    }

    public void on_g3(View view) {
        if (!g3_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            //   mp.start();
            g3.setBackgroundColor(Color.parseColor("#9575CD"));
            g3_pressed = true;
        } else {
            g3.setBackgroundResource(android.R.drawable.btn_default);
            g3_pressed = !g3_pressed;
        }
    }

    public void on_g4(View view) {
        if (!g4_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            g4.setBackgroundColor(Color.parseColor("#7E57C2"));
            g4_pressed = true;
        } else {
            g4.setBackgroundResource(android.R.drawable.btn_default);
            g4_pressed = !g4_pressed;
        }
    }
    public void on_g5(View view) {
        if (!g5_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            g5.setBackgroundColor(Color.parseColor("#673AB7"));
            g5_pressed = true;
        } else {
            g5.setBackgroundResource(android.R.drawable.btn_default);
            g5_pressed = !g5_pressed;
        }
    }
    public void on_g6(View view) {
        if (!g6_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            g6.setBackgroundColor(Color.parseColor("#5E35B1"));
            g6_pressed = true;
        } else {
            g6.setBackgroundResource(android.R.drawable.btn_default);
            g6_pressed = !g6_pressed;
        }
    }
    public void on_g7(View view) {
        if (!g7_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            g7.setBackgroundColor(Color.parseColor("#512DA8"));
            g7_pressed = true;
        } else {
            g7.setBackgroundResource(android.R.drawable.btn_default);
            g7_pressed = !g7_pressed;
        }
    }
    public void on_g8(View view) {
        if (!g8_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            g8.setBackgroundColor(Color.parseColor("#4527A0"));
            g8_pressed = true;
        } else {
            g8.setBackgroundResource(android.R.drawable.btn_default);
            g8_pressed = !g8_pressed;
        }
    }
    ///////////////////// h //////////////////////
    public void on_h1(View view) {
        if (!h1_pressed) {
            //MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep1);
            //mp.start();
            h1.setBackgroundColor(Color.parseColor("#E1BEE7"));
            h1_pressed = true;
        } else {
            h1.setBackgroundResource(android.R.drawable.btn_default);
            h1_pressed = !h1_pressed;
        }
    }

    public void on_h2(View view) {
        if (!h2_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.beep2);
            //  mp.start();
            h2.setBackgroundColor(Color.parseColor("#CE93D8"));
            h2_pressed = true;
        } else {
            h2.setBackgroundResource(android.R.drawable.btn_default);
            h2_pressed = !e2_pressed;
        }
    }

    public void on_h3(View view) {
        if (!h3_pressed) {
            //   MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.djsound1);
            //   mp.start();
            h3.setBackgroundColor(Color.parseColor("#BA68C8"));
            h3_pressed = true;
        } else {
            h3.setBackgroundResource(android.R.drawable.btn_default);
            h3_pressed = !h3_pressed;
        }
    }

    public void on_h4(View view) {
        if (!h4_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            h4.setBackgroundColor(Color.parseColor("#AB47BC"));
            h4_pressed = true;
        } else {
            h4.setBackgroundResource(android.R.drawable.btn_default);
            h4_pressed = !h4_pressed;
        }
    }
    public void on_h5(View view) {
        if (!h5_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            h5.setBackgroundColor(Color.parseColor("#9C27B0"));
            h5_pressed = true;
        } else {
            h5.setBackgroundResource(android.R.drawable.btn_default);
            h5_pressed = !h5_pressed;
        }
    }
    public void on_h6(View view) {
        if (!h6_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            h6.setBackgroundColor(Color.parseColor("#8E24AA"));
            h6_pressed = true;
        } else {
            h6.setBackgroundResource(android.R.drawable.btn_default);
            h6_pressed = !h6_pressed;
        }
    }
    public void on_h7(View view) {
        if (!h7_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            h7.setBackgroundColor(Color.parseColor("#7B1FA2"));
            h7_pressed = true;
        } else {
            h7.setBackgroundResource(android.R.drawable.btn_default);
            h7_pressed = !h7_pressed;
        }
    }
    public void on_h8(View view) {
        if (!h8_pressed) {
            //  MediaPlayer mp = MediaPlayer.create(Play.this,R.raw.drum1);
            //  mp.start();
            h8.setBackgroundColor(Color.parseColor("#6A1B9A"));
            h8_pressed = true;
        } else {
            h8.setBackgroundResource(android.R.drawable.btn_default);
            h8_pressed = !h8_pressed;
        }
    }

}
