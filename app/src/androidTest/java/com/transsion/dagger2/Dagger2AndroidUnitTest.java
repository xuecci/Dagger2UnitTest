package com.transsion.dagger2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import it.cosenonjaviste.daggermock.DaggerMockRule;
import it.cosenonjaviste.daggermock.InjectFromComponent;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class Dagger2AndroidUnitTest {

    @Rule public DaggerMockRule<LoginConponent> daggerRule = new DaggerMockRule<>(LoginConponent.class, new LoginMudule()).set(ConponentHolder::setLoginConponent);

    @Mock
    UserManager userManager;

    @Test
    public void testDaggerLogin() {
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.login)).perform(click());
        Mockito.verify(userManager).performLogin("Ryan","123456");
    }
}