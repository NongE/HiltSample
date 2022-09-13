package com.project.hiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.project.hiltsample.inject.Food
import com.project.hiltsample.inject.Fruit
import com.project.hiltsample.inject.Table
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var constructorInject: Fruit

    @Inject
    lateinit var fieldInject: Food

    @Inject
    lateinit var moduleInject: Table

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("HiltSample", constructorInject.getFruitName())
        Log.d("HiltSample", fieldInject.getFoodName())
        Log.d("HiltSample", moduleInject.getTableNumber())
    }
}