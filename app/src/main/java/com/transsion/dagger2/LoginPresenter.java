package com.transsion.dagger2;

import javax.inject.Inject;

/**
 * Created by xuecci on 2020/5/22.
 * Email: xuecci@gmail.com
 */
public class LoginPresenter {

    UserManager mUserManager;

    @Inject
    public LoginPresenter(UserManager usermanager) {
        mUserManager = usermanager;
    }

    public void login(String name, String pwd) {
        //some code ...
        mUserManager.performLogin(name,pwd);
    }
}
