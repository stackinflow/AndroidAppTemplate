package com.stackinflow.androidapptemplate.repository

import com.stackinflow.androidapptemplate.network.api.JokeApiService
import com.stackinflow.androidapptemplate.network.model.JokesResponse
import retrofit2.Response
import javax.inject.Inject

class JokeRepo @Inject constructor(
  private val jokeApiService: JokeApiService
) {
  suspend fun getJokes(): Response<JokesResponse> {
    return jokeApiService.getJokes()
  }
}
