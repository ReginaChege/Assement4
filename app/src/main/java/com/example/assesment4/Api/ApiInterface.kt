package com.example.assesment4.Api

import com.example.assesment4.Model.DisplayResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
interface ApiInterface {
        @POST("userId/title")
        suspend fun getDisplay(@Body DisplayResponse: DisplayResponse): Response<DisplayResponse>
}