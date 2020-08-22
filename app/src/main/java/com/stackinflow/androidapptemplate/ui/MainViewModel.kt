package com.stackinflow.androidapptemplate.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.stackinflow.androidapptemplate.repository.JokeRepo

class MainViewModel @ViewModelInject constructor(
  private val jokeRepo: JokeRepo
) : ViewModel()
