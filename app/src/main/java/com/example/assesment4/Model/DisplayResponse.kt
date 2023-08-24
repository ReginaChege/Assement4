package com.example.assesment4.Model

import com.google.gson.annotations.SerializedName

data class DisplayResponse(
    var title:String,
    @SerializedName("userId")var userId:Int,

)
