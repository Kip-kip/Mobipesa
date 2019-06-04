package com.mobiscrow;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WithdrawalRequestActivity extends AppCompatActivity {

    Button transfer;
    LinearLayout loadingview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdrawalrequest);

        transfer=findViewById(R.id.btnTransfer);
        loadingview=findViewById(R.id.loading_view);

        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hide login button
                transfer.setVisibility(View.GONE);
                //unhide loading view
                loadingview.setVisibility(View.VISIBLE);

                Intent it = new Intent(WithdrawalRequestActivity.this, WithdrawalSuccessActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_right,R.anim.nothing);
                finish();

            }
        });

    }

    public void onBackPressed(){
        Intent it = new Intent(WithdrawalRequestActivity.this, ManageBalanceActivity.class);
       startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
        finish();
    }

}
