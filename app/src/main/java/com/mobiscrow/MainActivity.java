package com.mobiscrow;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnManageBal;
    FloatingActionButton fab;
    ImageView gotosettings, view, userimage;
    ConstraintLayout datalist,datalist2;
    TextView view2;
    private View parent_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

       // initToolbar();



        btnManageBal=findViewById(R.id.btnManageBal);
        fab=findViewById(R.id.floatingActionButton);
        gotosettings=findViewById(R.id.gotosettings);
        view=findViewById(R.id.imageView3);
        view2=findViewById(R.id.textView4);
        datalist=findViewById(R.id.datalist);
        datalist2=findViewById(R.id.datalist2);
         userimage=findViewById(R.id.imageView2);
        parent_view = findViewById(android.R.id.content);


        btnManageBal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(MainActivity.this, ManageBalanceActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();



            }
        });

        //NEW TRANSACTION FAB
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(MainActivity.this, NewTransactionActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();
            }
        });

        //SETTINGS IMAGE
        gotosettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();

            }
        });

        //all transactions
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(MainActivity.this, MyTransactionsActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();
            }
        });
        //all transactions
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(MainActivity.this, MyTransactionsActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();
            }
        });

        //Recycler View Item Click
        datalist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, TransactionsSummaryActivity.class);
                it.putExtra("INDIC","COMPLETED");
                it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();

            }
        });

        //Recycler View Item 2 Click
        datalist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent it = new Intent(MainActivity.this, TransactionsSummaryActivity.class);
                it.putExtra("INDIC", "PENDING");
                it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();

            }
        });

        //CALL THE FUNCTION BELOW TO RESTRICT USER FUNCTIONALITY DURING SCREEN TRANSITIONS

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
//                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);




//CALL THE FUNCTION BELOW TO ALLOW NORMAL APP FUNCTIONALITY
        //getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);



    }




//    private void initToolbar() {
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        com.mobiscrow.utils.Tools.setSystemBarColor(this, R.color.colorPrimary);
//    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    public void onBackPressed(){
        Intent it = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
        finish();
    }
}
