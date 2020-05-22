package com.transsion.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginConponent loginConponent = ConponentHolder.getLoginConponent();
        if (loginConponent == null) {
            loginConponent = DaggerLoginConponent.builder().build();
        }
        loginConponent.inject(MainActivity.this);
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.login("Ryan","123456");
            }
        });
    }
}
