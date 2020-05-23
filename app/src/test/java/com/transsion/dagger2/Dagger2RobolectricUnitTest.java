package com.transsion.dagger2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.robolectric.annotation.Config;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import it.cosenonjaviste.daggermock.DaggerMockRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@Config(sdk = 28)
public class Dagger2RobolectricUnitTest {

    @Rule public final DaggerMockRule<LoginComponent> rule = new DaggerMockRule<>(LoginComponent.class, new LoginModule()).set(ComponentHolder::setLoginComponent);

    @Mock
    UserManager userManager;

    @Test
    public void testDaggerLogin() {
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.login)).perform(click());
        Mockito.verify(userManager).performLogin("Ryan","123456");
    }
}