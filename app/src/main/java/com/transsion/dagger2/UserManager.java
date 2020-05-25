package com.transsion.dagger2;

import android.content.Intent;
import android.util.Log;

/**
 * Created by xuecci on 2020/5/22.
 * Email: xuecci@gmail.com
 */
public class UserManager {

    public void performLogin(String name, String pwd) {
        Log.d(name,pwd);
    }

    public void startActivity(Intent intent) {};
}
