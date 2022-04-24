package com.mobiscrow;
import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TransactionsSummaryActivity extends AppCompatActivity {
    ImageView back;
     Button approve,decline,dispute;
     RelativeLayout body;
     TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transactions_summary);

        back=findViewById(R.id.back);
        approve=findViewById(R.id.btnApprove);
        decline=findViewById(R.id.btnDecline);
        body=findViewById(R.id.main_layout);
        status=findViewById(R.id.txt_transaction_status);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Intent it = new Intent(TransactionsSummaryActivity.this, MainActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
                finish();


            }
        });

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(TransactionsSummaryActivity.this, MainActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
                finish();


            }
        });

        //Collecting passed indicator


        Intent intent = getIntent();
        String indic= intent.getStringExtra("INDIC");


            if(indic.equals("COMPLETED")){



            }
            else if(indic.equals("PENDING")){

                approve.setVisibility(View.VISIBLE);
                decline.setVisibility(View.VISIBLE);
                status.setText("Pending");
               // body.setBackgroundColor(Color.blue(1));
            }
            else if(indic.equals("FAILED")){
            }
            else{

            }

//when approve is clicked
        approve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(TransactionsSummaryActivity.this, AuthenticatePaymentActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();


            }
        });


    }

    public void onBackPressed(){
        Intent it = new Intent(TransactionsSummaryActivity.this, MainActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
        finish();
    }
}
