package com.example.jetpack_compose

import kotlinx.serialization.Serializable

sealed class routes {
    @Serializable
    object Login

    @Serializable
    object Details
}