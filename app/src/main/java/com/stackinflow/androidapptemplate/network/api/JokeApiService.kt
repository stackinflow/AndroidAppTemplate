package com.stackinflow.androidapptemplate.network.api

import com.stackinflow.androidapptemplate.network.Endpoints
import com.stackinflow.androidapptemplate.network.model.JokesResponse
import retrofit2.Response
import retrofit2.http.GET

interface JokeApiService {

  @GET(Endpoints.GET_JOKES)
  suspend fun getJokes(): Response<JokesResponse>
}
