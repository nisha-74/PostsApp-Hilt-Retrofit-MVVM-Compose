package com.example.postsapp.di

import com.example.postsapp.retrofit.ApiService
import com.example.postsapp.retrofit.RetrofitInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //Provide retrofit instance
    @Provides
    @Singleton
    fun provideRetrofitInstance(): RetrofitInstance {
        return RetrofitInstance()

    }

    @Provides
    @Singleton
    fun provideApiService(retrofitInstance: RetrofitInstance): ApiService {
        return retrofitInstance.api
    }
}