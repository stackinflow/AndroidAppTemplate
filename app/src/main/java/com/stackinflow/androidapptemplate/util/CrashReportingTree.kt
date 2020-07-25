package com.stackinflow.androidapptemplate.util

import android.util.Log
import timber.log.Timber

class CrashReportingTree : Timber.Tree() {

  override fun isLoggable(tag: String?, priority: Int): Boolean {
    return priority >= Log.INFO
  }

  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    /*
    use your crashlytics tools
    */
  }
}
