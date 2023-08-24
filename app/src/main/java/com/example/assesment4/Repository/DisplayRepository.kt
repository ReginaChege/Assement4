package com.example.assesment4.Repository

import com.example.assesment4.Api.ApiClient
import com.example.assesment4.Api.ApiInterface
import com.example.assesment4.Model.Display
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class DisplayRepository {
    val apiClient= ApiClient.buildClient(ApiInterface::class.java)
    suspend fun getDisplay(): Response<List<Display>> {
        return withContext(Dispatchers.IO){
            apiClient.getDisplay()
        }
    }
}