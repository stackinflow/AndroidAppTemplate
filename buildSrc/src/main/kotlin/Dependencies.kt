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

  object Test {
    const val JUNIT = "junit:junit:4.13"
  }

  object Google {
    const val MATERIAL_DESIGN = "com.google.android.material:material:1.1.0"

  }

  object Kotlin {
    private const val KOTLIN_VERSION = "1.3.72"
    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
    const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
  }
}