package com.cit.k_retrofit_maad

import com.cit.k_retrofit_maad.model.ResponsePosts
import com.cit.k_retrofit_maad.model.ResponsePostsItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface PostDTO {

    @GET("/posts")
    fun getPosts(): Call<ResponsePosts>

}