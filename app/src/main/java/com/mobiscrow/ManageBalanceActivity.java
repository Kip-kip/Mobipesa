package com.mobiscrow;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ManageBalanceActivity extends AppCompatActivity {
    ImageView back;
    Button transfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_balance);

          back=findViewById(R.id.back);
                transfer=findViewById(R.id.btnTransfer);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(ManageBalanceActivity.this, MainActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
                finish();

            }
        });

        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(ManageBalanceActivity.this,WithdrawalRequestActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();

            }
        });



    }
    public void onBackPressed(){
       Intent it = new Intent(ManageBalanceActivity.this, MainActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
        finish();
    }
}
