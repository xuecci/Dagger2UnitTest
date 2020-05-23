package com.transsion.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginComponent loginComponent = ComponentHolder.getLoginComponent();
        if (loginComponent == null) {
            loginComponent = DaggerLoginComponent.builder().build();
        }
        loginComponent.inject(MainActivity.this);
        findViewById(R.id.login).setOnClickListener(v -> mLoginPresenter.login("Ryan","123456"));
    }
}
