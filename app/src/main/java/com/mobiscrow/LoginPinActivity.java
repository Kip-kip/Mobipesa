package com.mobiscrow;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPinActivity extends AppCompatActivity {

    private View parent_view;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_pin);
        login = findViewById(R.id.btnLoginPin);

        parent_view = findViewById(android.R.id.content);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LoginPinActivity.this,MainActivity.class);
                startActivity(it);
                //FancyToast.makeText(LoginPinActivity.this,"Welcome aboard",FancyToast.LENGTH_LONG, FancyToast.SUCCESS,false).show();


            }
        });
    }



}
