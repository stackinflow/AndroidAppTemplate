package com.stackinflow.androidapptemplate.buildsrc

object Lib {

  const val ANDROID_GRADLE_PLUGIN = "com.android.tools.build:gradle:4.2.0-alpha05"

  object Androidx {
    const val CORE_KTX = "androidx.core:core-ktx:1.3.0"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.1.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"

    object Test {
      const val EXT_JUNIT = "androidx.test.ext:junit:1.1.1"
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
    private const val KOTLIN_VERSION = "1.3.72"
    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
    const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
  }

  object Logger {
    const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
  }

  object Square {
    const val LEAK_CANARY = "com.squareup.leakcanary:leakcanary-android:2.4"
  }

  object Test {
    const val JUNIT = "junit:junit:4.13"
  }
}