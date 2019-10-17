package com.bunker.collegeProject;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import com.bunker.collegeProject.Fragment.About;
import com.bunker.collegeProject.Fragment.Feedback;
import com.bunker.collegeProject.Fragment.MarkAttendance;
import com.bunker.collegeProject.Fragment.MyEvents;
import com.bunker.collegeProject.Fragment.Setting;
import com.bunker.collegeProject.Fragment.UploadTopics;
import com.bunker.collegeProject.Fragment.ViewAttendance;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity  implements
        NavigationView.OnNavigationItemSelectedListener{


    NavigationView navigationView;
    Fragment fragment=null;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        navigationView= findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        if(savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                    new MarkAttendance()).commit();
            fragment=new MarkAttendance();
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }else {
            if(fragment instanceof MarkAttendance)
            {
                super.onBackPressed();
            }
            else{
                navigationView.setCheckedItem(R.id.nav_attendance);
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new MarkAttendance()).commit();
                fragment=new MarkAttendance();
            }
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_attendance:
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new MarkAttendance()).commit();
                toolbar.setTitle("Mark Attendance");
                fragment=new MarkAttendance();
            }
            break;


            case R.id.nav_upload_topics: {
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new UploadTopics()).commit();
                toolbar.setTitle("Classes");
                fragment=new UploadTopics();
            }
            break;

            case R.id.nav_events: {
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new MyEvents()).commit();
                toolbar.setTitle("My Events");
                fragment=new MyEvents();

            }
            break;


            case R.id.nav_setting:{
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new Setting()).commit();
                fragment=new Setting();
            }
            break;
            case R.id.nav_about:{
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new About()).commit();
                fragment=new About();
            }
            break;
            case R.id.feedback:
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new Feedback()).commit();

                fragment=new Feedback();
            }
            break;
            case R.id.view_attendance:
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.container_id,
                        new ViewAttendance()).commit();
                fragment=new ViewAttendance();
            }
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
