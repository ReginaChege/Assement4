package com.example.assesment4.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.assesment4.Model.DisplayRequest
import com.example.assesment4.Model.DisplayResponse
import com.example.assesment4.Repository.DisplayRepository

class DisplayViewModel {
    var DisplayRepository=DisplayRepository()
    var errorLiveData=MutableLiveData<Int>()
    var displayLiveData=MutableLiveData<DisplayResponse>()

    }
}