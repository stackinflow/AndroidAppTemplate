package com.stackinflow.androidapptemplate.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Stack
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import com.stackinflow.androidapptemplate.R.string
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
      Stack(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { viewModel.getJokes() }, modifier = Modifier.gravity(Alignment.Center)) {
          Text(text = getString(string.get_jokes))
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
