package com.example.anroid_a2.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.anroid_a2.model.NoteRepository
import com.example.anroid_a2.ui.main.MainViewState

class MainViewModel : ViewModel() {
    private val viewStateLiveData = MutableLiveData<MainViewState>()

    init {
        viewStateLiveData.value = MainViewState(NoteRepository.getNotes())
    }

    fun getViewState(): LiveData<MainViewState> = viewStateLiveData

}
