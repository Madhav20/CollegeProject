package com.bunker.collegeProject.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bunker.collegeProject.Events_Second_Screen;
import com.bunker.collegeProject.R;

public class MyEvents extends Fragment {

    CardView cardView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.my_events, container, false);
       cardView=v.findViewById(R.id.event_cardView);
       cardView.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view)
           {
                startActivity(new Intent(getActivity(), Events_Second_Screen.class));
           }
       });
        return v;
    }

}
