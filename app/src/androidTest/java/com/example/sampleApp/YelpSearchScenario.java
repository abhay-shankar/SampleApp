package com.example.sampleApp;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.sampleApp.view.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class YelpSearchScenario {

    @Test
    public void verifyYelpSearch() {
        RepoMock.serviceMock();
        ActivityScenario.launch(MainActivity.class);
        Espresso.onView(withId(R.id.business_title)).check(matches(isDisplayed()));
    }
}
