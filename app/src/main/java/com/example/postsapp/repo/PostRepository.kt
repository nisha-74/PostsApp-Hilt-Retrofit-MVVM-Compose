package com.example.postsapp.repo

import com.example.postsapp.model.Post
import com.example.postsapp.retrofit.ApiService
import javax.inject.Inject

class PostRepository @Inject constructor(private val apiService: ApiService)  {
    suspend fun  getPostList():List<Post> {
       return apiService.getPosts()
    }
}