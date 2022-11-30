package com.cit.k_retrofit_maad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cit.k_retrofit_maad.model.ResponsePosts
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var dto: PostDTO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dto.getPosts().enqueue(object : Callback<ResponsePosts> {
            override fun onResponse(call: Call<ResponsePosts>, response: Response<ResponsePosts>) {
                Log.i("TAG", "post : ${response.body()} ")
            }

            override fun onFailure(call: Call<ResponsePosts>, t: Throwable) {

            }
        })


//        RetrofitClient.getPostDto().getPosts().enqueue(object : Callback<ResponsePosts> {
//            override fun onResponse(call: Call<ResponsePosts>, response: Response<ResponsePosts>) {
//                Log.i("TAG", "post : ${response.body()} ")
//            }
//
//            override fun onFailure(call: Call<ResponsePosts>, t: Throwable) {
//                Log.i("TAG", "post : ${t.localizedMessage} ")
//            }
//        })


    }


}