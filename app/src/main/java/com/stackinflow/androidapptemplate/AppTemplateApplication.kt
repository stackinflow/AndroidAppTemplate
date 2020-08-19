package com.stackinflow.androidapptemplate

import android.app.Application
import android.os.StrictMode
import com.stackinflow.androidapptemplate.util.CrashReportingTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.DebugTree

@HiltAndroidApp
class AppTemplateApplication : Application() {

  override fun onCreate() {
    turnOnStrictMode()
    super.onCreate()

    plantTimber()
  }

  private fun plantTimber() {
    if (BuildConfig.DEBUG) {
      Timber.plant(DebugTree())
    } else {
      Timber.plant(CrashReportingTree())
    }
  }

  private fun turnOnStrictMode() {
    if (BuildConfig.DEBUG) {
      StrictMode.setThreadPolicy(
        StrictMode.ThreadPolicy.Builder()
          .detectAll()
          .penaltyLog()
          .build()
      )
      StrictMode.setVmPolicy(
        StrictMode.VmPolicy.Builder()
          .detectActivityLeaks()
          .detectFileUriExposure()
          .detectLeakedClosableObjects()
          .detectLeakedRegistrationObjects()
          .detectLeakedSqlLiteObjects()
          .penaltyLog()
          .build()
      )
    }
  }
}
