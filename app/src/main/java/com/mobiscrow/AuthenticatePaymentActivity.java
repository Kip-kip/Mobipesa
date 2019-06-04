package com.mobiscrow;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AuthenticatePaymentActivity extends AppCompatActivity {

    Button continuue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authenticatepayment);

        continuue=findViewById(R.id.btnContinue);

        continuue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(AuthenticatePaymentActivity.this, MyTransactionsActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
                finish();

            }
        });

    }

    public void onBackPressed(){
        Intent it = new Intent(AuthenticatePaymentActivity.this, TransactionsSummaryActivity.class);
        it.putExtra("INDIC", "PENDING");
        it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);
        finish();
    }

}
