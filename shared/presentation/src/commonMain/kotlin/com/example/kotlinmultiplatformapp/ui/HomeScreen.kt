package com.example.kotlinmultiplatformapp.ui

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.example.kotlinmultiplatformapp.model.HomePageState
import com.example.kotlinmultiplatformapp.viewmodels.UiViewModel

@Composable
fun HomeScreen( viewModel: UiViewModel) {

    when(viewModel.viewState.collectAsState().value){

        is HomePageState.Loading -> CircularProgressIndicator()
        is HomePageState.Failure -> Text("Failure")
        is HomePageState.Success -> Home(viewModel = viewModel)

    }
}