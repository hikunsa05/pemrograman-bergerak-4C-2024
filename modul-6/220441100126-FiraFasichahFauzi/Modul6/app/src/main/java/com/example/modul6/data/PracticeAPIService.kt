package com.example.modul6.data

import retrofit2.Call
import retrofit2.http.GET

interface PracticeAPIService {
    @GET("tugas")
    fun getAllPlayer(): Call<PracticeAPIResponse>
}