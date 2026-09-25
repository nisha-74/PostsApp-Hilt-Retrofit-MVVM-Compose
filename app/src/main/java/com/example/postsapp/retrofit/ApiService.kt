package com.example.postsapp.retrofit
import com.example.postsapp.model.Post
import retrofit2.http.GET

// define the structure of HTTP Api calls
interface ApiService {
    @GET("posts")
    suspend fun  getPosts(): List<Post>
}