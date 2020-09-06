package com.example.anroid_a2.model

import androidx.lifecycle.MutableLiveData

class Model {
    private var counter = 0
   private val counterLiveData = MutableLiveData<Int>()

    fun riseCounter() {
        counter++
        counterLiveData.value = counter
    }
    fun counterLiveData()=counterLiveData
}