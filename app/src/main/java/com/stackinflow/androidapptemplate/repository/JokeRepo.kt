package com.stackinflow.androidapptemplate.repository

import com.stackinflow.androidapptemplate.network.api.JokeApiService
import com.stackinflow.androidapptemplate.network.model.JokesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class JokeRepo @Inject constructor(
  private val jokeApiService: JokeApiService
) {
  suspend fun getJokes(): Response<JokesResponse> {
    return withContext(Dispatchers.IO) {
      jokeApiService.getJokes()
    }
  }
}
