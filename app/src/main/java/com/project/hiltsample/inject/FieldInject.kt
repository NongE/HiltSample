package com.project.hiltsample.inject

import javax.inject.Inject

class Food @Inject constructor() {
    fun getFoodName(): String {
        return "This is Chicken"
    }
}