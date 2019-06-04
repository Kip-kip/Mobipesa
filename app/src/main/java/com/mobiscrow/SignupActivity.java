package com.mobiscrow;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        login = findViewById(R.id.txtLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.slide_up,R.anim.nothing);
                finish();
            }
        });

    }

    public void onBackPressed(){
       Intent it = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_up,R.anim.nothing);
        finish();
    }
}
