package com.fendy.retrofitexamplekotlin

import com.google.gson.annotations.SerializedName

data class DataResponse(
    @SerializedName("active") var active : String,
    @SerializedName("admin") var admin : String,
    @SerializedName("_id") var Id : String,
    @SerializedName("name") var name : String,
    @SerializedName("phone") var phone : String,
    @SerializedName("email") var email : String,
    @SerializedName("password") var password : String,
    @SerializedName("token") var token : String,
    @SerializedName("division") var division : String,
    @SerializedName("defaultArea") var defaultArea : String,
    @SerializedName("defaultBrand") var defaultBrand : String
)