package com.example.anroid_a2.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.anroid_a2.model.Model

class MainViewModel : ViewModel() {
    private val viewStateLiveData = MutableLiveData<String>()
    private val viewStateLiveData1 = MutableLiveData<Int>()
    private val model = Model()

    init {
        model.counterLiveData().observeForever {
            viewStateLiveData.value = "Hello! $it"

        }
        viewStateLiveData1.value = 0
    }

    fun getViewState(): LiveData<String> = viewStateLiveData

    fun buttonClick() {
        model.riseCounter()
    }
}
