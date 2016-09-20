package com.example.in0418gq.staticredyellowfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by in0418gq on 9/20/16.
 */
public class RedFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       View view = inflater.inflate(R.layout.red_fragment,container,false);
        int random= -1;

        if(getArguments() != null){
            random = getArguments().getInt(MainActivity.Random_Bu,-1);
        }
        TextView showRandomTV= (TextView) view.findViewById(R.id.red_fragment_random);

        if(random == -1){
            showRandomTV.setText("No random number received :(");
        }
        else {
            showRandomTV.setText("the random number is "+ random);
        }
        return view;
    }
}
