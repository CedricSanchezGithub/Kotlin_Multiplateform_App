package com.example.kotlinmultiplatformapp

import androidx.compose.runtime.Composable
import com.example.kotlinmultiplatformapp.ui.HomeScreen
import com.example.kotlinmultiplatformapp.viewmodels.UiViewModel


@Composable
fun ComposeMPApp(){

    HomeScreen(viewModel = UiViewModel())

}