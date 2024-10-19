package com.example.kotlinmultiplatformapp

import androidx.compose.runtime.Composable
import com.example.kotlinmultiplatformapp.ui.HomeScreen
import com.example.kotlinmultiplatformapp.viewmodel.UiViewModel


@Composable
fun ComposeMPApp(){

    HomeScreen(viewModel = UiViewModel())

}
