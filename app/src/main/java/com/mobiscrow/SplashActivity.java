package com.mobiscrow;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Cyrus on 9/27/2017.
 */

public class SplashActivity extends AppCompatActivity {
    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 4000;
    ImageView logo;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent it = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
        /*animation*/

//        logo = (ImageView) findViewById(R.id.imageView);
//        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out_animation);
//        logo.startAnimation(startAnimation);

    }
}