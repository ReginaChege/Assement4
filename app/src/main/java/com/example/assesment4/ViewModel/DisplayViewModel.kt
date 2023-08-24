package com.example.assesment4.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.assesment4.Model.Display
import com.example.assesment4.Repository.DisplayRepository
import kotlinx.coroutines.launch

class  DisplayViewModel {
    var DisplayRepo= DisplayRepository()
    var errorLiveData=MutableLiveData<String>()
    var displayLiveData=MutableLiveData<List<Display>>()
    fun fetchDispaly(){
        viewModelScope.launch {
            val response = DisplayRepository.getDisplay()
            if (response.isSuccessful){
                val display=response.body()?: emptyList()

                displayLiveData.postValue(display)
            }
            else{
                displayLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
    }
}