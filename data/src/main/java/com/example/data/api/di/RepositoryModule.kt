package com.example.data.api.di

import com.example.data.api.SignUpWebService
import com.example.data.datasource.SignUpDataSource
import com.example.data.datasource.SignupDataSourceContract
import com.example.data.repository.SignUpRepository
import com.example.data.repository.SignUpRepositoryContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideSignupDataSource(signUpWebService: SignUpWebService): SignupDataSourceContract {
        return SignUpDataSource(signUpWebService)
    }

    @Provides
    @Singleton
    fun provideSignUpRepository(signUpDataSource: SignupDataSourceContract): SignUpRepositoryContract {
        return SignUpRepository(signUpDataSource)
    }
}