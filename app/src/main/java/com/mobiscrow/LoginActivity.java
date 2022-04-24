package com.mobiscrow;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Timer;
import java.util.TimerTask;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.graphics.Matrix.ScaleToFit.START;
import static android.view.Gravity.END;

public class LoginActivity extends AppCompatActivity {


    TextView signup ,login ,forgotpin ,txtAcc;
    LinearLayout loadingview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        signup = findViewById(R.id.txtSignup);
        login = findViewById(R.id.btnLogin);
        forgotpin = findViewById(R.id.txtForgotPin);
        loadingview=findViewById(R.id.loading_view);
        txtAcc=findViewById(R.id.txtAccount);


        //see onboarding screens again
        txtAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // We normally won't show the welcome slider again in real app
                // but this is for testing
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // make first time launch TRUE
                prefManager.setFirstTimeLaunch(true);
                Intent it = new Intent(LoginActivity.this,WelcomeActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_up,R.anim.nothing);
                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_up,R.anim.nothing);
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //hide login button
                login.setVisibility(View.GONE);
                //unhide loading view
                loadingview.setVisibility(View.VISIBLE);

                Intent it = new Intent(LoginActivity.this,LoginPinActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();


            }
        });

        forgotpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(LoginActivity.this,ForgotPinActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();
            }
        });




    }



    @Override
    public void onBackPressed() {
        finish();
//        new FancyAlertDialog.Builder(LoginActivity.this)
//                .setTitle("Rate us if you like the app")
//                .setBackgroundColor(Color.parseColor("#450072"))  //Don't pass R.color.colorvalue
//                .setMessage("Do you really want to Exit ?")
//                .setNegativeBtnText("Cancel")
//                .setPositiveBtnBackground(Color.parseColor("#00E7FF"))  //Don't pass R.color.colorvalue
//                .setPositiveBtnText("Rate")
//                .setNegativeBtnBackground(Color.parseColor("#FC751A"))  //Don't pass R.color.colorvalue
//                .setAnimation(Animation.POP)
//                .isCancellable(true)
//                .setIcon(R.drawable.ic_star_border_black_24dp, Icon.Visible)
//                .OnPositiveClicked(new FancyAlertDialogListener() {
//                    @Override
//                    public void OnClick() {
//                        //Toast.makeText(getApplicationContext(),"Rate",Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .OnNegativeClicked(new FancyAlertDialogListener() {
//                    @Override
//                    public void OnClick() {
//                        finish();
//                    }
//                })
//                .build();

    }


}
