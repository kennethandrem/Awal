package com.kennek.awal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class SignIn extends AppCompatActivity {

    private LoginButton loginFacebookButton;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();
        loginFacebookButton = (LoginButton)findViewById(R.id.login_facebook_button);
        loginFacebookButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                goMainActivity();
            }

            @Override
            public void onCancel() {
                Toast.makeText(getApplicationContext(), "Has cancelado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException e) {
                Toast.makeText(getApplicationContext(), "Intenta de nuevo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void goMainActivity() {
        Intent intent = new Intent(this, Main.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
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
