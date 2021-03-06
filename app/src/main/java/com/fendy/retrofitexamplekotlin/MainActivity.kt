package com.fendy.retrofitexamplekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<PostResponse>()
    private val userList = ArrayList<UsersResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rVPost.setHasFixedSize(true)
        rVPost.layoutManager = LinearLayoutManager(this)
//        getDataPost();
        getDataUsers()
    }

    private fun getDataPost (){
        RetrofitClient.instance.getPosts().enqueue(object: Callback<ArrayList<PostResponse>>{
            override fun onFailure(call: Call<ArrayList<PostResponse>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<ArrayList<PostResponse>>,
                response: Response<ArrayList<PostResponse>>
            ) {
                val responseCode = response.code().toString()
                tvResponseCode.text = responseCode
                response.body()?.let { list.addAll(it)}
                val adapter = PostAdapter(list)
                rVPost.adapter = adapter
            }

        })
    }

    private fun getDataUsers () {
        RetrofitClient.instance.getUsers().enqueue(object: Callback<ArrayList<UsersResponse>>{
            override fun onFailure(call: Call<ArrayList<UsersResponse>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<ArrayList<UsersResponse>>,
                response: Response<ArrayList<UsersResponse>>
            ) {
                val responseCode = response.code().toString()
                tvResponseCode.text = responseCode
                response.body()?.let { userList.addAll(it)}
                val userAdapter = UserAdapter(userList)
                rVPost.adapter = userAdapter
            }

        })
    }
}

