package com.example.data.datasource

import com.example.data.api.SignUpWebService
import com.example.data.model.UserRequest
import com.example.data.model.UserResponse
import javax.inject.Inject

class SignUpDataSource @Inject constructor(
    private val signUpWebService: SignUpWebService,
    private val userRequest: UserRequest
): SignupDataSourceContract {
    override suspend fun signup(): UserResponse {
        return signUpWebService.signingAPI()
    }
}