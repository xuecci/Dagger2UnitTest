package com.transsion.dagger2;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import it.cosenonjaviste.daggermock.DaggerMockRule;
import it.cosenonjaviste.daggermock.InjectFromComponent;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class DaggerMockUnitTest {

    @Rule
    public final DaggerMockRule<LoginComponent> rule = new DaggerMockRule<>(LoginComponent.class, new LoginModule());

    @Mock
    UserManager userManager;

    @InjectFromComponent
    LoginPresenter loginPresenter;

    @Test
    public void testLogin() {
        loginPresenter.login("Ryan","12345");
        Mockito.verify(userManager).performLogin("Ryan","12345");
    }
}