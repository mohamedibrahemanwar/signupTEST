package com.example.data.datasource

import com.example.data.model.UserResponse

interface SignupDataSourceContract {
    suspend fun signup() : UserResponse
}