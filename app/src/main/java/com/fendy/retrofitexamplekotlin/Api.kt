package com.fendy.retrofitexamplekotlin

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("posts")
//    @GET("user")
    fun getPosts(): Call<ArrayList<PostResponse>>
}