package com.mobiscrow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class NewTransactionActivity extends AppCompatActivity {
ImageView back;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_transaction);

       back=findViewById(R.id.back);
       btnSubmit=findViewById(R.id.btnSubmit);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(NewTransactionActivity.this, MainActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_left, R.anim.nothing);
                finish();
            }
        });


        //new transaction
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(NewTransactionActivity.this, DealSummaryActivity.class);

                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right, R.anim.nothing);
                finish();
            }
        });


    }

    public void onBackPressed(){
       Intent it = new Intent(NewTransactionActivity.this, MainActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
        finish();
    }


}
