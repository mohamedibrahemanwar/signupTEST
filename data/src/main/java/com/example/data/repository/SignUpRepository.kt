package com.example.data.repository

import com.example.data.datasource.SignupDataSourceContract
import com.example.data.model.UserResponse
import javax.inject.Inject

class SignUpRepository @Inject constructor(
    private val signUpDataSource: SignupDataSourceContract,
) : SignUpRepositoryContract {
    override suspend fun signup(): UserResponse {
    return signUpDataSource.signup()
    }
}