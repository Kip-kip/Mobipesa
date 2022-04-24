package com.mobiscrow;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPinActivity extends AppCompatActivity {
Button btnforgot;
    private View parent_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_pin);

        btnforgot = findViewById(R.id.btnResetPin);
        parent_view = findViewById(android.R.id.content);
        btnforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackBarWithAction();

            }
        });


    }



    public void onBackPressed(){
        Intent it = new Intent(ForgotPinActivity.this, LoginActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
        finish();
    }

    private void snackBarWithAction() {
//        Snackbar snackbar = Snackbar.make(parent_view, "Welcome to Mobiscrow", Snackbar.LENGTH_LONG)
//         .setAction("", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Snackbar.make(parent_view, "UNDO CLICKED!", Snackbar.LENGTH_SHORT).show();
//                    }
//                });
//        View snackBarView = snackbar.getView();
//        snackBarView.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimaryDark));
//
//        snackbar.show();

        Snackbar mSnackBar = Snackbar.make(parent_view, "Welcome to Mobiscrow", Snackbar.LENGTH_LONG);
        View view = mSnackBar.getView();
        FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)view.getLayoutParams();
        params.gravity = Gravity.TOP;
        view.setLayoutParams(params);
        view.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimaryDark));
        TextView mainTextView = (TextView) (view).findViewById(android.support.design.R.id.snackbar_text);
        mainTextView.setTextColor(Color.WHITE);
        mSnackBar.show();




    }
}
