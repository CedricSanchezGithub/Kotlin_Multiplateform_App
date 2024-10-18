package com.example.kotlinmultiplatformapp.model

sealed class HomePageState {

    data object Loading: HomePageState()
    data object Failure: HomePageState()
    data class Success(val data: ObjectsUIModel): HomePageState()

}