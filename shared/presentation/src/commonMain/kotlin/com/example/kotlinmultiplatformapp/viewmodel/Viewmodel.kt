package com.example.kotlinmultiplatformapp.viewmodel

import kotlinx.coroutines.CoroutineScope

expect open class Viewmodel() {

   val viewModelScope: CoroutineScope

}