package com.example.kotlinmultiplatformapp.viewmodels

import kotlinx.coroutines.CoroutineScope

expect open class Viewmodel() {

   val viewModelScope: CoroutineScope

}