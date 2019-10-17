package com.bunker.collegeProject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;



public class LoginActivity extends Activity
{
    Button login_button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        login_button=findViewById(R.id.logInButton);

        View v=getWindow().getDecorView();
        int ui= View.SYSTEM_UI_FLAG_FULLSCREEN;
        v.setSystemUiVisibility(ui);

    }
    public void openActivity2(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


}
