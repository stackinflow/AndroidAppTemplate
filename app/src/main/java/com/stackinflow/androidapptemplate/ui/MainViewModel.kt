package com.stackinflow.androidapptemplate.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stackinflow.androidapptemplate.network.model.JokesResponse
import com.stackinflow.androidapptemplate.repository.JokeRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel @ViewModelInject constructor(
  private val jokeRepo: JokeRepo
) : ViewModel() {

  private val _jokeListResponse = MutableLiveData<JokesResponse>()
  val jokeListResponse: LiveData<JokesResponse> = _jokeListResponse

  fun getJokes() {
    viewModelScope.launch {
      withContext(Dispatchers.IO) {
        val result = jokeRepo.getJokes()
        if (result.isSuccessful) {
          _jokeListResponse.postValue(result.body())
        }
      }
    }
  }
}
