package com.transsion.dagger2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class MockUnitTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    UserManager userManager;

    @Test
    public void testLogin() {
        LoginPresenter loginPresenter = new LoginPresenter(userManager);
        loginPresenter.login("Ryan","12345");
        Mockito.verify(userManager).performLogin("Ryan","12345");
    }
}