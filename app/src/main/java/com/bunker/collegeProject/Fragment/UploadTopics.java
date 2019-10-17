package com.bunker.collegeProject.Fragment;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.bunker.collegeProject.R;


public class UploadTopics extends Fragment {

    Button select_topics,ok_button,cancel_button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.upload_topics, container, false);
        select_topics =v.findViewById(R.id.selectTopics);

        select_topics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog=new Dialog(getActivity());
                dialog.setContentView(R.layout.select_topic_dialog);

                ok_button=dialog.findViewById(R.id.selectButton);
                cancel_button=dialog.findViewById(R.id.cancelButton);
                ok_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                cancel_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });

                dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                dialog.show();
            }
        });


        return v;
    }


}
