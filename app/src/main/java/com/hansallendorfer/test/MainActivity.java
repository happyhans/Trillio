package com.hansallendorfer.test;

import android.app.Fragment;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;


public class MainActivity extends ActionBarActivity {
    //List<Fragment> fragments;
    RadioGroup radiogroup1;
    RadioGroup radiogroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radiogroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        //fragments = new ArrayList<Fragment>();
    }
//



    public void play(View view){
        //get option from radiogroup1
//        int radioButtonID = radiogroup1.getCheckedRadioButtonId();
//        View radioButton = radiogroup1.findViewById(radioButtonID);
//        int radio1option = radiogroup1.indexOfChild(radioButton);

        //get option from radiogroup2
        int radioButtonID2 = radiogroup2.getCheckedRadioButtonId();
        View radioButton2 = radiogroup2.findViewById(radioButtonID2);
        int radio2option = radiogroup2.indexOfChild(radioButton2);

        //fragments.add(openPlay);
        Intent openPlay = new Intent(MainActivity.this,Play.class);
//        openPlay.putExtra("radio1option",radio1option);
        openPlay.putExtra("radio2option",radio2option);
        startActivity(openPlay);
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
