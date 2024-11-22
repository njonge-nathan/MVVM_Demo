package com.example.mvvm_demo.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun fetchUserData() : UserData{
        //mock API
        delay(1000)
        return UserData("John",25)
    }
}