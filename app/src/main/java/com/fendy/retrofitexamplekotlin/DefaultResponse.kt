package com.fendy.retrofitexamplekotlin

import com.google.gson.annotations.SerializedName

data class DefaultResponse(
    @SerializedName("r") var r : String,
    @SerializedName("m") var m : String,
    @SerializedName("d") var d : List<DataResponse>
)