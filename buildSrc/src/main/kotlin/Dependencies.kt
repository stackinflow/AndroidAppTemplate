package com.stackinflow.androidapptemplate.buildsrc

object Lib {

  const val ANDROID_GRADLE_PLUGIN = "com.android.tools.build:gradle:7.0.0-alpha03"

  object Androidx {
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:1.1.0"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.1.0"
    const val CORE_KTX = "androidx.core:core-ktx:1.3.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"

    object Compose {
      private const val COMPOSE_VERSION = "1.0.0-alpha08"
      const val UI = "androidx.compose.ui:ui:$COMPOSE_VERSION"
      const val MATERIAL = "androidx.compose.material:material:$COMPOSE_VERSION"
      const val TOOLING = "androidx.compose.ui:ui-tooling:$COMPOSE_VERSION"
      const val TESTING = "androidx.compose.ui:ui-test:$COMPOSE_VERSION"
    }

    object Hilt {
      private const val HILT_VERSION = "1.0.0-alpha01"

      const val LIFECYCLE_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:$HILT_VERSION"
      const val WORK = "androidx.hilt:hilt-work:$HILT_VERSION"

      const val COMPILER = "androidx.hilt:hilt-compiler:$HILT_VERSION"
    }

    object Test {
      const val EXT_JUNIT = "androidx.test.ext:junit-ktx:1.1.1"
      const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.2.0"
    }
  }

  object Google {

    object Dagger {
      private const val HILT_ANDROID_VERSION = "2.28.3-alpha"
      const val HILT_ANDROID = "com.google.dagger:hilt-android:$HILT_ANDROID_VERSION"
      const val HILT_ANDROID_COMPILER =
        "com.google.dagger:hilt-android-compiler:$HILT_ANDROID_VERSION"
      const val HILT_ANDROID_GRADLE_PLUGIN =
        "com.google.dagger:hilt-android-gradle-plugin:$HILT_ANDROID_VERSION"

      object Test {
        const val HILT_ANDROID_TESTING =
          "com.google.dagger:hilt-android-testing:$HILT_ANDROID_VERSION"
      }
    }

    const val MATERIAL_DESIGN = "com.google.android.material:material:1.1.0"
  }

  object Kotlin {
    private const val KOTLIN_VERSION = "1.4.20"
    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
    const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
    private const val COROUTINES_VERSION = "1.3.7"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINES_VERSION"
    const val COROUTINES =
      "org.jetbrains.kotlinx:kotlinx-coroutines-core:$COROUTINES_VERSION"
    const val COROUTINES_ANDROID =
      "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINES_VERSION"
  }

  object Logger {
    const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
  }

  object Square {
    const val LEAK_CANARY = "com.squareup.leakcanary:leakcanary-android:2.4"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.8.1"
    private const val RETROFIT_VERSION = "2.9.0"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    const val RETROFIT_MOSHI = "com.squareup.retrofit2:converter-moshi:$RETROFIT_VERSION"
  }

  object Test {
    const val ARCH_CORE = "androidx.arch.core:core-testing:2.1.0"
    const val CORE_TEST = "androidx.test:core-ktx:1.2.0"
    const val JUNIT = "junit:junit:4.13"
    const val ROBOELECTRIC = "org.robolectric:robolectric:4.3"

    object MOCK {
      private const val MOCKK_VERSION = "1.10.0"
      const val MOCKK = "io.mockk:mockk:$MOCKK_VERSION"
      const val ANDROID_MOCKK = "io.mockk:mockk-android:$MOCKK_VERSION"
      const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:4.7.2"
    }
  }

  object Chucker {
    private const val CHUCKER_VERSION = "3.2.0"
    const val CHUCKER_DEBUG = "com.github.chuckerteam.chucker:library:$CHUCKER_VERSION"
    const val CHUCKER_NO_OP_RELEASE =
      "com.github.chuckerteam.chucker:library-no-op:$CHUCKER_VERSION"
  }
}
