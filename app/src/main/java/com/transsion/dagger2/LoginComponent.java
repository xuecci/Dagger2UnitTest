package com.transsion.dagger2;

import dagger.Component;

/**
 * Created by xuecci on 2020/5/22.
 * Email: xuecci@gmail.com
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {
    void inject(MainActivity activity);
    LoginPresenter getLoginPresenter();
}
