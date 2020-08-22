package com.stackinflow.androidapptemplate.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.stackinflow.androidapptemplate.R
import com.stackinflow.androidapptemplate.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  private val viewModel: MainViewModel by viewModels()
  lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    viewModel.viewState.observe(
      this,
      Observer {
        Toast.makeText(this, "$it", Toast.LENGTH_SHORT)
          .show()
      }
    )

    binding.btnJokes.setOnClickListener {
      viewModel.getJokes()
    }
  }
}
