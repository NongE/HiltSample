package com.project.hiltsample.inject

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

interface Table {
    fun getTableNumber(): String
}

class TableNumberThree: Table{
    override fun getTableNumber(): String {
        return "Table Number: 3"
    }
}

class TableNumberSix: Table{
    override fun getTableNumber(): String {
        return "Table Number: 6"
    }
}

@Module
@InstallIn(SingletonComponent::class)
object HiltSampleModule {
    @Provides
    fun provideTableClass(): Table{
        return TableNumberThree()
    }
}