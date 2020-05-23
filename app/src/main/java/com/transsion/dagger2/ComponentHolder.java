package com.transsion.dagger2;

/**
 * Created by xuecci on 2020/5/23.
 * Email: xuecci@gmail.com
 */
public class ComponentHolder {
    private static LoginComponent LoginComponent;
    public static void setLoginComponent(LoginComponent loginComponent) {
        LoginComponent = loginComponent;
    }

    public static LoginComponent getLoginComponent() {
        return LoginComponent;
    }
}
