package com.bunker.collegeProject.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bunker.collegeProject.Attendance_Second_Screen;
import com.bunker.collegeProject.R;

public class MarkAttendance extends Fragment {

     CardView cardView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.e("\n","\n MARK ATTENDANCE FRAGMENT");
        View v=inflater.inflate(R.layout.mark_attendance, container, false);
        cardView=v.findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Attendance_Second_Screen.class));
            }
        });
        return v;
    }

}
