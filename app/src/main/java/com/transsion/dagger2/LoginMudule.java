package com.transsion.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xuecci on 2020/5/22.
 * Email: xuecci@gmail.com
 */
@Module
public class LoginMudule {
    @Provides
    public UserManager providerUserManager() {
        return new UserManager();
    }
}
