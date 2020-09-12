package com.stackinflow.androidapptemplate.ui

import androidx.test.core.app.ActivityScenario
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
  }
}
