package com.example.water_app.map

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface KakaoAPI {
    @GET("v2/local/search/keyword.json") // Keyword.json의 정보를 받아옴
    fun getSearchKeyword(
        @Header("bd5be5c79f704a2ca43de0e810f10a03") key: String, // 카카오 API 인증키
        @Query("query") query: String, // 검색 키워드
        @Query("page") page: Int // 결과 페이지 번호
    ): Call<ResultSearchKeyword> // 받아온 정보가 ResultSearchKeyword 클래스의 구조로 담김
}