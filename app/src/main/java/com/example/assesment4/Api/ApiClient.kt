package com.example.assesment4.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface ApiClient {
    var retrofit: Retrofit
        get() = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        set(value) = TODO()

    fun <T> buildClient(apiInterface:Class<T>):T{
        return retrofit.create(apiInterface)
    }
}