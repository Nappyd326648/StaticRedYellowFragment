package com.example.in0418gq.staticredyellowfragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

/**
 * Created by in0418gq on 9/20/16.
 */
public class YellowFragment extends Fragment{

    RandomNumberGeneratedListener randomListener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.yellow_fragment,container,false);

        Button sendRndToRed=(Button) view.findViewById(R.id.send_rnd);
        sendRndToRed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Random rng =new Random();
                int rnd =rng.nextInt(100);
               randomListener.sendRandomNumber(rnd);
            }
        });
        return view;
    }
    @Override
    public  void onAttach(Context context){
        super.onAttach(context);
        if(getActivity() instanceof RandomNumberGeneratedListener){
            randomListener =(RandomNumberGeneratedListener) getActivity();
        }
        else {
            throw new R
        }
    }
}
