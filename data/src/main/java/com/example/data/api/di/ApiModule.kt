package com.example.data.api.di

import com.example.data.api.SignUpWebService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {
    @Provides
    fun provideRetrofit(gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://ecommerce.routemisr.com")
            .addConverterFactory(gsonConverterFactory)
            .build()
    }
    @Provides
    fun provideGsonFactory() : GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Provides
    fun provideUserApi(retrofit: Retrofit): SignUpWebService {
        return retrofit.create(SignUpWebService::class.java)
    }
}