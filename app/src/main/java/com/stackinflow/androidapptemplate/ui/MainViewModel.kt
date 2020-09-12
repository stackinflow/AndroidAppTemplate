package com.stackinflow.androidapptemplate.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stackinflow.androidapptemplate.repository.JokeRepo
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
  private val jokeRepo: JokeRepo
) : ViewModel() {

  private val _viewState = MutableLiveData<ViewState>()
  val viewState: LiveData<ViewState> = _viewState

  fun getJokes() {
    viewModelScope.launch {
      val result = jokeRepo.getJokes()
      if (result.isSuccessful) {
        _viewState.postValue(ViewState.Success(result.body()))
      } else {
        _viewState.postValue(ViewState.Error(result.errorBody()))
      }
    }
  }
}
