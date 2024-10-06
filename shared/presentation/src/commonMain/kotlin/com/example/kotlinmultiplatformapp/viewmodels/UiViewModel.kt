package com.example.kotlinmultiplatformapp.viewmodels

import com.example.kotlinmultiplatformapp.models.HomePageState
import com.example.kotlinmultiplatformapp.models.ObjectsUIModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class UiViewModel : Viewmodel(){

    private val _viewState = MutableStateFlow<HomePageState>(HomePageState.Loading)
    val viewState: StateFlow<HomePageState> = _viewState.asStateFlow()

    private val _objects = MutableStateFlow(ObjectsUIModel())
    val objects : StateFlow<ObjectsUIModel> = _objects.asStateFlow()

}