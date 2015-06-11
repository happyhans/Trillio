package com.example.allendorfer.trillio;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Play extends Activity {

    SoundPool sounds;

    List<List<Boolean>> map;
    Firebase firebase;
    Firebase board;
    int numCols = -1;

    public void initialize(){
        map = new ArrayList<List<Boolean>>();
        for(int i = 0; i < 8; i++){
            map.add(new ArrayList<Boolean>());
            numCols++;
            for(int j = 0; j < 8; j++){
                map.get(i).add(false);
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.board);
        for(int i = 0; i < linearLayout.getChildCount(); i++){
            LinearLayout linearLayout1 = (LinearLayout) linearLayout.getChildAt(i);
            for(int j = 0; j < linearLayout1.getChildCount(); j++){
                Button button = (Button) linearLayout1.getChildAt(j);
                button.setTag(Integer.toString(i)+Integer.toString(j));
            }
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

        board.setValue(map);

        firebase.child("board").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                Iterator<DataSnapshot> iterator = dataSnapshot.getChildren().iterator();
                while(iterator.hasNext()){
                    DataSnapshot ds = iterator.next();
                    int xCoordinate = Integer.parseInt(dataSnapshot.getKey());
                    int yCoordinate = Integer.parseInt(ds.getKey());
                    Button b = (Button) findViewById(R.id.board).findViewWithTag(dataSnapshot.getKey()+ds.getKey());
                    if(ds.getValue() == true){
                        b.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        map.get(xCoordinate).set(yCoordinate,true);
                    }else{
                        b.getBackground().clearColorFilter();
                        map.get(xCoordinate).set(yCoordinate,false);
                    }
                }
            }
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
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
        String buttonCoordinate = (String) button.getTag();

        int xCoordinate = Integer.parseInt(buttonCoordinate.substring(0,1));
        int yCoordinate = Integer.parseInt(buttonCoordinate.substring(1));

        if (map.get(xCoordinate).get(yCoordinate)) {
            button.getBackground().clearColorFilter();
            map.get(xCoordinate).set(yCoordinate, false);
            board.child(Integer.toString(xCoordinate)).child(Integer.toString(yCoordinate)).setValue(false);
        } else {
            button.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            map.get(xCoordinate).set(yCoordinate,true);
            board.child(Integer.toString(xCoordinate)).child(Integer.toString(yCoordinate)).setValue(true);
        }
    }

    public void addBar(View view){
        if(numCols < 15){
            map.add(new ArrayList<Boolean>());
            numCols++;
            for(int j = 0; j < 8; j++){
                map.get(numCols).add(false);
            }
            board.setValue(map);
        }
    }

    public void removeBar(View view){
        if(numCols != 0){
            LinearLayout a = (LinearLayout) findViewById(R.id.board);
            int id = getResources().getIdentifier("c" + (numCols+1), "id", getPackageName());
            View v = findViewById(id);
            a.removeView(v);
            map.remove(numCols);
            numCols--;
            board.setValue(map);
        }
    }
}
