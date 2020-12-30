package com.stackinflow.androidapptemplate.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  private val viewModel: MainViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    addObservers()

    setContentViewFromCompose()
  }

  private fun setContentViewFromCompose() {
    setContent {
      Box(
        modifier = Modifier.fillMaxHeight()
          .fillMaxWidth()
      ) {
        Button(
          onClick = { viewModel.getJokes() },
          modifier = Modifier.align(Alignment.Center)
        ) {
          Text(text = "Get Data")
        }
      }
    }
  }

  private fun addObservers() {
    viewModel.viewState.observe(
      this,
      {
        Toast.makeText(this, "$it", Toast.LENGTH_SHORT)
          .show()
      }
    )
  }
}
