package com.stackinflow.androidapptemplate.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.stackinflow.androidapptemplate.BuildConfig
import com.stackinflow.androidapptemplate.network.api.JokeApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit.SECONDS
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

  private const val TIMEOUT_IN_SECONDS = 15L

  @Provides
  @Singleton
  fun provideOkHttpClient(@ApplicationContext context: Context): OkHttpClient {
    return OkHttpClient.Builder()
      .apply {
        if (BuildConfig.DEBUG) {
          addInterceptor(
            HttpLoggingInterceptor().apply {
              level = HttpLoggingInterceptor.Level.BODY
            }
          )
          addInterceptor(ChuckerInterceptor(context))
        }
        connectTimeout(TIMEOUT_IN_SECONDS, SECONDS)
        writeTimeout(TIMEOUT_IN_SECONDS, SECONDS)
        readTimeout(TIMEOUT_IN_SECONDS, SECONDS)
      }
      .build()
  }

  @Provides
  @Singleton
  fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
      .client(okHttpClient)
      .baseUrl(BuildConfig.BASE_URL)
      .addConverterFactory(MoshiConverterFactory.create())
      .build()
  }

  @Provides
  @Singleton
  fun provideJokeApiService(retrofit: Retrofit): JokeApiService =
    retrofit.create(JokeApiService::class.java)
}
