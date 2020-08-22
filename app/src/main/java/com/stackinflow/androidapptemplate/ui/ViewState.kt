package com.stackinflow.androidapptemplate.ui

sealed class ViewState {
  object Idle : ViewState()
  data class Success<T>(val data: T? = null) : ViewState()
  object Loading : ViewState()
  data class Error<T>(val error: T? = null) : ViewState()
}
