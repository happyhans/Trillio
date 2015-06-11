package com.example.allendorfer.trillio;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* New age */

public class Play extends Activity {

    SoundPool sounds;

    Map<String, Boolean> map;
    List<List<Boolean>> map2;
    Firebase firebase;
    Firebase board;
    Firebase board2;
    int numCols = -1;

    public void initialize(){
        map = new HashMap<>();
        map2 = new ArrayList<List<Boolean>>();
        for(int i = 0; i < 8; i++){
            map2.add(new ArrayList<Boolean>());
            numCols++;
            for(int j = 0; j < 8; j++){
                map2.get(i).add(false);
            }
        }
        for(int i = 1; i <= 64; i++){
            String b = "button" + i;
            map.put(b, false);
        }
        sounds = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        sounds.load(this, R.raw.a, 1);
        sounds.load(this, R.raw.b, 1);
        sounds.load(this, R.raw.c, 1);
        sounds.load(this, R.raw.d, 1);
        sounds.load(this,R.raw.e,1);
        sounds.load(this, R.raw.f, 1);
        sounds.load(this, R.raw.g, 1);
        sounds.load(this, R.raw.h, 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        initialize();

        Firebase.setAndroidContext(this);
        firebase = new Firebase("https://trillio.firebaseio.com/");
        board = firebase.child("board");
        board2 = firebase.child("board2");

        board.setValue(map);
        board2.setValue(map2);

        firebase.child("board").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String key = dataSnapshot.getKey();
                int id = getResources().getIdentifier(key, "id", getPackageName());
                Button button = (Button) findViewById(id);

                if (dataSnapshot.getValue() == true) {
                    button.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    map.put(dataSnapshot.getKey(), true);
                } else {
                    button.getBackground().clearColorFilter();
                    map.put(dataSnapshot.getKey(), false);
                }
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });
    }

    public void buttonClick(View view) {
        Button button = (Button) view;
        String buttonId = view.getResources().getResourceName(view.getId()).substring(35);
        if (map.get(buttonId)) {
            button.getBackground().clearColorFilter();
            map.put(buttonId, false);
            board.child(buttonId).setValue(false);
        } else {
            button.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            map.put(buttonId, true);
            board.child(buttonId).setValue(true);
       }
        board.setValue(map);
    }

    public void addBar(View view){
        if(numCols < 15){
            map2.add(new ArrayList<Boolean>());
            numCols++;
            for(int j = 0; j < 8; j++){
                map2.get(numCols).add(false);
            }
            board2.setValue(map2);
        }
    }

    public void removeBar(View view){
        if(numCols != 0){
            map2.remove(numCols);
            numCols--;
            board2.setValue(map2);
        }
    }

}
