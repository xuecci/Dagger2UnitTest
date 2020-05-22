package com.transsion.dagger2;

import dagger.Component;

/**
 * Created by xuecci on 2020/5/22.
 * Email: xuecci@gmail.com
 */
@Component(modules = LoginMudule.class)
public interface LoginConponent {
    void inject(MainActivity activity);
}
