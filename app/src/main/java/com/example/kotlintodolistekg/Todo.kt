package com.example.kotlintodolistekg

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)