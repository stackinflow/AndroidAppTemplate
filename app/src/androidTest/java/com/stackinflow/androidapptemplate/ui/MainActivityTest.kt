package com.stackinflow.androidapptemplate.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.stackinflow.androidapptemplate.R
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class MainActivityTest {

  @get:Rule
  var hiltRule = HiltAndroidRule(this)

  @Test
  fun happy_path() {
    ActivityScenario.launch(MainActivity::class.java)
    onView(withId(R.id.btn_jokes)).check(matches(isDisplayed()))

    // TODO use mockwebserver to get fake data to display
  }
}
