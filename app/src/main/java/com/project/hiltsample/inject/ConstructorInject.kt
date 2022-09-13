package com.project.hiltsample.inject

import javax.inject.Inject

class Fruit @Inject constructor(private val orange: Orange) {
    fun getFruitName(): String {
        return orange.getName()
    }
}

class Orange @Inject constructor() {
    fun getName(): String{
        return "This is Orange"
    }
}