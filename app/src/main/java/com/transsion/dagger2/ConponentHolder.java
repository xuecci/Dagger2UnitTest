package com.transsion.dagger2;

/**
 * Created by xuecci on 2020/5/23.
 * Email: xuecci@gmail.com
 */
public class ConponentHolder {
    public static LoginConponent mloginConponent;
    public static void setLoginConponent(LoginConponent loginConponent) {
        mloginConponent = loginConponent;
    }

    public static LoginConponent getLoginConponent() {
        return mloginConponent;
    }
}
