package com.example.in0418gq.staticredyellowfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RedFragment redFragment=new RedFragment();
    private YellowFragment yellowFragment=new YellowFragment();

    private static final String RED_TAG="RED";
    private static final String YELLOW_TAG="Yellow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showYellowFragment();
    }
    private void showYellowFragment(){

        FragmentManager fm =getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(android.R.id.content,redFragment,RED_TAG);
        ft.addToBackStack(YELLOW_TAG);
        ft.commit();

    }



}
