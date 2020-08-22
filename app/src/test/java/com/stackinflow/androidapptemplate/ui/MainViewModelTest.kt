package com.stackinflow.androidapptemplate.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.stackinflow.androidapptemplate.network.model.Joke
import com.stackinflow.androidapptemplate.network.model.JokesResponse
import com.stackinflow.androidapptemplate.repository.JokeRepo
import com.stackinflow.androidapptemplate.util.TestCoroutineRule
import com.stackinflow.androidapptemplate.util.getOrAwaitValue
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import retrofit2.Response

class MainViewModelTest {

  /**
   * A JUnit Test Rule that swaps the background executor used by the Architecture Components
   * with a different one which executes each task synchronously.
   */
  @get: Rule
  val instantTaskExecutorRule = InstantTaskExecutorRule()

  @MockK
  lateinit var jokeRepo: JokeRepo

  @ExperimentalCoroutinesApi
  @get:Rule
  val testCoroutineRule = TestCoroutineRule()

  @Before
  fun setUp() {
    MockKAnnotations.init(this)
  }

  @After
  fun tearDown() {
  }

  @Test
  fun getJokesList_successResponse_updatesLiveData() {
    // Given a fresh MainViewModel
    coEvery { jokeRepo.getJokes() } returns Response.success(
      getJokeSuccessDummyData()
    )
    val viewModel = MainViewModel(jokeRepo)

    // When called getJokes
    viewModel.getJokes()

    // Then the liveData should update with mock data
    assertEquals(
      viewModel.viewState.getOrAwaitValue(), ViewState.Success(getJokeSuccessDummyData())
    )
  }

  private fun getJokeSuccessDummyData(): JokesResponse {
    return JokesResponse(
      "success",
      listOf(Joke(1, "joke", listOf("boo")))
    )
  }
}
