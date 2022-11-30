package com.cit.k_retrofit_maad

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {





    companion object {
        var base_url = "https://jsonplaceholder.typicode.com"

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(base_url)
            .build()

        fun getPostDto(): PostDTO = retrofit.create(PostDTO::class.java)


    }


}