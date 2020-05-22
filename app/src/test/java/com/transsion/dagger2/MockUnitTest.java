package com.transsion.dagger2;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MockUnitTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    UserManager userManager;

    @Test
    public void testLogin() {
        LoginPresenter loginPresenter = new LoginPresenter(userManager);
        loginPresenter.login("Ryan","12345");
        Mockito.verify(userManager).performLogin("Ryan","12345");
    }
}