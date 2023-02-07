package com.example.espressotestingactivity

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

   @get:Rule var scenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun check() {

        // To fill given data in the edittext with closekeyboard
        onView(withId(R.id.etname)).perform(typeText(testingData), closeSoftKeyboard())

        // To check the button
        onView(withId(R.id.btn_submit)).perform(click())

        // To show the data in the textview
        onView(withId(R.id.tv_hint)).check(matches(ViewMatchers.withText(testingData)))

    }

    companion object {
        var testingData = "Hello Dev"
    }

    /**
     * Use [ActivityScenarioRule] to create and launch the activity under test before each test,
     * and close it after each test. This is a replacement for
     * [androidx.test.rule.ActivityTestRule].
     */

    // @LargeTest should be focused on testing integration of all application components.
}