package com.kennek.awal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void click(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.link_signup:
                intent = new Intent(this, SignUp.class);
                startActivity(intent);
                break;
        }

    }

}
