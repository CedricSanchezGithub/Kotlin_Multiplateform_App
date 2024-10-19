package com.example.kotlinmultiplatformapp.viewmodel

import com.example.kotlinmultiplatformapp.model.HomePageState
import com.example.kotlinmultiplatformapp.model.ObjectsUIModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class UiViewModel : Viewmodel(){

    private val _viewState = MutableStateFlow<HomePageState>(HomePageState.Loading)
    val viewState: StateFlow<HomePageState> = _viewState.asStateFlow()

    private val _objects = MutableStateFlow(ObjectsUIModel(country = "pays", movie = "film"))
    val objects : StateFlow<ObjectsUIModel> = _objects.asStateFlow()

    init{
        _viewState.value = HomePageState.Success(ObjectsUIModel(_objects.value.id, _objects.value.movie, _objects.value.country))
    }
}