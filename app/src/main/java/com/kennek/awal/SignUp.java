package com.kennek.awal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    private Button signUpButton;
    private EditText studentId;
    private EditText username;
    private EditText email;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void click(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.link_login:
                intent = new Intent(this, SignIn.class);
                startActivity(intent);
                break;
            case R.id.btn_signup:
                intent = new Intent(this, Main.class);
                startActivity(intent);
                break;
        }

    }
}
