package com.bunker.collegeProject.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bunker.collegeProject.R;

public class ViewAttendance extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v= inflater.inflate(R.layout.fragment_view_attendance, container, false);
        return v;
    }

}
