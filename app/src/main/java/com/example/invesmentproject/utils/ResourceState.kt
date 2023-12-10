package com.example.invesmentproject.utils

sealed class ResourceState<T> {

    class Loading<T> : ResourceState<T>()
    data class Success<T>(val data: T) : ResourceState<T>()
    data class Error<T>(val error: T) : ResourceState<T>()
}
