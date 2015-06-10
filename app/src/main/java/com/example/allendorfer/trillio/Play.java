package com.example.allendorfer.trillio;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.HashMap;
import java.util.Map;

/* New age */

public class Play extends Activity {

    Map<String, Boolean> map;
    Firebase firebase;
    Firebase board;

    public void initialize(){
        map = new HashMap<>();
        for(int i = 1; i <= 64; i++){
            String b = "button" + i;
            map.put(b, false);
        }
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
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String key = dataSnapshot.getKey();
                int id = getResources().getIdentifier(key, "id", getPackageName());
                Button button = (Button) findViewById(id);

                if(dataSnapshot.getValue() == true){
                    button.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    map.put(dataSnapshot.getKey(), true);
                }else{
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

}
