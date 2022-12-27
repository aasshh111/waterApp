package com.example.water_app.repository

import com.example.water_app.vo.CntrData
import com.example.water_app.vo.UserData
import retrofit2.Response

class Repository {

    suspend fun getUser() : Response<UserData> {
        return RetrofitInstance.api.getUser()
    }

    suspend fun getCntr() : Response<CntrData> {
        return RetrofitInstance.api.getCntr()
    }
}