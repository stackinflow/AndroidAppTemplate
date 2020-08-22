package com.stackinflow.androidapptemplate.network.model

data class JokesResponse(
  val type: String,
  val value: List<Joke>
)

data class Joke(
  val id: Int,
  val joke: String,
  val categories: List<String>
)
